package io.github.randomusert.mods.tincraft_reborn.blocks;

import net.minecraft.client.telemetry.TelemetryProperty;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TestBlock extends Block {
    public TestBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        player.sendSystemMessage(Component.literal("Test Block Entity Right clicked."));
        var currentGameMode = player.gameMode();
        player.sendSystemMessage(Component.literal("Current game mode on player: " + currentGameMode));
        return InteractionResult.PASS;
    }
}
