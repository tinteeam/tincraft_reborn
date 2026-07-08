package io.github.randomusert.mods.tincraft_reborn.api;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;

import net.minecraft.resources.Identifier;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class Helpers {

    public static Identifier rl(String path) {
        return Identifier.fromNamespaceAndPath(Tincraft_reborn.MODID, path);
    }

    public static Identifier rl(String modId, String Path) {
        return Identifier.fromNamespaceAndPath(modId, Path);
    }

    public static final Identifier ULTRA_CRAFTER_BG_TEXTURE = rl("tincraft_reborn", "textures/gui/ultra_crafter/ultra_crafter.png");
}
