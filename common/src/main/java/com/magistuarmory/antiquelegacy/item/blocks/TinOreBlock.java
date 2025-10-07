package com.magistuarmory.antiquelegacy.item.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.ExperienceOrb;

/**
 * Custom tin ore block that properly handles both loot table drops and XP drops
 */
public class TinOreBlock extends Block {
    private final IntProvider xpRange;

    public TinOreBlock(Properties properties) {
        super(properties);
        this.xpRange = UniformInt.of(2, 5); // Similar to iron ore XP range
    }

    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.spawnAfterBreak(state, level, pos, tool, dropExperience);
        
        // Only drop XP if the block was properly mined (not silk touch, correct tool, etc.)
        if (dropExperience) {
            this.tryDropExperience(level, pos, tool, this.xpRange);
        }
    }

    @Override
    protected void tryDropExperience(ServerLevel level, BlockPos pos, ItemStack tool, IntProvider xpRange) {
        if (xpRange != null) {
            int xpAmount = xpRange.sample(level.random);
            if (xpAmount > 0) {
                ExperienceOrb.award(level, pos.getCenter(), xpAmount);
            }
        }
    }
}