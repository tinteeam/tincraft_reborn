package io.github.randomusert.mods.tincraft_reborn.init;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.items.TinIngot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TCRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tincraft_reborn.MODID);

    //register tin ingot
    public static final DeferredItem<TinIngot> TIN_INGOT = ITEMS.registerItem(
            "tin_ingot",
            TinIngot::new,
            new Item.Properties().rarity(Rarity.COMMON)
    );

    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM = ITEMS.register("tin_block",
            () -> new BlockItem(TCRBlocks.TIN_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore",
            () -> new BlockItem(TCRBlocks.TIN_ORE.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
