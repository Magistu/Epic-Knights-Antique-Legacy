package com.magistuarmory.antiquelegacy.blocks;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(EpicKnightsAntiqueLegacy.ID, Registries.BLOCK);

    public static RegistrySupplier<Block> TIN_ORE;
    public static RegistrySupplier<Block> DEEPSLATE_TIN_ORE;

    public static void init() {
        TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
        DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops().strength(4.5f, 4.5f)));
        BLOCKS.register();
    }
    
    public static RegistrySupplier<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(ResourceLocation.fromNamespaceAndPath(EpicKnightsAntiqueLegacy.ID, name), block);
    }
}
