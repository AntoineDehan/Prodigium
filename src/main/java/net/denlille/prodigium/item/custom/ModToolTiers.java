package net.denlille.prodigium.item.custom;

import net.denlille.prodigium.item.ModItems;
import net.denlille.prodigium.prodigium;
import net.denlille.prodigium.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    // Cobalt
    public static final Tier COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 450,6.0F,2.0F,11,
                    ModTags.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(ModItems.COBALT_INGOT.get())),
            new ResourceLocation(prodigium.MODID, "cobalt"), List.of(Tiers.IRON), List.of());

    // Palladium
    public static final Tier PALLADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 850,7.0F,2.0F,13,
                    ModTags.Blocks.NEEDS_PALLADIUM_TOOL, () -> Ingredient.of(ModItems.PALLADIUM_INGOT.get())),
            new ResourceLocation(prodigium.MODID, "palladium"), List.of(Tiers.IRON), List.of());

    // Orichalcum
    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1750,9.0F,3.0F,20,
                    ModTags.Blocks.NEEDS_ORICHALCUM_TOOL, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
            new ResourceLocation(prodigium.MODID, "orichalcum"), List.of(Tiers.DIAMOND), List.of());

    // Shroomite
    public static final Tier SHROOMITE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2150,9.0F,3.0F,17,
                    ModTags.Blocks.NEEDS_SHROOMITE_TOOL, () -> Ingredient.of(ModItems.SHROOMITE_INGOT.get())),
            new ResourceLocation(prodigium.MODID, "shroomite"), List.of(Tiers.DIAMOND), List.of());
}
