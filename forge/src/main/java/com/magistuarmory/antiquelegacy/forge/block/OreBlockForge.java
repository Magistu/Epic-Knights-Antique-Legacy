package com.magistuarmory.antiquelegacy.forge.block;

import com.magistuarmory.antiquelegacy.block.OreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class OreBlockForge extends OreBlock
{
    public OreBlockForge(Properties properties, IntProvider intProvider)
    {
        super(properties, intProvider);
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
            return tieredItem.getTier().getLevel() >= 1;
        return false;
    }
}
