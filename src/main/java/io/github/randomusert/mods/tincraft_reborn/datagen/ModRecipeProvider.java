package io.github.randomusert.mods.tincraft_reborn.datagen;

import io.github.randomusert.mods.tincraft_reborn.init.TCRBlocks;
import io.github.randomusert.mods.tincraft_reborn.init.TCRItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TCRItems.TIN_INGOT, 9)
                .requires(TCRBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_block", has(TCRBlocks.TIN_BLOCK))
                .save(recipeOutput, "tin_block_to_tin_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TCRBlocks.TIN_BLOCK)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', TCRItems.TIN_INGOT)
                .unlockedBy("has_tin_ingot", has(TCRItems.TIN_INGOT))
                .save(recipeOutput);

        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(TCRBlocks.TIN_ORE),
                        RecipeCategory.MISC,
                        TCRItems.TIN_INGOT,
                        0.1f,
                        200
                )
                .unlockedBy("has_tin_ore", has(TCRBlocks.TIN_ORE))
                .save(recipeOutput, "tin_ore_to_tin_ingot");
    }
}