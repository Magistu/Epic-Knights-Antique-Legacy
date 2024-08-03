package com.magistuarmory.antiquelegacy.block;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks
{
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(EpicKnightsAntiqueLegacy.ID, Registries.BLOCK);

    public static final RegistrySupplier<DropExperienceBlock> TIN_ORE = addOreBlock(BLOCKS, "tin_ore", BlockBehaviour.Properties.copy(Blocks.COPPER_ORE), UniformInt.of(2, 3));
    public static final RegistrySupplier<DropExperienceBlock> DEEPSLATE_TIN_ORE = addOreBlock(BLOCKS, "deepslate_tin_ore", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE), UniformInt.of(2, 4));
    
    @ExpectPlatform
    private static RegistrySupplier<DropExperienceBlock> addOreBlock(DeferredRegister<Block> blocks, String name, BlockBehaviour.Properties properties, UniformInt uniformInt) {
        throw new AssertionError();
    }
    
    public static void init() {
        BLOCKS.register();
    }
}
