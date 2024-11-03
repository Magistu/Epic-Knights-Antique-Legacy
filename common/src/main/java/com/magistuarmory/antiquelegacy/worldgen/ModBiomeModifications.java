package com.magistuarmory.antiquelegacy.worldgen;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModBiomeModifications
{
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore");
    
    public static void init() {
//        BiomeModifications.addProperties(context -> context.hasTag(BiomeTags.IS_OVERWORLD), (context, properties) -> properties.getGenerationProperties().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TIN_ORE_PLACED_KEY));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(EpicKnightsAntiqueLegacy.ID, name));
    }
}
