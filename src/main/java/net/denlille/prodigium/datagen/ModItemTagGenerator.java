package net.denlille.prodigium.datagen;

import net.denlille.prodigium.item.ModItems;
import net.denlille.prodigium.prodigium;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, prodigium.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
    this.tag(ItemTags.TRIMMABLE_ARMOR)
            .add(ModItems.COBALT_HELMET.get(),
                    ModItems.COBALT_CHESTPLATE.get(),
                    ModItems.COBALT_LEGGINGS.get(),
                    ModItems.COBALT_BOOTS.get(),

                    ModItems.PALLADIUM_CHESTPLATE.get(),
                    ModItems.PALLADIUM_CHESTPLATE.get(),
                    ModItems.PALLADIUM_LEGGINGS.get(),
                    ModItems.PALLADIUM_BOOTS.get(),

                    ModItems.ORICHALCUM_CHESTPLATE.get(),
                    ModItems.ORICHALCUM_CHESTPLATE.get(),
                    ModItems.ORICHALCUM_LEGGINGS.get(),
                    ModItems.ORICHALCUM_BOOTS.get(),

                ModItems.SHROOMITE_CHESTPLATE.get(),
                ModItems.SHROOMITE_CHESTPLATE.get(),
                ModItems.SHROOMITE_LEGGINGS.get(),
                ModItems.SHROOMITE_BOOTS.get());


    }
}
