package io.github.randomusert.mods.tincraft_reborn.recipe.ultracrafting;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

public record UltraCraftingInput(BlockState state, ItemStack slot0,
                                 ItemStack slot1, ItemStack slot2,
                                 ItemStack slot3, ItemStack slot4,
                                 ItemStack slot5, ItemStack slot6,
                                 ItemStack slot7, ItemStack slot8) implements RecipeInput {
    @Override
    public @NonNull ItemStack getItem(int index) {
        return switch (index) {
            case 0 -> slot0;
            case 1 -> slot1;
            case 2 -> slot2;
            case 3 -> slot3;
            case 4 -> slot4;
            case 5 -> slot5;
            case 6 -> slot6;
            case 7 -> slot7;
            case 8 -> slot8;
            default -> ItemStack.EMPTY;
        };
    }

    @Override
    public int size() {
        return 9;
    }
}
