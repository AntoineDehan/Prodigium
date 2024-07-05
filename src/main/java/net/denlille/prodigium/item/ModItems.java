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
    public static final RegistryObject<Item>  TOKEN_MAGE = ITEMS.register("token_mage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  TOKEN_RANGED = ITEMS.register("token_ranged",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RESET_TOKEN_MELEE = ITEMS.register("reset_token_melee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RESET_TOKEN_MAGE = ITEMS.register("reset_token_mage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RESET_TOKEN_RANGED = ITEMS.register("reset_token_ranged",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  defender_medal = ITEMS.register("defender_medal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  eternia_crystal = ITEMS.register("eternia_crystal",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item>  RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item>  RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_ROD = ITEMS.register("palladium_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_NUGGET = ITEMS.register("orichalcum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_ROD = ITEMS.register("orichalcum_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SHROOMITE_INGOT = ITEMS.register("shroomite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_ROD = ITEMS.register("shroomite_rod",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
