// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.compat.bomd.NetherGauntletLaserTweak;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Bosses of Mass Destruction 1.1.2 - LaserAction.applyLaserToEntities(Vec3), for each entity in the laser:
 *   double atk = gauntlet.getAttributeValue(ATTACK_DAMAGE);   // total, modifiers included
 *   attackAttribute.setBaseValue(atk * 0.75);
 *   gauntlet.doHurtTarget(target);
 *   attackAttribute.setBaseValue(atk);                        // base := total -> grows every tick
 * Skipped entirely when BOMD is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "com.cerbon.bosses_of_mass_destruction.entity.custom.gauntlet.LaserAction", remap = false)
public class NetherGauntletLaserMixin {

    @Inject(method = "applyLaserToEntities", at = @At("HEAD"))
    private void prodigium$laserStart(CallbackInfo ci) {
        NetherGauntletLaserTweak.setLaserHitting(true);
    }

    @Inject(method = "applyLaserToEntities", at = @At("RETURN"))
    private void prodigium$laserEnd(CallbackInfo ci) {
        NetherGauntletLaserTweak.setLaserHitting(false);
    }

    // Both setBaseValue calls: leave the Gauntlet attack untouched, damage is scaled in NetherGauntletLaserTweak
    @Redirect(method = "applyLaserToEntities", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", remap = true))
    private void prodigium$keepBaseAttack(AttributeInstance attribute, double value) {
        if (!NetherGauntletLaserTweak.isEnabled())
            attribute.setBaseValue(value);
    }
}
