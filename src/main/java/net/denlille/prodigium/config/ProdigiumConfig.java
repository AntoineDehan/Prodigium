// This file was made with Claude Code
package net.denlille.prodigium.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ProdigiumConfig {
    public static final ForgeConfigSpec SPEC;

    // Terra Curio (Confluence) - Brain of Confusion
    public static final ForgeConfigSpec.BooleanValue BRAIN_OF_CONFUSION_TWEAK;
    public static final ForgeConfigSpec.DoubleValue BRAIN_OF_CONFUSION_CHANCE;
    public static final ForgeConfigSpec.IntValue BRAIN_OF_CONFUSION_MAX_DURATION;
    public static final ForgeConfigSpec.IntValue BRAIN_OF_CONFUSION_COOLDOWN;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Tweaks applied to the Brain of Confusion accessory from Terra Curio (Confluence)")
                .push("brain_of_confusion");
        BRAIN_OF_CONFUSION_TWEAK = builder
                .comment("Enable the tweak. If false, the original Terra Curio behaviour is kept.")
                .define("enabled", true);
        BRAIN_OF_CONFUSION_CHANCE = builder
                .comment("Chance (0.0 - 1.0) to confuse nearby enemies when the wearer gets hurt.")
                .defineInRange("chance", 0.2D, 0.0D, 1.0D);
        BRAIN_OF_CONFUSION_MAX_DURATION = builder
                .comment("Maximum duration of the Confused effect, in ticks (20 ticks = 1 second).")
                .defineInRange("maxDurationTicks", 40, 1, 72000);
        BRAIN_OF_CONFUSION_COOLDOWN = builder
                .comment("Cooldown between two procs for the same wearer, in ticks (20 ticks = 1 second).")
                .defineInRange("cooldownTicks", 100, 0, 72000);
        builder.pop();

        SPEC = builder.build();
    }
}
