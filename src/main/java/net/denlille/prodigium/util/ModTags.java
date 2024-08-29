package net.denlille.prodigium.util;

import net.denlille.prodigium.prodigium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

    public static final TagKey<Block> NEEDS_COBALT_TOOL = tag("needs_cobalt_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_TOOL = tag("needs_palladium_tool");
        public static final TagKey<Block> NEEDS_ORICHALCUM_TOOL = tag("needs_orichalcum_tool");
        public static final TagKey<Block> NEEDS_SHROOMITE_TOOL = tag("needs_shroomite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(prodigium.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(prodigium.MODID, name));
        }
        public static final TagKey<Item> ITEM_IMMUNE = tag("immune");
        public static final TagKey<Item> ITEM_GLOWING = tag("glow");
        public static final TagKey<Item> ITEM_FLOATING = tag("float");

        public static boolean tagEnabled(ItemStack item, String tagName, TagKey<Item> tag) {
            return item.getOrCreateTag().getBoolean(tagName) || item.is(tag);
        }
    }

}
