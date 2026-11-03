// This file was made with Claude Code
package net.denlille.prodigium.mixin;

import net.denlille.prodigium.compat.confluence.BrainOfConfusionTweak;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Terra Curio 0.1.13 - BrainOfConfusion.apply(LivingEntity, RandomSource, float):
 *   if (random.nextFloat() < 0.6F + amount * 0.02F) { ... int duration = ...; confuse nearby enemies for duration }
 *   if (random.nextFloat() < 0.1667F) { Cerebral Mindtrick + negate damage }  <- left untouched
 * Skipped entirely when Terra Curio is not installed (@Pseudo).
 */
@Pseudo
@Mixin(targets = "org.confluence.mod.item.curio.expert.BrainOfConfusion", remap = false)
public class BrainOfConfusionMixin {

    // First nextFloat() is the confusion roll: return 0 to force the proc, MAX_VALUE to skip it
    @Redirect(method = "apply", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/RandomSource;nextFloat()F", ordinal = 0, remap = true))
    private static float prodigium$confusionRoll(RandomSource random, LivingEntity living, RandomSource randomArg, float amount) {
        if (!BrainOfConfusionTweak.isEnabled())
            return random.nextFloat();
        return BrainOfConfusionTweak.tryProc(living, random) ? 0.0F : Float.MAX_VALUE;
    }

    // Third int local is the Confused effect duration (ticks)
    @ModifyVariable(method = "apply", at = @At("STORE"), ordinal = 2)
    private static int prodigium$capConfusionDuration(int duration) {
        if (!BrainOfConfusionTweak.isEnabled())
            return duration;
        return BrainOfConfusionTweak.capDuration(duration);
    }
}
