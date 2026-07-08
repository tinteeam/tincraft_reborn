package io.github.randomusert.mods.tincraft_reborn.init;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.menus.UltraCraftingMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TCRMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(BuiltInRegistries.MENU, Tincraft_reborn.MODID);

    public static final Supplier<MenuType<UltraCraftingMenu>> ULTRA_CRAFTING_MENU =
            MENU_TYPES.register("ultra_crafting_menu",
                    () -> new MenuType<>(UltraCraftingMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static void register(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }

}
