package io.github.randomusert.mods.tincraft_reborn.blocks.entity;

import io.github.randomusert.mods.tincraft_reborn.init.TCRBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TinFurnaceEntity extends AbstractFurnaceBlockEntity {
    protected TinFurnaceEntity(BlockEntityType<?> type, BlockPos worldPosition, BlockState blockState, RecipeType<? extends AbstractCookingRecipe> recipeType) {
        super(type, worldPosition, blockState, recipeType);
    }

    /*public TinFurnaceEntity(BlockPos worldPosition, BlockState blockState) {
        super(TCRBlockEntities.TIN_FURNACE.get(), worldPosition, blockState, RecipeType.SMELTING);
    }*/


    @Override
    protected Component getDefaultName() {
        return Component.translatable("blockentity.tincraft_reborn.tin_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new FurnaceMenu(i, inventory, this, this.dataAccess);
    }
}
