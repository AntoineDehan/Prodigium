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
    public static final Tier COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 450,6.0F,2.0F,11,
                    ModTags.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(ModItems.COBALT_INGOT.get())),
            new ResourceLocation(prodigium.MODID, "cobalt"), List.of(Tiers.IRON), List.of());

}
