package io.github.randomusert.mods.tincraft_reborn.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.api.TCRRegistrate;
import io.github.randomusert.mods.tincraft_reborn.blocks.TestBlock;
import io.github.randomusert.mods.tincraft_reborn.blocks.TinBlock;
import io.github.randomusert.mods.tincraft_reborn.blocks.TinFurnaceBlock;
import io.github.randomusert.mods.tincraft_reborn.blocks.TinOre;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TCRBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Tincraft_reborn.MODID);
    private static final Registrate REGISTRATE = Tincraft_reborn.registrate();



    public static final DeferredBlock<Block> TIN_BLOCK = BLOCKS.register("tin_block",
            registryName -> new TinBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.5f)
                    .sound(SoundType.STONE)
                    .explosionResistance(0.1f)
                    ));


    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.register("tin_ore",
            registryName -> new TinOre(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.5f)
                    .sound(SoundType.STONE)
                    .explosionResistance(0.1f)
                    ));


    public static final BlockEntry<TestBlock> TEST_BLOCK = REGISTRATE.block("test_block", TestBlock::new)
            .simpleItem()
            .register();
    public static final BlockEntry<TinFurnaceBlock> TIN_FURNACE = REGISTRATE.block("tin_furnace", TinFurnaceBlock::new)
            .simpleItem()
            .register();

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
