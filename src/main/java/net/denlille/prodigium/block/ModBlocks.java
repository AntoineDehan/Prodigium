package net.denlille.prodigium.block;

import net.denlille.prodigium.item.ModItems;
import net.denlille.prodigium.prodigium;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, prodigium.MODID);

    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)));

    public static final RegistryObject<Block> DEEPSLATE_PALLADIUM_ORE = registerBlock("deepslate_palladium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PALLADIUM_ORE = registerBlock("palladium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)));

    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,8)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item>  registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
