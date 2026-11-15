// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.phys.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Terra Curio 0.1.13 - BeeProjectile (spawned by the honey accessories every time the wearer gets hurt):
 *   tick():        addDeltaMovement(toTarget.normalize().scale((1 - dist / 8) * (giant ? 0.3 : 0.1)))   <- only source of speed
 *   onHitEntity(): target.hurt(mobProjectile(this, owner), 5 + (giant ? 1..3 : 0..1))   <- the bee is NOT discarded,
 *                  so it hits every tick it touches something, only limited by the target's invulnerability frames
 * "tick"/"onHitEntity" are the dev names, "m_8119_"/"m_5790_" the names in the production jar
 * (no refmap since the target isn't on the classpath).
 * Skipped entirely when Terra Curio is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "org.confluence.mod.entity.projectile.BeeProjectile", remap = false)
public abstract class BeeProjectileMixin {

    // Tick count from which this bee can hit again
    @Unique
    private int prodigium$nextHitTick;

    @Unique
    private static boolean prodigium$isEnabled() {
        return ProdigiumConfig.SPEC.isLoaded() && ProdigiumConfig.BEES_TWEAK.get();
    }

    // Homing strength (0.1 small, 0.3 giant), the only constants with these values in tick()
    @ModifyConstant(method = {"tick", "m_8119_"}, constant = {@Constant(doubleValue = 0.1D), @Constant(doubleValue = 0.3D)})
    private double prodigium$scaleHoming(double strength) {
        if (!prodigium$isEnabled())
            return strength;
        return strength * ProdigiumConfig.BEES_SPEED_MULTIPLIER.get();
    }

    // Skips the whole hit (damage and giant bee knockback) on non-monsters or while on cooldown
    @Inject(method = {"onHitEntity", "m_5790_"}, at = @At("HEAD"), cancellable = true)
    private void prodigium$filterHit(EntityHitResult result, CallbackInfo ci) {
        if (!prodigium$isEnabled())
            return;
        if (ProdigiumConfig.BEES_ONLY_HIT_ENEMIES.get() && !(result.getEntity() instanceof Enemy))
            ci.cancel();
        else if (((Entity) (Object) this).tickCount < prodigium$nextHitTick)
            ci.cancel();
    }

    // The cooldown only starts on a hit that lands, a hit blocked by invulnerability frames is retried next tick
    @Redirect(method = {"onHitEntity", "m_5790_"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", remap = true))
    private boolean prodigium$hurt(Entity target, DamageSource source, float amount) {
        if (!prodigium$isEnabled())
            return target.hurt(source, amount);

        boolean hit = target.hurt(source, (float) (amount * ProdigiumConfig.BEES_DAMAGE_MULTIPLIER.get()));
        if (hit)
            prodigium$nextHitTick = ((Entity) (Object) this).tickCount + ProdigiumConfig.BEES_HIT_COOLDOWN.get();
        return hit;
    }
}
