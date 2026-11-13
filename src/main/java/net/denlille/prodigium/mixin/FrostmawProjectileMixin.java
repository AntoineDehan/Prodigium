// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.minecraft.world.entity.projectile.AbstractArrow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Mowzie's Mobs 1.8.2 - EntityFrostmaw.hurt(DamageSource, float):
 *   if (source.getDirectEntity() instanceof AbstractArrow) { "undamaged" sound, target shooter, wake up; return false; }
 * Arrows and tridents then bounce off. Making that check false sends them through the normal hurt path.
 * "hurt" is the dev name, "m_6469_" the name in the production jar (no refmap since the target isn't on the classpath).
 * Skipped entirely when Mowzie's Mobs is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "com.bobmowzie.mowziesmobs.server.entity.frostmaw.EntityFrostmaw", remap = false)
public class FrostmawProjectileMixin {

    @Redirect(method = {"hurt", "m_6469_"}, at = @At(value = "CONSTANT", args = "classValue=net/minecraft/world/entity/projectile/AbstractArrow"))
    private boolean prodigium$isArrowImmune(Object directEntity, Class<?> type) {
        if (ProdigiumConfig.SPEC.isLoaded() && ProdigiumConfig.REMOVE_FROSTMAW_PROJECTILE_IMMUNITY.get())
            return false;
        return directEntity instanceof AbstractArrow;
    }
}
