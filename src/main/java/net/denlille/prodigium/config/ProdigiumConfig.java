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

    // Bosses of Mass Destruction - Nether Gauntlet laser
    public static final ForgeConfigSpec.BooleanValue NETHER_GAUNTLET_TWEAK;
    public static final ForgeConfigSpec.DoubleValue NETHER_GAUNTLET_LASER_DAMAGE_MULTIPLIER;

    // Boss projectile immunities (arrows and tridents bouncing off)
    public static final ForgeConfigSpec.BooleanValue REMOVE_FROSTMAW_PROJECTILE_IMMUNITY;
    public static final ForgeConfigSpec.BooleanValue REMOVE_HARBINGER_PROJECTILE_IMMUNITY;

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

        builder.comment("Fix for the Nether Gauntlet laser from Bosses of Mass Destruction",
                        "(the original laser permanently inflates the boss attack damage when it has attribute modifiers)")
                .push("nether_gauntlet");
        NETHER_GAUNTLET_TWEAK = builder
                .comment("Enable the fix. If false, the original Bosses of Mass Destruction behaviour is kept.")
                .define("enabled", true);
        NETHER_GAUNTLET_LASER_DAMAGE_MULTIPLIER = builder
                .comment("Laser damage per hit, as a fraction of the Gauntlet's attack damage (BOMD uses 0.75).")
                .defineInRange("laserDamageMultiplier", 0.75D, 0.0D, 10.0D);
        builder.pop();

        builder.comment("Remove the immunity of some modded bosses to arrows and tridents (the projectile bounces off)")
                .push("projectile_immunity");
        REMOVE_FROSTMAW_PROJECTILE_IMMUNITY = builder
                .comment("Remove Frostmaw's (Mowzie's Mobs) immunity to arrows and tridents.")
                .define("removeFrostmaw", true);
        REMOVE_HARBINGER_PROJECTILE_IMMUNITY = builder
                .comment("Remove The Harbinger's (Cataclysm) immunity to arrows and tridents in its second phase (below 50% health).",
                        "Its long range immunity is configured in cataclysm.toml (\"The Harbinger's prevent attacks from far away Range\").")
                .define("removeHarbinger", true);
        builder.pop();

        SPEC = builder.build();
    }
}
