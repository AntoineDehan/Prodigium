// This file was made with Claude Code
package net.denlille.prodigium.compat.bomd;

import net.denlille.prodigium.config.ProdigiumConfig;
import net.denlille.prodigium.prodigium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Logic behind NetherGauntletLaserMixin. BOMD's laser lowers the Gauntlet base attack to 75% of its TOTAL attack,
 * hits, then sets the base back to that total: with any attack modifier the base grows every tick (one-shots,
 * bypasses i-frames since each hit is stronger than the last, and stays saved on the boss).
 * The mixin stops the base from being touched; the laser multiplier is applied here instead.
 */
@Mod.EventBusSubscriber(modid = prodigium.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NetherGauntletLaserTweak {
    private static final ResourceLocation GAUNTLET = new ResourceLocation("bosses_of_mass_destruction", "gauntlet");

    // True while LaserAction.applyLaserToEntities is hitting entities (server thread only)
    private static boolean laserHitting = false;

    public static boolean isEnabled() {
        return ProdigiumConfig.SPEC.isLoaded() && ProdigiumConfig.NETHER_GAUNTLET_TWEAK.get();
    }

    public static void setLaserHitting(boolean hitting) {
        laserHitting = hitting;
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingHurt(LivingHurtEvent event) {
        if (!laserHitting || !isEnabled())
            return;

        Entity attacker = event.getSource().getEntity();
        if (attacker == null || !GAUNTLET.equals(ForgeRegistries.ENTITY_TYPES.getKey(attacker.getType())))
            return;

        event.setAmount((float) (event.getAmount() * ProdigiumConfig.NETHER_GAUNTLET_LASER_DAMAGE_MULTIPLIER.get()));
    }
}
