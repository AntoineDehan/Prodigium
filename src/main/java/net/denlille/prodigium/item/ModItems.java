package net.denlille.prodigium.item;

import net.denlille.prodigium.item.custom.ModArmorMaterials;
import net.denlille.prodigium.item.custom.ModToolTiers;
import net.denlille.prodigium.prodigium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prodigium.MODID);

    // Tags




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

    // Treasure Bags
    public static final RegistryObject<Item>  conjurer_treasure_bag = ITEMS.register("conjurer_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  sunbird_treasure_bag = ITEMS.register("sunbird_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  dead_king_treasure_bag = ITEMS.register("dead_king_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  frostmaw_treasure_bag = ITEMS.register("frostmaw_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  awful_ghast_treasure_bag = ITEMS.register("awful_ghast_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  nether_keeper_treasure_bag = ITEMS.register("nether_keeper_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  nether_gauntlet_treasure_bag = ITEMS.register("nether_gauntlet_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  netherite_monstrosity_treasure_bag = ITEMS.register("netherite_monstrosity_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  slider_treasure_bag = ITEMS.register("slider_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  valkyrie_queen_treasure_bag = ITEMS.register("valkyrie_queen_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  night_lich_treasure_bag = ITEMS.register("night_lich_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  void_blossom_treasure_bag = ITEMS.register("void_blossom_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  sun_spirit_treasure_bag = ITEMS.register("sun_spirit_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  leviathan_treasure_bag = ITEMS.register("leviathan_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  harbinger_treasure_bag = ITEMS.register("harbinger_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ignis_treasure_bag = ITEMS.register("ignis_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  obsidilith_treasure_bag = ITEMS.register("obsidilith_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  void_worm_treasure_bag = ITEMS.register("void_worm_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  anciant_remnant_treasure_bag = ITEMS.register("ancient_remnant_treasure_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ender_guardian_treasure_bag = ITEMS.register("ender_guardian_treasure_bag",
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

    public static final RegistryObject<Item>  COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(ModArmorMaterials.COBALT,ArmorItem.Type.HELMET, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COBALT,ArmorItem.Type.CHESTPLATE, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(ModArmorMaterials.COBALT,ArmorItem.Type.LEGGINGS, new  Item.Properties()));
    public static final RegistryObject<Item>  COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(ModArmorMaterials.COBALT,ArmorItem.Type.BOOTS, new  Item.Properties()));


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
    public static final RegistryObject<Item>  PALLADIUM_BOW = ITEMS.register("palladium_bow",
            () -> new BowItem(new Item.Properties().durability(615)));

    public static final RegistryObject<Item>  PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM,ArmorItem.Type.HELMET, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM,ArmorItem.Type.CHESTPLATE, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM,ArmorItem.Type.LEGGINGS, new  Item.Properties()));
    public static final RegistryObject<Item>  PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM,ArmorItem.Type.BOOTS, new  Item.Properties()));


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
    public static final RegistryObject<Item>  ORICHALCUM_BOW = ITEMS.register("orichalcum_bow",
            () -> new BowItem(new Item.Properties().durability(825)));


    public static final RegistryObject<Item>  ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM,ArmorItem.Type.HELMET, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM,ArmorItem.Type.CHESTPLATE, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM,ArmorItem.Type.LEGGINGS, new  Item.Properties()));
    public static final RegistryObject<Item>  ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM,ArmorItem.Type.BOOTS, new  Item.Properties()));


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
    public static final RegistryObject<Item>  SHROOMITE_BOW = ITEMS.register("shroomite_bow",
            () -> new BowItem(new Item.Properties().durability(1250)));

    public static final RegistryObject<Item>  SHROOMITE_HELMET = ITEMS.register("shroomite_helmet",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE,ArmorItem.Type.HELMET, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_CHESTPLATE = ITEMS.register("shroomite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE,ArmorItem.Type.CHESTPLATE, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_LEGGINGS = ITEMS.register("shroomite_leggings",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE,ArmorItem.Type.LEGGINGS, new  Item.Properties()));
    public static final RegistryObject<Item>  SHROOMITE_BOOTS = ITEMS.register("shroomite_boots",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE,ArmorItem.Type.BOOTS, new  Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
