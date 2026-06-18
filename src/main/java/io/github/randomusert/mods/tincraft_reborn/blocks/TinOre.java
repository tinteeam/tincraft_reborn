package io.github.randomusert.mods.tincraft_reborn.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class TinOre extends Block {
    public TinOre(Properties props) {
        super(props.destroyTime(2.5f)
                .sound(SoundType.STONE)
                .explosionResistance(0.1f));
    }
}
