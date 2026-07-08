package io.github.randomusert.mods.tincraft_reborn.client.menus;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class UltraCraftingMenu extends AbstractCraftingMenu {

    private final CraftingContainer craftSlots;
    private final ResultContainer resultSlots;
    private final Level level;

    public UltraCraftingMenu(int containerId, Inventory inventory) {
        super(containerId, inventory, ContainerLevelAccess.NULL);
    }

    public UltraCraftingMenu(int containerId, Inventory inv, ContainerLevelAccess access) {
        supe;
    }

    @Override
    public Slot getResultSlot() {
        return null;
    }

    @Override
    public List<Slot> getInputGridSlots() {
        return List.of();
    }

    @Override
    protected Player owner() {
        return null;
    }

    @Override
    public RecipeBookType getRecipeBookType() {
        return null;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
