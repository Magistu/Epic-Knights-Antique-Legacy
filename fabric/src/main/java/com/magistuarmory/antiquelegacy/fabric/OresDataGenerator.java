//package com.magistuarmory.antiquelegacy.fabric;
//
//import com.magistuarmory.antiquelegacy.worldgen.ModConfiguredFeatures;
//import com.magistuarmory.antiquelegacy.worldgen.ModPlacedFeatures;
//import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
//import net.minecraft.core.RegistrySetBuilder;
//import net.minecraft.core.registries.Registries;
//
//public class OresDataGenerator implements DataGeneratorEntrypoint
//{
//    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
//        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
//        pack.addProvider(ModWorldGenerator::new);
//    }
//
//    public void buildRegistry(RegistrySetBuilder registryBuilder) {
//        registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
//        registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
//    }
//}
