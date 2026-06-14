package io.github.randomusert.mods.tincraft_reborn.datagen;

import java.util.concurrent.CompletableFuture;

import io.github.randomusert.mods.tincraft_reborn.init.TCRBlocks;
import io.github.randomusert.mods.tincraft_reborn.init.TCRItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;

public class TCRRecipeProvider extends RecipeProvider {
    public TCRRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
      ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM),RecipeCategory.MISC, TCRItems.TIN_INGOT, 9)
                .requires(TCRBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_block", has(TCRBlocks.TIN_BLOCK))
                .save(this.output, "tin_block_to_tin_ingot");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, TCRBlocks.TIN_BLOCK)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', TCRItems.TIN_INGOT)
                .unlockedBy("has_tin_ingot", has(TCRItems.TIN_INGOT))
                .save(this.output);

        SimpleCookingRecipeBuilder.smelting(
            Ingredient.of(TCRBlocks.TIN_ORE), RecipeCategory.MISC, CookingBookCategory.MISC, TCRItems.TIN_INGOT, 0.1f, 200)
            .unlockedBy("has_tin_ore", has(TCRBlocks.TIN_ORE))
            .save(this.output, "smelting_tin_ore_to_tin_ingot");
    }

    
    public static class Runner extends RecipeProvider.Runner {
        // Get the parameters from the `GatherDataEvent`s.
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new TCRRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            
            return "Tincraft Reborn Recipes";
        }
    }
}
