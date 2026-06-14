package io.github.randomusert.mods.tincraft_reborn.datagen;

import java.util.Set;

import io.github.randomusert.mods.tincraft_reborn.init.TCRBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TCRBlockLootTableProvider extends BlockLootSubProvider {

    protected TCRBlockLootTableProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
        
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        // The contents of our DeferredRegister.
        return TCRBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();  
    }


    @Override
    protected void generate() {
        dropSelf(TCRBlocks.TIN_BLOCK.get());
        dropSelf(TCRBlocks.TIN_ORE.get());
    }
    
}
