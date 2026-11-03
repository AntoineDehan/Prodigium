// This file was made with Claude Code
package net.denlille.prodigium.compat.confluence;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Logic behind BrainOfConfusionMixin: Terra Curio confuses nearby enemies on (almost) every hit
 * for 4.5 to 15 seconds. We replace that with a chance roll, a per-wearer cooldown and a duration cap.
 */
public class BrainOfConfusionTweak {
    // Game time of the last proc for each wearer
    private static final Map<LivingEntity, Long> LAST_PROC = new WeakHashMap<>();

    public static boolean isEnabled() {
        return ProdigiumConfig.SPEC.isLoaded() && ProdigiumConfig.BRAIN_OF_CONFUSION_TWEAK.get();
    }

    public static boolean tryProc(LivingEntity wearer, RandomSource random) {
        long now = wearer.level().getGameTime();
        Long last = LAST_PROC.get(wearer);
        if (last != null && now - last < ProdigiumConfig.BRAIN_OF_CONFUSION_COOLDOWN.get())
            return false;

        if (random.nextFloat() >= ProdigiumConfig.BRAIN_OF_CONFUSION_CHANCE.get())
            return false;

        LAST_PROC.put(wearer, now);
        return true;
    }

    public static int capDuration(int duration) {
        return Math.min(duration, ProdigiumConfig.BRAIN_OF_CONFUSION_MAX_DURATION.get());
    }
}
