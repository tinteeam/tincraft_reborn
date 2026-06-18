package io.github.randomusert.mods.tincraft_reborn.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.api.TCRRegistrate;
import io.github.randomusert.mods.tincraft_reborn.blocks.*;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TCRBlocks {

    private static final Registrate REGISTRATE = Tincraft_reborn.registrate();




    public static final BlockEntry<TinBlock> TIN_BLOCK = REGISTRATE.block("tin_block", TinBlock::new)
            .lang("Block of Tin")
            .simpleItem()
            .register();

    public static final BlockEntry<TinOre> TIN_ORE = REGISTRATE.block("tin_ore", TinOre::new)
            .simpleItem()
            .register();

    public static final BlockEntry<TestBlock> TEST_BLOCK = REGISTRATE.block("test_block", TestBlock::new)
            .simpleItem()
            .register();
    public static final BlockEntry<TinFurnaceBlock> TIN_FURNACE = REGISTRATE.block("tin_furnace", TinFurnaceBlock::new)
            .simpleItem()
            .register();


    public static final BlockEntry<TinUpgradeTradingStation> TIN_UPGRADE_TRADING_STATION = REGISTRATE.block("tin_upgrade_trading_station", TinUpgradeTradingStation::new)
            .simpleItem()
            .register();
    public static void register() {

    }
}
