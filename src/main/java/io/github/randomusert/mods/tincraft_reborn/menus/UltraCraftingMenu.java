package io.github.randomusert.mods.tincraft_reborn.menus;

import io.github.randomusert.mods.tincraft_reborn.init.TCRMenuTypes;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class UltraCraftingMenu extends AbstractContainerMenu {


    public UltraCraftingMenu(int containerId, Inventory inv) {
        super(TCRMenuTypes.ULTRA_CRAFTING_MENU.get(), containerId);
        addInvSlots(inv);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            // If the item is in the main inventory (slots 0-26), shift-click to hotbar (slots 27-35)
            if (index < 27) {
                if (!this.moveItemStackTo(itemstack1, 27, 36, false)) {
                    return ItemStack.EMPTY;
                }
            }
            // If the item is in the hotbar, shift-click to main inventory
            else if (!this.moveItemStackTo(itemstack1, 0, 27, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemstack;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    private void addInvSlots(Inventory inv) {
        int slotSizePlusSpace = 18;
        int startX = 8;
        int startY = 84;

        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(inv, col + row * 9 + 9, startX + col * slotSizePlusSpace, startY + row * slotSizePlusSpace));
            }
        }

        int hotbarY = 142;
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(inv, col, startX + col * slotSizePlusSpace, hotbarY));
        }
    }
}
