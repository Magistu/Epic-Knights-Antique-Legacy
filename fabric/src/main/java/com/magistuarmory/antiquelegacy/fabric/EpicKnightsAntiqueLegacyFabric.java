package com.magistuarmory.antiquelegacy.fabric;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

public class EpicKnightsAntiqueLegacyFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        EpicKnightsAntiqueLegacy.init();
         BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EpicKnightsAntiqueLegacy.ID, "ore_tin")));
    }
}
