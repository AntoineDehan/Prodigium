// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.minecraft.world.entity.projectile.AbstractArrow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Cataclysm 2.56 - The_Harbinger_Entity.hurt(DamageSource, float):
 *   if (isPowered() && source.getDirectEntity() instanceof AbstractArrow) return false;   // isPowered = health <= 50%
 * Arrows and tridents then bounce off in its second phase. Making that check false lets them hit.
 * The long range immunity and the deactivated immunity are left untouched.
 * "hurt" is the dev name, "m_6469_" the name in the production jar (no refmap since the target isn't on the classpath).
 * Skipped entirely when Cataclysm is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "com.github.L_Ender.cataclysm.entity.AnimationMonster.BossMonsters.The_Harbinger_Entity", remap = false)
public class HarbingerProjectileMixin {

    @Redirect(method = {"hurt", "m_6469_"}, at = @At(value = "CONSTANT", args = "classValue=net/minecraft/world/entity/projectile/AbstractArrow"))
    private boolean prodigium$isArrowImmune(Object directEntity, Class<?> type) {
        if (ProdigiumConfig.SPEC.isLoaded() && ProdigiumConfig.REMOVE_HARBINGER_PROJECTILE_IMMUNITY.get())
            return false;
        return directEntity instanceof AbstractArrow;
    }
}
