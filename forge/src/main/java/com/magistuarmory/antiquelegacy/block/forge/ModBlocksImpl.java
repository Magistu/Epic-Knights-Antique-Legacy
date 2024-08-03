package com.magistuarmory.antiquelegacy.block.forge;

import com.magistuarmory.antiquelegacy.forge.block.OreBlockForge;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocksImpl
{
    public static RegistrySupplier<DropExperienceBlock> addOreBlock(DeferredRegister<Block> blocks, String name, BlockBehaviour.Properties properties, UniformInt uniformInt)
    {
        return blocks.register(name,
                () -> new OreBlockForge(
                        BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE),
                        UniformInt.of(2, 4)
                ));
    }
}