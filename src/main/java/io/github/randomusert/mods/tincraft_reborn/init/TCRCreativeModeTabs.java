package io.github.randomusert.mods.tincraft_reborn.init;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TCRCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tincraft_reborn.MODID);

    public static final Supplier<CreativeModeTab> TINCRAFT_REBORN_MAIN_TAB = CREATIVE_MODE_TAB.register("main_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TCRItems.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.tincraft_reborn.main"))
                    .displayItems((itemDisplayParameter, output) -> {
                        output.accept(TCRItems.TIN_INGOT);
                        output.accept(TCRBlocks.TIN_BLOCK);
                        output.accept(TCRBlocks.TIN_ORE);
                        output.accept(TCRBlocks.TIN_UPGRADE_TRADING_STATION);
                        output.accept(TCRBlocks.TIN_FURNACE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
