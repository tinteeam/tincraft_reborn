package io.github.randomusert.mods.tincraft_reborn.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.items.TinIngot;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TCRItems {

    private static final Registrate REGISTRATE = Tincraft_reborn.registrate();



    public static final ItemEntry<TinIngot> TIN_INGOT = REGISTRATE.item("tin_ingot", properties -> new TinIngot(properties.rarity(Rarity.COMMON)))
            .register();




    public static void register() {

    }
}
