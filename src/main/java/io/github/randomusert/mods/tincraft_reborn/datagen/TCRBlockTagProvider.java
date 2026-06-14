package io.github.randomusert.mods.tincraft_reborn.datagen;

import java.util.concurrent.CompletableFuture;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.init.TCRBlocks;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class TCRBlockTagProvider extends BlockTagsProvider {

    public TCRBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
        super(output, lookupProvider, Tincraft_reborn.MODID);
    }

    @Override
    protected void addTags(Provider arg0) {
       tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TCRBlocks.TIN_BLOCK.get())
                .add(TCRBlocks.TIN_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(TCRBlocks.TIN_BLOCK.get())
                .add(TCRBlocks.TIN_ORE.get());
    }
    
}
