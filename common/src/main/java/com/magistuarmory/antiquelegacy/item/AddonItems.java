package com.magistuarmory.antiquelegacy.item;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.block.ModBlocks;
import com.magistuarmory.antiquelegacy.item.armor.AddonArmorTypes;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.DyeableWearableArmorDecorationItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.WearableArmorDecorationItem;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class AddonItems extends ModItemsProvider
{
	public static AddonItems INSTANCE = new AddonItems();

	//Weapons
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_ANTIQUE_DAGGER = INSTANCE.addMedievalWeaponItem("iron_antique_dagger", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.ANTIQUE_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_SICA = INSTANCE.addMedievalWeaponItem("iron_sica", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.SICA);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> EAGLE_STANDARD = INSTANCE.addMedievalWeaponItem("eagle_standard", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.EAGLE_STANDARD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> WEATHERED_EAGLE_STANDARD = INSTANCE.addMedievalWeaponItem("weathered_eagle_standard", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.WEATHERED_EAGLE_STANDARD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_ANTIQUE_SPEAR = INSTANCE.addMedievalWeaponItem("iron_antique_spear", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.ANTIQUE_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_DORU = INSTANCE.addMedievalWeaponItem("iron_doru", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.DORU);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_RETIARIUS = INSTANCE.addMedievalWeaponItem("iron_retiarius", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.RETIARIUS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_SARISSA = INSTANCE.addMedievalWeaponItem("iron_sarissa", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.SARISSA);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_TRIARII_SPEAR = INSTANCE.addMedievalWeaponItem("iron_triarii_spear", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.TRIARII_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_ANTIQUE_SWORD = INSTANCE.addMedievalWeaponItem("iron_antique_sword", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.ANTIQUE_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_CELTIC_SWORD = INSTANCE.addMedievalWeaponItem("iron_celtic_sword", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.CELTIC_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_EARLY_SPATHA = INSTANCE.addMedievalWeaponItem("iron_early_spatha", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.EARLY_SPATHA);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_GLADIATOR_SWORD = INSTANCE.addMedievalWeaponItem("iron_gladiator_sword", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.GLADIATOR_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_GLADIUS = INSTANCE.addMedievalWeaponItem("iron_gladius", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.GLADIUS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_KOPIS = INSTANCE.addMedievalWeaponItem("iron_kopis", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.KOPIS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_REPUBLIC_GLADIUS = INSTANCE.addMedievalWeaponItem("iron_republic_gladius", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.REPUBLIC_GLADIUS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_RHOMPHAIA = INSTANCE.addMedievalWeaponItem("iron_rhomphaia", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.RHOMPHAIA);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_SINGLE_EDGED_SWORD = INSTANCE.addMedievalWeaponItem("iron_single_edged_sword", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.SINGLE_EDGED_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_SPATHA = INSTANCE.addMedievalWeaponItem("iron_spatha", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.SPATHA);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> IRON_XIPHOS = INSTANCE.addMedievalWeaponItem("iron_xiphos", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.XIPHOS);


	//Armor
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ATTIC_HELMET = INSTANCE.addMedievalArmorItem("attic_helmet", AddonArmorTypes.ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BELL_CUIRASS = INSTANCE.addMedievalArmorItem("bell_cuirass", AddonArmorTypes.BELL_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BEOTIAN_HELMET = INSTANCE.addMedievalArmorItem("beotian_helmet", AddonArmorTypes.BEOTIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZED_GALLEA = INSTANCE.addMedievalArmorItem("bronzed_gallea", AddonArmorTypes.BRONZED_GALLEA, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_RIDGE_HELMET = INSTANCE.addMedievalArmorItem("bronze_ridge_helmet", AddonArmorTypes.BRONZE_RIDGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_COOLUS = INSTANCE.addMedievalArmorItem("bronze_coolus", AddonArmorTypes.BRONZE_COOLUS, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_INTERCISA = INSTANCE.addMedievalArmorItem("bronze_intercisa", AddonArmorTypes.BRONZE_INTERCISA, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_MELOS = INSTANCE.addMedievalArmorItem("bronze_melos", AddonArmorTypes.BRONZE_MELOS, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("bronze_montefortino_helmet", AddonArmorTypes.BRONZE_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_MUSCLE_CUIRASS = INSTANCE.addMedievalArmorItem("bronze_muscle_cuirass", AddonArmorTypes.BRONZE_MUSCLE_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("bronze_niederbieber_helmet", AddonArmorTypes.BRONZE_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_PHRYGIAN_HELMET = INSTANCE.addMedievalArmorItem("bronze_phrygian_helmet", AddonArmorTypes.BRONZE_PHRYGIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_PILOS_CLOSET = INSTANCE.addMedievalArmorItem("bronze_pilos_closet", AddonArmorTypes.BRONZE_PILOS_CLOSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_PILOS = INSTANCE.addMedievalArmorItem("bronze_pilos", AddonArmorTypes.BRONZE_PILOS, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_SQUAMATA = INSTANCE.addMedievalArmorItem("bronze_squamata", AddonArmorTypes.BRONZE_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ROMAN_PARADE_HELMET = INSTANCE.addMedievalArmorItem("roman_parade_helmet", AddonArmorTypes.ROMAN_PARADE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_APULO_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("bronze_apulo_corinthian_helmet", AddonArmorTypes.BRONZE_APULO_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHALCIDIAN_HELMET = INSTANCE.addMedievalArmorItem("chalcidian_helmet", AddonArmorTypes.CHALCIDIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("corinthian_helmet", AddonArmorTypes.CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLEA = INSTANCE.addMedievalArmorItem("gallea", AddonArmorTypes.GALLEA, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GALLEA = INSTANCE.addMedievalArmorItem("gilded_gallea", AddonArmorTypes.GILDED_GALLEA, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GOLDEN_RIDGE_HELMET = INSTANCE.addMedievalArmorItem("golden_ridge_helmet", AddonArmorTypes.GOLDEN_RIDGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEK_GREAVES = INSTANCE.addMedievalArmorItem("greek_greaves", AddonArmorTypes.GREEK_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HAMATA = INSTANCE.addMedievalArmorItem("hamata", AddonArmorTypes.HAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HAMATA_OPTIO = INSTANCE.addMedievalArmorItem("hamata_optio", AddonArmorTypes.HAMATA_OPTIO, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEDDERNHEIM_HELMET = INSTANCE.addDyeableMedievalArmorItem("heddernheim_helmet", AddonArmorTypes.HEDDERNHEIM_HELMET, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ILLIRIAN_HELMET = INSTANCE.addMedievalArmorItem("illirian_helmet", AddonArmorTypes.ILLIRIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_RIDGE_HELMET = INSTANCE.addMedievalArmorItem("iron_ridge_helmet", AddonArmorTypes.IRON_RIDGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_INTERCISA = INSTANCE.addMedievalArmorItem("iron_intercisa", AddonArmorTypes.IRON_INTERCISA, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_MELOS = INSTANCE.addMedievalArmorItem("iron_melos", AddonArmorTypes.IRON_MELOS, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("iron_niederbieber_helmet", AddonArmorTypes.IRON_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_PILOS = INSTANCE.addMedievalArmorItem("iron_pilos", AddonArmorTypes.IRON_PILOS, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_SQUAMATA = INSTANCE.addMedievalArmorItem("iron_squamata", AddonArmorTypes.IRON_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_HAMATA = INSTANCE.addMedievalArmorItem("late_hamata", AddonArmorTypes.LATE_HAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MURMILLO_HELMET = INSTANCE.addMedievalArmorItem("murmillo_helmet", AddonArmorTypes.MURMILLO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MUSCULATA = INSTANCE.addMedievalArmorItem("musculata", AddonArmorTypes.MUSCULATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> OFFICER_SQUAMATA = INSTANCE.addDyeableMedievalArmorItem("officer_squamata", AddonArmorTypes.OFFICER_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> OPEN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("open_attic_helmet", AddonArmorTypes.OPEN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PROVOCATOR_HELMET = INSTANCE.addMedievalArmorItem("provocator_helmet", AddonArmorTypes.PROVOCATOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SECUTOR_HELMET = INSTANCE.addMedievalArmorItem("secutor_helmet", AddonArmorTypes.SECUTOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SEGMENTATA = INSTANCE.addMedievalArmorItem("segmentata", AddonArmorTypes.SEGMENTATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> THRACIAN_HELMET = INSTANCE.addMedievalArmorItem("thracian_helmet", AddonArmorTypes.THRACIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TINNED_MUSCLE_CUIRASS = INSTANCE.addMedievalArmorItem("tinned_muscle_cuirass", AddonArmorTypes.TINNED_MUSCLE_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TINNED_PHRYGIAN_HELMET = INSTANCE.addMedievalArmorItem("tinned_phrygian_helmet", AddonArmorTypes.TINNED_PHRYGIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> WEATHERED_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("weathered_corinthian_helmet", AddonArmorTypes.WEATHERED_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CARDIOPHYLAX = INSTANCE.addMedievalArmorItem("cardiophylax", AddonArmorTypes.CARDIOPHYLAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LINOTHORAX = INSTANCE.addDyeableMedievalArmorItem("linothorax", AddonArmorTypes.LINOTHORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_THORAX = INSTANCE.addDyeableMedievalArmorItem("iron_thorax", AddonArmorTypes.IRON_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SCALE_THORAX = INSTANCE.addMedievalArmorItem("scale_thorax", AddonArmorTypes.SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SANDALS = INSTANCE.addMedievalArmorItem("sandals", AddonArmorTypes.SANDALS, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> KUBAN_HELMET = INSTANCE.addMedievalArmorItem("kuban_helmet", AddonArmorTypes.KUBAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SCYTHIAN_SCALE_THORAX = INSTANCE.addMedievalArmorItem("scythian_scale_thorax", AddonArmorTypes.SCYTHIAN_SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SCYTHIAN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("scythian_attic_helmet", AddonArmorTypes.SCYTHIAN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_SCYTHIAN_SCALE_HELMET = INSTANCE.addMedievalArmorItem("iron_scythian_scale_helmet", AddonArmorTypes.IRON_SCYTHIAN_SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_SCYTHIAN_SCALE_HELMET = INSTANCE.addMedievalArmorItem("bronze_scythian_scale_helmet", AddonArmorTypes.BRONZE_SCYTHIAN_SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PHRYGIAN_CAP = INSTANCE.addDyeableMedievalArmorItem("phrygian_cap", AddonArmorTypes.PHRYGIAN_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SHORT_PHRYGIAN_CAP = INSTANCE.addDyeableMedievalArmorItem("short_phrygian_cap", AddonArmorTypes.SHORT_PHRYGIAN_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> IRON_ROMAN_GREAVES = INSTANCE.addMedievalArmorItem("iron_roman_greaves", AddonArmorTypes.IRON_ROMAN_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRONZE_ROMAN_GREAVES = INSTANCE.addMedievalArmorItem("bronze_roman_greaves", AddonArmorTypes.BRONZE_ROMAN_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> AGEN_PORT_HELMET = INSTANCE.addMedievalArmorItem("agen_port_helmet", AddonArmorTypes.AGEN_PORT_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CELTIC_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("celtic_montefortino_helmet", AddonArmorTypes.CELTIC_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LA_GORGE_MEILLET = INSTANCE.addMedievalArmorItem("la_gorge_meillet", AddonArmorTypes.LA_GORGE_MEILLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SAVA_HELMET = INSTANCE.addMedievalArmorItem("sava_helmet", AddonArmorTypes.SAVA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> WATERLOO_HELMET = INSTANCE.addMedievalArmorItem("waterloo_helmet", AddonArmorTypes.WATERLOO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CELTIC_TUNIC = INSTANCE.addDyeableMedievalArmorItem("celtic_tunic", AddonArmorTypes.CELTIC_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xBEAE8d);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CELTIC_TUNIC_BOOTS = INSTANCE.addDyeableMedievalArmorItem("celtic_tunic_boots", AddonArmorTypes.CELTIC_TUNIC, ArmorItem.Type.BOOTS, new Item.Properties(), 0xBEAE8d);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CELTIC_PANTS = INSTANCE.addDyeableMedievalArmorItem("celtic_pants", AddonArmorTypes.CELTIC_PANTS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xBEAE8d);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_CELTIC_PANTS = INSTANCE.addDyeableMedievalArmorItem("red_celtic_pants", AddonArmorTypes.RED_CELTIC_PANTS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_CELTIC_PANTS = INSTANCE.addDyeableMedievalArmorItem("green_celtic_pants", AddonArmorTypes.GREEN_CELTIC_PANTS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_CELTIC_PANTS = INSTANCE.addDyeableMedievalArmorItem("brown_celtic_pants", AddonArmorTypes.BROWN_CELTIC_PANTS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_CELTIC_PANTS = INSTANCE.addDyeableMedievalArmorItem("black_celtic_pants", AddonArmorTypes.BLACK_CELTIC_PANTS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xFFFFFF);



	//Decoration
	public static final RegistrySupplier<ArmorDecorationItem> BRONZE_HORNS_DECORATION = INSTANCE.addArmorDecorationItem("bronze_horns_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "bronze_horns"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> BRONZE_SMALL_WINGS_DECORATION = INSTANCE.addArmorDecorationItem("bronze_small_wings_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "bronze_small_wings"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ANTIQUE_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("antique_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "antique_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GREEK_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("greek_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "greek_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GREEK_HIGH_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("greek_high_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "greek_high_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HAIR_PLUME_DECORATION = INSTANCE.addDyeableArmorDecorationItem("hair_plume_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "hair_plume"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROMAN_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("roman_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "roman_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROMAN_CREST_ALT_DECORATION = INSTANCE.addDyeableArmorDecorationItem("roman_crest_alt_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "roman_crest_alt"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROMAN_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("roman_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "roman_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROMAN_TWO_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("roman_two_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "roman_two_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> TRIPLE_FEATHER_DECORATION = INSTANCE.addDyeableArmorDecorationItem("triple_feather_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "triple_feather"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> TWO_HAIR_PLUMES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("two_hair_plumes_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "two_hair_plumes"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<WearableArmorDecorationItem> LEFT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("left_gladiator_shoulder_pad_decoration", AddonArmorTypes.LEFT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("right_gladiator_shoulder_pad_decoration", AddonArmorTypes.RIGHT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> IRON_LEFT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("iron_left_hand_manika_decoration", AddonArmorTypes.IRON_LEFT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> BRONZE_LEFT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("bronze_left_hand_manika_decoration", AddonArmorTypes.BRONZE_LEFT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> FABRIC_LEFT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("fabric_left_hand_manika_decoration", AddonArmorTypes.FABRIC_LEFT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> IRON_RIGHT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("iron_right_hand_manika_decoration", AddonArmorTypes.IRON_RIGHT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> BRONZE_RIGHT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("bronze_right_hand_manika_decoration", AddonArmorTypes.BRONZE_RIGHT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> FABRIC_RIGHT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("fabric_right_hand_manika_decoration", AddonArmorTypes.FABRIC_RIGHT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> CHITON_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("chiton_decoration", AddonArmorTypes.CHITON, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<WearableArmorDecorationItem> GOLDEN_LAUREL_WREATH_DECORATION = INSTANCE.addWearableArmorDecorationItem("golden_laurel_wreath_decoration", AddonArmorTypes.GOLDEN_LAUREL_WREATH, ArmorItem.Type.HELMET, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> LAUREL_WREATH_DECORATION = INSTANCE.addWearableArmorDecorationItem("laurel_wreath_decoration", AddonArmorTypes.LAUREL_WREATH, ArmorItem.Type.HELMET, new Item.Properties());
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> SUBARMALIS_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("subarmalis_decoration", AddonArmorTypes.SUBARMALIS, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableArmorDecorationItem> CELTIC_TUNIC_UNDERARMOR_DECORATION = INSTANCE.addDyeableArmorDecorationItem("celtic_tunic_underarmor_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAntiqueLegacy.ID, "celtic_tunic_underarmor"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xBEAE8d));
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> FUR_CLOAK_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("fur_cloak_decoration", AddonArmorTypes.FUR_CLOAK, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0x595959);

	// Materials
	public static final RegistrySupplier<Item> SMALL_BRONZE_PLATE = INSTANCE.addIngredientItem("small_bronze_plate", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> BRONZE_LAMELLAR_ROWS = INSTANCE.addIngredientItem("bronze_lamellar_rows", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> BRONZE_NUGGET = INSTANCE.addIngredientItem("bronze_nugget", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> BRONZE_PLATE = INSTANCE.addIngredientItem("bronze_plate", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> BRONZE_INGOT = INSTANCE.addIngredientItem("bronze_ingot", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> TIN_NUGGET = INSTANCE.addIngredientItem("tin_nugget", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> TIN_INGOT = INSTANCE.addIngredientItem("tin_ingot", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> IRON_PLATE = INSTANCE.addIngredientItem("iron_plate", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> RAW_TIN = INSTANCE.addIngredientItem("raw_tin", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> BRONZE_MIXTURE = INSTANCE.addIngredientItem("bronze_mixture", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> COPPER_NUGGET = INSTANCE.addIngredientItem("copper_nugget", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> IRON_RING = INSTANCE.addIngredientItem("iron_ring", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> IRON_CHAINMAIL = INSTANCE.addIngredientItem("iron_chainmail", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> SMALL_IRON_PLATE = INSTANCE.addIngredientItem("small_iron_plate", () -> new Item(new Item.Properties()));
	public static final RegistrySupplier<Item> IRON_LAMELLAR_ROWS = INSTANCE.addIngredientItem("iron_lamellar_rows", () -> new Item(new Item.Properties()));

	// Blocks
	public static final RegistrySupplier<BlockItem> TIN_ORE = INSTANCE.items.register("tin_ore", () -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties()));
	public static final RegistrySupplier<BlockItem> DEEPSLATE_TIN_ORE = INSTANCE.items.register("deepslate_tin_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties()));


	//Shield
	public static final RegistrySupplier<MedievalShieldItem> REPUBLIC_SCUTUM = INSTANCE.addMedievalShieldItem("bronze_republic_scutum", "republic_scutum", new Item.Properties(), ModItemTier.BRONZE, true, true, AddonShieldTypes.REPUBLIC_SCUTUM);
	public static final RegistrySupplier<MedievalShieldItem> IMPERIAL_SCUTUM = INSTANCE.addMedievalShieldItem("bronze_imperial_scutum", "imperial_scutum", new Item.Properties(), ModItemTier.BRONZE, true, true, AddonShieldTypes.IMPERIAL_SCUTUM);
	public static final RegistrySupplier<MedievalShieldItem> TUREOS = INSTANCE.addMedievalShieldItem("bronze_tureos", "tureos", new Item.Properties(), ModItemTier.BRONZE, true, true, AddonShieldTypes.TUREOS);
	public static final RegistrySupplier<MedievalShieldItem> HOPLON = INSTANCE.addMedievalShieldItem("bronze_hoplon", "hoplon", new Item.Properties(), ModItemTier.BRONZE, true, true, AddonShieldTypes.HOPLON);
	public static final RegistrySupplier<MedievalShieldItem> PELTA = INSTANCE.addMedievalShieldItem("pelta", "pelta", new Item.Properties(), ModItemTier.BRONZE, true, true, AddonShieldTypes.PELTA);
	
	public AddonItems()
	{
		super(EpicKnightsAntiqueLegacy.ID);
	}
}
