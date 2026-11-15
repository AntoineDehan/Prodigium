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

    // Terra Curio (Confluence) - Bees spawned by the honey accessories
    public static final ForgeConfigSpec.BooleanValue BEES_TWEAK;
    public static final ForgeConfigSpec.DoubleValue BEES_DAMAGE_MULTIPLIER;
    public static final ForgeConfigSpec.DoubleValue BEES_SPEED_MULTIPLIER;
    public static final ForgeConfigSpec.IntValue BEES_HIT_COOLDOWN;
    public static final ForgeConfigSpec.BooleanValue BEES_ONLY_HIT_ENEMIES;

    // Bosses of Mass Destruction - Nether Gauntlet laser
    public static final ForgeConfigSpec.BooleanValue NETHER_GAUNTLET_TWEAK;
    public static final ForgeConfigSpec.DoubleValue NETHER_GAUNTLET_LASER_DAMAGE_MULTIPLIER;

    // Boss projectile immunities (arrows and tridents bouncing off)
    public static final ForgeConfigSpec.BooleanValue REMOVE_FROSTMAW_PROJECTILE_IMMUNITY;
    public static final ForgeConfigSpec.BooleanValue REMOVE_HARBINGER_PROJECTILE_IMMUNITY;
    public static final ForgeConfigSpec.BooleanValue REMOVE_AERWHALE_KING_PROJECTILE_IMMUNITY;
    public static final ForgeConfigSpec.BooleanValue AERWHALE_KING_PROJECTILES_ONLY_WHEN_STUNNED;

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

        builder.comment("Tweaks applied to the bees spawned by the Terra Curio (Confluence) honey accessories",
                        "(Honey Comb, Bee Cloak, Stinger/Sweetheart Necklace, Honey/Amber Horseshoe Balloon, Hive Pack)")
                .push("bees");
        BEES_TWEAK = builder
                .comment("Enable the tweak. If false, the original Terra Curio behaviour is kept.")
                .define("enabled", true);
        BEES_DAMAGE_MULTIPLIER = builder
                .comment("Bee damage multiplier.")
                .defineInRange("damageMultiplier", 0.5D, 0.0D, 10.0D);
        BEES_SPEED_MULTIPLIER = builder
                .comment("Bee speed multiplier (scales its homing acceleration, which is its only source of speed).")
                .defineInRange("speedMultiplier", 0.7D, 0.0D, 10.0D);
        BEES_HIT_COOLDOWN = builder
                .comment("Minimum ticks between two hits of the same bee (20 ticks = 1 second).",
                        "A bee alone is otherwise limited by the target's invulnerability frames (about 10 ticks).")
                .defineInRange("hitCooldownTicks", 13, 0, 1200);
        BEES_ONLY_HIT_ENEMIES = builder
                .comment("Bees only hurt monsters (originally they hurt any entity they touch except their owner).")
                .define("onlyHitEnemies", true);
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
        REMOVE_AERWHALE_KING_PROJECTILE_IMMUNITY = builder
                .comment("Remove the Aerwhale King's (Lost Content) immunity to projectiles.",
                        "Projectiles then follow its melee rules: 30% damage capped at 5 per hit, full damage capped at 18 while stunned.")
                .define("removeAerwhaleKing", true);
        AERWHALE_KING_PROJECTILES_ONLY_WHEN_STUNNED = builder
                .comment("Only let projectiles hit the Aerwhale King while it is stunned after a charge (3 seconds).")
                .define("aerwhaleKingOnlyWhenStunned", false);
        builder.pop();

        SPEC = builder.build();
    }
}
