package com.magistuarmory.antiquelegacy.fabric;

import com.magistuarmory.antiquelegacy.worldgen.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

public class EpicKnightsAntiqueLegacyFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        EpicKnightsAntiqueLegacy.init();
//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE_PLACED_KEY);    
    }
}
