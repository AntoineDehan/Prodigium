package net.denlille.prodigium.item;

import net.denlille.prodigium.item.custom.ModToolTiers;
import net.denlille.prodigium.prodigium;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prodigium.MODID);


// Misc items

    // Tokens
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

    // Gates
    public static final RegistryObject<Item>  defender_medal = ITEMS.register("defender_medal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  eternia_crystal = ITEMS.register("eternia_crystal",
            () -> new Item(new Item.Properties()));



// Cobalt

    // Ores and stuff
    public static final RegistryObject<Item>  RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));

    // Tools and armors
    public static final RegistryObject<Item>  COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(ModToolTiers.COBALT,3, -2.4F, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COBALT,1, -2.8F, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(ModToolTiers.COBALT,4.0F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModToolTiers.COBALT,1.5F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ModToolTiers.COBALT,-2, -0.0F, new  Item.Properties()));


// Palladium

    // Ores and stuff
    public static final RegistryObject<Item>  RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_ROD = ITEMS.register("palladium_rod",
            () -> new Item(new Item.Properties()));

    // Tools and armors
    public static final RegistryObject<Item>  PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(ModToolTiers.PALLADIUM,3, -2.4F, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALLADIUM,1, -2.8F, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_AXE = ITEMS.register("palladium_axe",
            () -> new AxeItem(ModToolTiers.PALLADIUM,4.0F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(ModToolTiers.PALLADIUM,1.5F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_HOE = ITEMS.register("palladium_hoe",
            () -> new HoeItem(ModToolTiers.PALLADIUM,-2, -0.0F, new  Item.Properties()));


// Orichalcum

    // Ores and stuff
    public static final RegistryObject<Item>  RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_NUGGET = ITEMS.register("orichalcum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_ROD = ITEMS.register("orichalcum_rod",
            () -> new Item(new Item.Properties()));

    // Tools and armors
    public static final RegistryObject<Item>  ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
            () -> new SwordItem(ModToolTiers.ORICHALCUM,3, -2.4F, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORICHALCUM,1, -2.8F, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
            () -> new AxeItem(ModToolTiers.ORICHALCUM,5.0F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ModToolTiers.ORICHALCUM,1.5F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
            () -> new HoeItem(ModToolTiers.ORICHALCUM,-2, -0.0F, new  Item.Properties()));


// Shroomite

    // Ores and stuff
    public static final RegistryObject<Item>  SHROOMITE_INGOT = ITEMS.register("shroomite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_ROD = ITEMS.register("shroomite_rod",
            () -> new Item(new Item.Properties()));


    // Tools and armors
    public static final RegistryObject<Item>  SHROOMITE_SWORD = ITEMS.register("shroomite_sword",
            () -> new SwordItem(ModToolTiers.SHROOMITE,4, -2.4F, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_PICKAXE = ITEMS.register("shroomite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SHROOMITE,1, -2.8F, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_AXE = ITEMS.register("shroomite_axe",
            () -> new AxeItem(ModToolTiers.SHROOMITE,5.5F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_SHOVEL = ITEMS.register("shroomite_shovel",
            () -> new ShovelItem(ModToolTiers.SHROOMITE,1.5F, -3.0F, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_HOE = ITEMS.register("shroomite_hoe",
            () -> new HoeItem(ModToolTiers.SHROOMITE,-3, -0.0F, new  Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
