// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Lost Aether Content 1.2.3 - AerwhaleKingEntity.hurt(DamageSource, float):
 *   if (source.is(IS_PROJECTILE) || source.is(WITCH_RESISTANT_TO)) { spawnAnim(); return false; }
 *   then 30% damage capped at 5, or full damage capped at 18 while stunned (3s after a charge)
 * Every projectile bounces off. Answering false to the IS_PROJECTILE check only lets them follow the melee rules;
 * the other tag checks (bypasses invulnerability, magic) are left untouched.
 * "hurt" is the dev name, "m_6469_" the name in the production jar (no refmap since the target isn't on the classpath).
 * Skipped entirely when Lost Aether Content is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "com.legacy.lost_aether.entity.AerwhaleKingEntity", remap = false)
public abstract class AerwhaleKingProjectileMixin {

    @Shadow
    public abstract boolean isStunned();

    @Redirect(method = {"hurt", "m_6469_"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/damagesource/DamageSource;is(Lnet/minecraft/tags/TagKey;)Z", remap = true))
    private boolean prodigium$isDamageTag(DamageSource source, TagKey<DamageType> tag) {
        if (tag == DamageTypeTags.IS_PROJECTILE && ProdigiumConfig.SPEC.isLoaded()
                && ProdigiumConfig.REMOVE_AERWHALE_KING_PROJECTILE_IMMUNITY.get()
                && (!ProdigiumConfig.AERWHALE_KING_PROJECTILES_ONLY_WHEN_STUNNED.get() || isStunned()))
            return false;
        return source.is(tag);
    }
}
