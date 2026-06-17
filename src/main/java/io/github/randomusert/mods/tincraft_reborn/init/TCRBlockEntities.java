package io.github.randomusert.mods.tincraft_reborn.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.blocks.entity.TestBlockEntity;
import io.github.randomusert.mods.tincraft_reborn.blocks.entity.TinFurnaceEntity;
import net.minecraft.world.level.block.Block;

public class TCRBlockEntities {
    private static final Registrate REGISTRATE = Tincraft_reborn.registrate();


    public static final BlockEntityEntry<TestBlockEntity> TEST_BLOCK_ENTITY = REGISTRATE.blockEntity("test_block", TestBlockEntity::new)
            .validBlock(TCRBlocks.TEST_BLOCK)
            .register();

    public static final BlockEntityEntry<TinFurnaceEntity> TIN_FURNACE_ENTITY = REGISTRATE.blockEntity("tin_furnace", TinFurnaceEntity::new)
            .validBlock(TCRBlocks.TIN_FURNACE)
            .register();



    // Required empty method. This makes sure that this class gets called
    public static void register() {}
}
