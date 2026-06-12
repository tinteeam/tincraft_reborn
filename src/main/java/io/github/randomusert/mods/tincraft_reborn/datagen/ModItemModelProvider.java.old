package io.github.randomusert.mods.tincraft_reborn.datagen;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.init.TCRItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Tincraft_reborn.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(TCRItems.TIN_INGOT.get());
    }
}