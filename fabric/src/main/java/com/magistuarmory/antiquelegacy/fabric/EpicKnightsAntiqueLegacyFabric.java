package com.magistuarmory.antiquelegacy.fabric;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import net.fabricmc.api.ModInitializer;

public class EpicKnightsAntiqueLegacyFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        EpicKnightsAntiqueLegacy.init();
//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE_PLACED_KEY);    
    }
}
