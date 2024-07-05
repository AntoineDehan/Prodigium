package net.denlille.prodigium.item;

import net.denlille.prodigium.prodigium;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, prodigium.MODID);

    public static final RegistryObject<CreativeModeTab> PRODIGIUM_TAB = CREATIVE_MODE_TABS.register("prodigium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_COBALT.get()))
                    .title(Component.translatable("creativetab.prodigium_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
