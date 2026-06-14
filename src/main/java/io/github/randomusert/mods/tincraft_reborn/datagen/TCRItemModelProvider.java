package io.github.randomusert.mods.tincraft_reborn.datagen;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.init.TCRBlocks;
import io.github.randomusert.mods.tincraft_reborn.init.TCRItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class TCRItemModelProvider extends ModelProvider{

    public TCRItemModelProvider(PackOutput output) {
        super(output, Tincraft_reborn.MODID);
    }
    
    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(TCRItems.TIN_INGOT.get(), ModelTemplates.FLAT_ITEM);

        // block models
        blockModels.createTrivialCube(TCRBlocks.TIN_BLOCK.get());
        blockModels.createTrivialCube(TCRBlocks.TIN_ORE.get());
    }
}
