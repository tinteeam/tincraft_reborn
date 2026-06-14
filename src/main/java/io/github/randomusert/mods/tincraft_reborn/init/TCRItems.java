package io.github.randomusert.mods.tincraft_reborn.init;

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
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tincraft_reborn.MODID);

    //register tin ingot
    public static final DeferredItem<TinIngot> TIN_INGOT = ITEMS.registerItem("tin_ingot", 
        properties -> new TinIngot(properties.rarity(Rarity.COMMON)));

    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("tin_block", TCRBlocks.TIN_BLOCK);

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("tin_ore", TCRBlocks.TIN_ORE);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
