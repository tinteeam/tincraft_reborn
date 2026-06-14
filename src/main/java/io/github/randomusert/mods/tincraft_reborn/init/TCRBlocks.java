package io.github.randomusert.mods.tincraft_reborn.init;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.blocks.TinBlock;
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

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
