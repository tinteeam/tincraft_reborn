package io.github.randomusert.mods.tincraft_reborn.client.screens;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import io.github.randomusert.mods.tincraft_reborn.api.Helpers;
import io.github.randomusert.mods.tincraft_reborn.menus.UltraCraftingMenu;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class UltraCraftingScreen extends AbstractContainerScreen<UltraCraftingMenu> {
    public UltraCraftingScreen(UltraCraftingMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
        super.extractBackground(graphics, mouseX, mouseY, a);

        graphics.blit(
                RenderPipelines.GUI_TEXTURED,
                Helpers.ULTRA_CRAFTER_BG_TEXTURE,
                this.leftPos, this.topPos,
                0, 0,
                this.imageWidth, this.imageWidth,
                256, 256);
    }
}
