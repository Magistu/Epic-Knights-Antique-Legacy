package com.magistuarmory.antiquelegacy.item.armor;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.config.ArmorConfig;
import com.magistuarmory.item.armor.ArmorType;
import com.magistuarmory.item.armor.ArmorTypes;
import dev.architectury.platform.Platform;
import net.minecraft.core.registries.Registries;

import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;
import static net.minecraft.resources.ResourceLocation.parse;
import static net.minecraft.resources.ResourceLocation.withDefaultNamespace;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;

public class AddonArmorTypes
{
	public static final ArmorConfig ARMOR_CONFIG = EpicKnightsAntiqueLegacy.CONFIG.armor;

	/**
	 * Helper method to determine if we should use Forge-style ingredient tags.
	 * Both Forge and NeoForge should use Forge-style tags for compatibility.
	 * Only Fabric uses the "c:" namespace tags.
	 */
	private static boolean useForgeStyleTags() {
		// Use !Platform.isFabric() to cover both Forge and NeoForge
		return !Platform.isFabric();
	}

	public static final ArmorType ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "attic_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.atticHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.atticHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.atticHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BELL_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bell_cuirass"), parse("antiquelegacy:bell_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.bellCuirass.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.bellCuirass.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bellCuirass.enabled, false, "c:ingots/bronze");

	public static final ArmorType BEOTIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "beotian_helmet"), parse("antiquelegacy:beotian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.beotianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.beotianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.beotianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZED_GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronzed_gallea"), parse("antiquelegacy:bronzed_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzedGallea.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzedGallea.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzedGallea.enabled, false, "c:ingots/iron");

	public static final ArmorType BRONZE_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeRidgeHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeRidgeHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeRidgeHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_COOLUS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_coolus"), parse("antiquelegacy:coolus"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeCoolus.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeCoolus.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeCoolus.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_INTERCISA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_intercisa"), parse("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeIntercisa.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeIntercisa.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeIntercisa.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_MELOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_melos"), parse("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeMelos.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeMelos.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeMelos.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_MONTEFORTINO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_montefortino_helmet"), parse("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeMontefortinoHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeMontefortinoHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeMontefortinoHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_MUSCLE_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_muscle_cuirass"), parse("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeMuscleCuirass.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeMuscleCuirass.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeMuscleCuirass.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_NIEDERBIEBER_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_niederbieber_helmet"), parse("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeNiederbieberHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeNiederbieberHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeNiederbieberHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_PHRYGIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_phrygian_helmet"), parse("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePhrygianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePhrygianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzePhrygianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_PILOS_CLOSET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_pilos_closet"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePilosCloset.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePilosCloset.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzePilosCloset.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_PILOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_pilos"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePilos.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzePilos.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzePilos.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_squamata"), parse("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeSquamata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeSquamata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeSquamata.enabled, false, "c:ingots/bronze");

	public static final ArmorType ROMAN_PARADE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "roman_parade_helmet"), parse("antiquelegacy:roman_parade_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.romanParadeHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.romanParadeHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.romanParadeHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType BRONZE_APULO_CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_apulo_corinthian_helmet"), parse("antiquelegacy:apulo_corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeApuloCorinthianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeApuloCorinthianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeApuloCorinthianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType CHALCIDIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "chalcidian_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.chalcidianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.chalcidianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.chalcidianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "corinthian_helmet"), parse("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.corinthianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.corinthianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.corinthianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "gallea"), parse("antiquelegacy:gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.gallea.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.gallea.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.gallea.enabled, false, "c:ingots/iron");

	public static final ArmorType GILDED_GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "gilded_gallea"), parse("antiquelegacy:gilded_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.gildedGallea.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.gildedGallea.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.gildedGallea.enabled, false, "c:ingots/iron");

	public static final ArmorType GOLDEN_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "golden_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.goldenRidgeHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.goldenRidgeHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.goldenRidgeHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType GREEK_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "greek_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.greekGreaves.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.greekGreaves.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.greekGreaves.enabled, false, "c:ingots/bronze");

	public static final ArmorType HAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "hamata"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.hamata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.hamata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.hamata.enabled, false, "c:ingots/iron");

	public static final ArmorType HAMATA_OPTIO = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "hamata_optio"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.hamataOptio.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.hamataOptio.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.hamataOptio.enabled, false, "c:ingots/iron");

	public static final ArmorType HEDDERNHEIM_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "heddernheim_helmet"), parse("antiquelegacy:heddernheim_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.heddernheimHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.heddernheimHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.heddernheimHelmet.enabled, true, "c:ingots/iron");

	public static final ArmorType ILLIRIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "illirian_helmet"), parse("antiquelegacy:illirian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.illirianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.illirianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.illirianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType IRON_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironRidgeHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironRidgeHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironRidgeHelmet.enabled, false, "c:ingots/iron");

	public static final ArmorType IRON_INTERCISA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_intercisa"), parse("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironIntercisa.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironIntercisa.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironIntercisa.enabled, false, "c:ingots/iron");

	public static final ArmorType IRON_MELOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_melos"), parse("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironMelos.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironMelos.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironMelos.enabled, false, "c:ingots/iron");

	public static final ArmorType IRON_NIEDERBIEBER_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_niederbieber_helmet"), parse("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironNiederbieberHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironNiederbieberHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironNiederbieberHelmet.enabled, false, "c:ingots/iron");

	public static final ArmorType IRON_PILOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_pilos"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironPilos.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironPilos.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironPilos.enabled, false, "c:ingots/iron");

	public static final ArmorType IRON_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_squamata"), parse("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.ironSquamata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.ironSquamata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironSquamata.enabled, false, "c:ingots/iron");

	public static final ArmorType LATE_HAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "late_hamata"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.lateHamata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.lateHamata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.lateHamata.enabled, false, "c:ingots/iron");

	public static final ArmorType MURMILLO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "murmillo_helmet"), parse("antiquelegacy:murmillo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.murmilloHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.murmilloHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.murmilloHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType MUSCULATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "musculata"), parse("antiquelegacy:musculata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.musculata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.musculata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.musculata.enabled, false, "c:ingots/iron");

	public static final ArmorType OFFICER_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "officer_squamata"), parse("antiquelegacy:officer_squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.officerSquamata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.officerSquamata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.officerSquamata.enabled, true, "c:ingots/iron");

	public static final ArmorType OPEN_ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "open_attic_helmet"), parse("antiquelegacy:open_attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.openAtticHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.openAtticHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.openAtticHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType PROVOCATOR_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "provocator_helmet"), parse("antiquelegacy:provocator_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.provocatorHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.provocatorHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.provocatorHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType SECUTOR_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "secutor_helmet"), parse("antiquelegacy:secutor_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.secutorHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.secutorHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.secutorHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType SEGMENTATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "segmentata"), parse("antiquelegacy:segmentata"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.segmentata.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.segmentata.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.segmentata.enabled, false, "c:ingots/iron");

	public static final ArmorType SUBARMALIS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "subarmalis"), parse("antiquelegacy:underarmor"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.subarmalis.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.subarmalis.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.subarmalis.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType THRACIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "thracian_helmet"), parse("antiquelegacy:thracian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.thracianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.thracianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.thracianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType TINNED_MUSCLE_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "tinned_muscle_cuirass"), parse("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.tinnedMuscleCuirass.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.tinnedMuscleCuirass.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.tinnedMuscleCuirass.enabled, false, "c:ingots/bronze");

	public static final ArmorType TINNED_PHRYGIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "tinned_phrygian_helmet"), parse("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.tinnedPhrygianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.tinnedPhrygianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.tinnedPhrygianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType WEATHERED_CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "weathered_corinthian_helmet"), parse("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.weatheredCorinthianHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.weatheredCorinthianHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.weatheredCorinthianHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType CARDIOPHYLAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "cardiophylax"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.cardiophylax.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.cardiophylax.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.cardiophylax.enabled, false, "c:ingots/bronze");

	public static final ArmorType LEFT_GLADIATOR_SHOULDER_PAD = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "left_gladiator_shoulder_pad"), parse("antiquelegacy:left_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.leftGladiatorShoulderPad.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.leftGladiatorShoulderPad.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.leftGladiatorShoulderPad.enabled, false, "c:ingots/bronze");

	public static final ArmorType RIGHT_GLADIATOR_SHOULDER_PAD = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "right_gladiator_shoulder_pad"), parse("antiquelegacy:right_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.rightGladiatorShoulderPad.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.rightGladiatorShoulderPad.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.rightGladiatorShoulderPad.enabled, false, "c:ingots/bronze");

	public static final ArmorType IRON_LEFT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_left_hand_manika"), parse("antiquelegacy:iron_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.ironLeftHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.ironLeftHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironLeftHandManika.enabled, false, "c:ingots/iron");

	public static final ArmorType BRONZE_LEFT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_left_hand_manika"), parse("antiquelegacy:bronze_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeLeftHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeLeftHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeLeftHandManika.enabled, false, "c:ingots/bronze");

	public static final ArmorType FABRIC_LEFT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "fabric_left_hand_manika"), parse("antiquelegacy:fabric_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.fabricLeftHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.fabricLeftHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.fabricLeftHandManika.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_RIGHT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_right_hand_manika"), parse("antiquelegacy:iron_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.ironRightHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.ironRightHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironRightHandManika.enabled, false, "c:ingots/iron");

	public static final ArmorType BRONZE_RIGHT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_right_hand_manika"), parse("antiquelegacy:bronze_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeRightHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.bronzeRightHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeRightHandManika.enabled, false, "c:ingots/bronze");

	public static final ArmorType FABRIC_RIGHT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "fabric_right_hand_manika"), parse("antiquelegacy:fabric_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.fabricRightHandManika.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.fabricRightHandManika.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.fabricRightHandManika.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType LINOTHORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "linothorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.marsOfTodiThorax.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.linothorax.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.linothorax.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.linothorax.enabled, true, "c:ingots/iron");

	public static final ArmorType SCALE_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scale_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.ironThorax.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.ironThorax.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironThorax.enabled, false, "c:ingots/bronze");

	public static final ArmorType SANDALS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "sandals"), parse("antiquelegacy:sandals"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.scaleThorax.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.scaleThorax.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.scaleThorax.enabled, false, "magistuarmory:leather_strips");

	public static final ArmorType CHITON = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "chiton"), parse("antiquelegacy:underarmor"), 0.0f, 0.0f, new Integer[] { ARMOR_CONFIG.sandals.bootsDurability, 0, 0, 0 }, new Integer[] { ARMOR_CONFIG.sandals.bootsDefense, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.sandals.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType GOLDEN_LAUREL_WREATH = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "golden_laurel_wreath"), parse("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.chiton.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.chiton.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.chiton.enabled, false, "c:ingots/gold");

	public static final ArmorType LAUREL_WREATH = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "laurel_wreath"), parse("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.goldenLaurelWreath.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.goldenLaurelWreath.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.goldenLaurelWreath.enabled, false);

	public static final ArmorType KUBAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "kuban_helmet"), parse("antiquelegacy:kuban_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.laurelWreath.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.laurelWreath.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.laurelWreath.enabled, false, "c:ingots/bronze");

	public static final ArmorType SCYTHIAN_SCALE_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scythian_scale_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.kubanHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.kubanHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.kubanHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType SCYTHIAN_ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scythian_attic_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, ARMOR_CONFIG.scythianScaleThorax.chestplateDurability, 0 }, new Integer[] { 0, 0, ARMOR_CONFIG.scythianScaleThorax.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.scythianScaleThorax.enabled, false, "c:ingots/bronze");

	public static final ArmorType IRON_SCYTHIAN_SCALE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_scythian_scale_helmet"), parse("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.scythianAtticHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.scythianAtticHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.scythianAtticHelmet.enabled, false, "c:ingots/iron");

	public static final ArmorType BRONZE_SCYTHIAN_SCALE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_scythian_scale_helmet"), parse("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironScythianScaleHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.ironScythianScaleHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironScythianScaleHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType PHRYGIAN_CAP = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "phrygian_cap"), parse("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeScythianScaleHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.bronzeScythianScaleHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.bronzeScythianScaleHelmet.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType SHORT_PHRYGIAN_CAP = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "short_phrygian_cap"), parse("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.phrygianCap.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.phrygianCap.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.phrygianCap.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_ROMAN_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_roman_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.shortPhrygianCap.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.shortPhrygianCap.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.shortPhrygianCap.enabled, false, "c:ingots/iron");

	public static final ArmorType BRONZE_ROMAN_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_roman_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.ironRomanGreaves.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.ironRomanGreaves.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.ironRomanGreaves.enabled, false, "c:ingots/bronze");

	public static final ArmorType AGEN_PORT_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "agen_port_helmet"), parse("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.bronzeRomanGreaves.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.bronzeRomanGreaves.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.bronzeRomanGreaves.enabled, false, "c:ingots/iron");

	public static final ArmorType CELTIC_MONTEFORTINO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_montefortino_helmet"), parse("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.agenPortHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.agenPortHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.agenPortHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType LA_GORGE_MEILLET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "la_gorge_meillet"), parse("antiquelegacy:la_gorge_meillet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.celticMontefortinoHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.celticMontefortinoHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.celticMontefortinoHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType SAVA_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "sava_helmet"), parse("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.laGorgeMeillet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.laGorgeMeillet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.laGorgeMeillet.enabled, false, "c:ingots/iron");

	public static final ArmorType WATERLOO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "waterloo_helmet"), parse("antiquelegacy:waterloo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.savaHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.savaHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.savaHelmet.enabled, false, "c:ingots/bronze");

	public static final ArmorType CELTIC_TUNIC = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_tunic"), parse("antiquelegacy:tunic"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, ARMOR_CONFIG.waterlooHelmet.helmetDurability }, new Integer[] { 0, 0, 0, ARMOR_CONFIG.waterlooHelmet.helmetDefense }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.waterlooHelmet.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { ARMOR_CONFIG.celticTunic.bootsDurability, 0, ARMOR_CONFIG.celticTunic.chestplateDurability, 0 }, new Integer[] { ARMOR_CONFIG.celticTunic.bootsDefense, 0, ARMOR_CONFIG.celticTunic.chestplateDefense, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.celticTunic.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType RED_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "red_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.celticPants.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.celticPants.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.celticPants.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType GREEN_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "green_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.redCelticPants.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.redCelticPants.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.redCelticPants.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType BROWN_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "brown_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.greenCelticPants.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.greenCelticPants.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.greenCelticPants.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType BLACK_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "black_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.brownCelticPants.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.brownCelticPants.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.brownCelticPants.enabled, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType FUR_CLOAK = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "fur_cloak"), parse("antiquelegacy:fur_cloak"), 0.0f, 0.0f, new Integer[] { 0, ARMOR_CONFIG.blackCelticPants.leggingsDurability, 0, 0 }, new Integer[] { 0, ARMOR_CONFIG.blackCelticPants.leggingsDefense, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.blackCelticPants.enabled, true);

}
