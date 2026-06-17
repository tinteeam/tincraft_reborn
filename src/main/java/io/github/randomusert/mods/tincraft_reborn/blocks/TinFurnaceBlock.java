package io.github.randomusert.mods.tincraft_reborn.blocks;

import com.mojang.serialization.MapCodec;
import io.github.randomusert.mods.tincraft_reborn.blocks.entity.TinFurnaceEntity;
import io.github.randomusert.mods.tincraft_reborn.init.TCRBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jspecify.annotations.Nullable;

public class TinFurnaceBlock extends AbstractFurnaceBlock {

    public static final MapCodec<TinFurnaceBlock> CODEC = simpleCodec(TinFurnaceBlock::new);

    public TinFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends AbstractFurnaceBlock> codec() {
        return CODEC;
    }

    @Override
    protected void openContainer(Level level, BlockPos blockPos, Player player) {
        BlockEntity be = level.getBlockEntity(blockPos);

        if (be instanceof AbstractFurnaceBlockEntity) {
            player.openMenu((MenuProvider) be);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    /*
    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> type) {
        return createFurnaceTicker(level, type, TCRBlockEntities.TIN_FURNACE.get());
    }*/

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> type) {
        return super.getTicker(level, blockState, type);
    }
/*
    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new TinFurnaceEntity(blockPos, blockState);
    }*/

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (player.level().getBlockEntity(pos) == null || !(player.level().getBlockEntity(pos) instanceof TinFurnaceEntity TFE)) {
            return InteractionResult.PASS;
        }

        if (player.isShiftKeyDown()) {
            return InteractionResult.PASS;
        }

        player.openMenu(TFE);

        return InteractionResult.PASS;
    }
}
