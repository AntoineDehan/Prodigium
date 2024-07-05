package net.denlille.prodigium.item;

import net.denlille.prodigium.prodigium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prodigium.MODID);

    public static final RegistryObject<Item>  TOKEN_MELEE = ITEMS.register("token_melee",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
