package com.magistuarmory.antiquelegacy.items.armor;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.config.ArmorConfig;
import com.magistuarmory.item.armor.ArmorType;
import com.magistuarmory.item.armor.ArmorTypes;
import dev.architectury.platform.Platform;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;
import static net.minecraft.resources.ResourceLocation.parse;
import static net.minecraft.resources.ResourceLocation.withDefaultNamespace;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
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

	public static final ArmorType ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "attic_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAtticHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BELL_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bell_cuirass"), parse("antiquelegacy:bell_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 210, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBellCuirass, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BEOTIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "beotian_helmet"), parse("antiquelegacy:beotian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBeotianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZED_GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronzed_gallea"), parse("antiquelegacy:bronzed_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzedGallea, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRidgeHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_COOLUS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_coolus"), parse("antiquelegacy:coolus"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeCoolus, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_INTERCISA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_intercisa"), parse("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeIntercisa, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MELOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_melos"), parse("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMelos, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MONTEFORTINO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_montefortino_helmet"), parse("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMontefortinoHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MUSCLE_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_muscle_cuirass"), parse("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMuscleCuirass, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_NIEDERBIEBER_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_niederbieber_helmet"), parse("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeNiederbieberHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PHRYGIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_phrygian_helmet"), parse("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePhrygianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PILOS_CLOSET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_pilos_closet"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePilosCloset, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PILOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_pilos"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePilos, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_squamata"), parse("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 190, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeSquamata, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType ROMAN_PARADE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "roman_parade_helmet"), parse("antiquelegacy:roman_parade_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableRomanParadeHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_APULO_CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_apulo_corinthian_helmet"), parse("antiquelegacy:apulo_corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeApuloCorinthianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CHALCIDIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "chalcidian_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableChalcidianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "corinthian_helmet"), parse("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 175 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCorinthianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "gallea"), parse("antiquelegacy:gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGallea, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType GILDED_GALLEA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "gilded_gallea"), parse("antiquelegacy:gilded_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGallea, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType GOLDEN_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "golden_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 150 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGoldenRidgeHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType GREEK_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "greek_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 200, 0, 0 }, new Integer[] { 0, 3, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreekGreaves, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType HAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "hamata"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableHamata, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType HAMATA_OPTIO = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "hamata_optio"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableHamataOptio, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType HEDDERNHEIM_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "heddernheim_helmet"), parse("antiquelegacy:heddernheim_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeddernheimHelmet, true, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType ILLIRIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "illirian_helmet"), parse("antiquelegacy:illirian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIllirianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_RIDGE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_ridge_helmet"), parse("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRidgeHelmet, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_INTERCISA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_intercisa"), parse("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronIntercisa, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_MELOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_melos"), parse("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronMelos, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_NIEDERBIEBER_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_niederbieber_helmet"), parse("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronNiederbieberHelmet, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_PILOS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_pilos"), parse("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 185 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronPilos, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_squamata"), parse("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 210, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronSquamata, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType LATE_HAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "late_hamata"), parse("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 250, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateHamata, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType MURMILLO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "murmillo_helmet"), parse("antiquelegacy:murmillo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMurmilloHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType MUSCULATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "musculata"), parse("antiquelegacy:musculata"), 0.0f, 0.0f, new Integer[] { 0, 0, 260, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMusculata, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType OFFICER_SQUAMATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "officer_squamata"), parse("antiquelegacy:officer_squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableOfficerSquamata, true, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType OPEN_ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "open_attic_helmet"), parse("antiquelegacy:open_attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableOpenAtticHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType PROVOCATOR_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "provocator_helmet"), parse("antiquelegacy:provocator_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableProvocatorHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SECUTOR_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "secutor_helmet"), parse("antiquelegacy:secutor_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSecutorHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SEGMENTATA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "segmentata"), parse("antiquelegacy:segmentata"), 0.0f, 0.0f, new Integer[] { 0, 0, 245, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSegmentata, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType SUBARMALIS = new ArmorType(
		ArmorTypes.ARMOR_MATERIALS,
		fromNamespaceAndPath("antiquelegacy", "subarmalis"),
		parse("antiquelegacy:underarmor"),
		0.0f,
		0.0f,
		new Integer[] { 0, 0, 110, 0 },
		new Integer[] { 0, 0, 2, 0 },
		9,
		SoundEvents.ARMOR_EQUIP_LEATHER,
		ARMOR_CONFIG.enableSubarmalis,
		true,
		() -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric")))
	);

	public static final ArmorType THRACIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "thracian_helmet"), parse("antiquelegacy:thracian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableThracianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType TINNED_MUSCLE_CUIRASS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "tinned_muscle_cuirass"), parse("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableTinnedMuscleCuirass, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType TINNED_PHRYGIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "tinned_phrygian_helmet"), parse("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableTinnedPhrygianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType WEATHERED_CORINTHIAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "weathered_corinthian_helmet"), parse("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 90 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableWeatheredCorinthianHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CARDIOPHYLAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "cardiophylax"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 0, 190, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCardiophylax, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LEFT_GLADIATOR_SHOULDER_PAD = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "left_gladiator_shoulder_pad"), parse("antiquelegacy:left_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 2, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLeftGladiatorShoulderPad, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType RIGHT_GLADIATOR_SHOULDER_PAD = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "right_gladiator_shoulder_pad"), parse("antiquelegacy:right_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 2, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableRightGladiatorShoulderPad, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_LEFT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_left_hand_manika"), parse("antiquelegacy:iron_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 220, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronLeftHandManika, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_LEFT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_left_hand_manika"), parse("antiquelegacy:bronze_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeLeftHandManika, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType FABRIC_LEFT_HAND_MANIKA = new ArmorType(
		ArmorTypes.ARMOR_MATERIALS,
		fromNamespaceAndPath("antiquelegacy", "fabric_left_hand_manika"),
		parse("antiquelegacy:fabric_left_hand_manika"),
		0.0f,
		0.0f,
		new Integer[] { 0, 0, 100, 0 },
		new Integer[] { 0, 0, 1, 0 },
		9,
		SoundEvents.ARMOR_EQUIP_IRON,
		ARMOR_CONFIG.enableFabricLeftHandManika,
		true,
		() -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric")))
	);

	public static final ArmorType IRON_RIGHT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_right_hand_manika"), parse("antiquelegacy:iron_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 220, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRightHandManika, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_RIGHT_HAND_MANIKA = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_right_hand_manika"), parse("antiquelegacy:bronze_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRightHandManika, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType FABRIC_RIGHT_HAND_MANIKA = new ArmorType(
		ArmorTypes.ARMOR_MATERIALS,
		fromNamespaceAndPath("antiquelegacy", "fabric_right_hand_manika"),
		parse("antiquelegacy:fabric_right_hand_manika"),
		0.0f,
		0.0f,
		new Integer[] { 0, 0, 100, 0 },
		new Integer[] { 0, 0, 1, 0 },
		9,
		SoundEvents.ARMOR_EQUIP_IRON,
		ARMOR_CONFIG.enableFabricRightHandManika,
		true,
		() -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric")))
	);

	public static final ArmorType MARS_OF_TODI_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "mars_of_todi_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMarsOfTodiThorax, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LINOTHORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "linothorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 130, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLinothorax, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronThorax, true, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType SCALE_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scale_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScaleThorax, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SANDALS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "sandals"), parse("antiquelegacy:sandals"), 0.0f, 0.0f, new Integer[] { 90, 0, 0, 0 }, new Integer[] { 1, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableSandals, false, "magistuarmory:leather_strips");

	public static final ArmorType CHITON = new ArmorType(
		ArmorTypes.ARMOR_MATERIALS,
		fromNamespaceAndPath("antiquelegacy", "chiton"),
		parse("antiquelegacy:underarmor"),
		0.0f,
		0.0f,
		new Integer[] { 0, 0, 90, 0 },
		new Integer[] { 0, 0, 1, 0 },
		9,
		SoundEvents.ARMOR_EQUIP_LEATHER,
		ARMOR_CONFIG.enableChiton,
		true,
		() -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric")))
	);

	public static final ArmorType GOLDEN_LAUREL_WREATH = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "golden_laurel_wreath"), parse("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 90 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGoldenLaurelWreath, false, useForgeStyleTags() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final ArmorType LAUREL_WREATH = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "laurel_wreath"), parse("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 50 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLaurelWreath, false);

	public static final ArmorType KUBAN_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "kuban_helmet"), parse("antiquelegacy:kuban_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKubanHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SCYTHIAN_SCALE_THORAX = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scythian_scale_thorax"), parse("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScythianScaleThorax, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SCYTHIAN_ATTIC_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "scythian_attic_helmet"), parse("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScythianAtticHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_SCYTHIAN_SCALE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_scythian_scale_helmet"), parse("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronScythianScaleHelmet, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_SCYTHIAN_SCALE_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_scythian_scale_helmet"), parse("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeScythianScaleHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType PHRYGIAN_CAP = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "phrygian_cap"), parse("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 70 }, new Integer[] { 0, 0, 0, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePhrygianCap, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType SHORT_PHRYGIAN_CAP = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "short_phrygian_cap"), parse("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 70 }, new Integer[] { 0, 0, 0, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableShortPhrygianCap, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_ROMAN_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "iron_roman_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 180, 0, 0 }, new Integer[] { 0, 2, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRomanGreaves, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_ROMAN_GREAVES = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "bronze_roman_greaves"), parse("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 150, 0, 0 }, new Integer[] { 0, 2, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRomanGreaves, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType AGEN_PORT_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "agen_port_helmet"), parse("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAgenPortHelmet, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType CELTIC_MONTEFORTINO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_montefortino_helmet"), parse("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCelticMontefortinoHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LA_GORGE_MEILLET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "la_gorge_meillet"), parse("antiquelegacy:la_gorge_meillet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLaGorgeMeillet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SAVA_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "sava_helmet"), parse("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSavaHelmet, false, useForgeStyleTags() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType WATERLOO_HELMET = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "waterloo_helmet"), parse("antiquelegacy:waterloo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableWaterlooHelmet, false, useForgeStyleTags() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CELTIC_TUNIC = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_tunic"), parse("antiquelegacy:tunic"), 0.0f, 0.0f, new Integer[] { 90, 0, 120, 0 }, new Integer[] { 1, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCelticTunic, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCelticPants, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType RED_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "red_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableRedCelticPants, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType GREEN_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "green_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGreenCelticPants, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType BROWN_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "brown_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBrownCelticPants, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType BLACK_CELTIC_PANTS = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "black_celtic_pants"), withDefaultNamespace("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBlackCelticPants, true, () -> Ingredient.of(TagKey.create(Registries.ITEM, parse("magistuarmory:woolen_fabric"))));

	public static final ArmorType FUR_CLOAK = new ArmorType(ArmorTypes.ARMOR_MATERIALS, fromNamespaceAndPath("antiquelegacy", "fur_cloak"), parse("antiquelegacy:fur_cloak"), 0.0f, 0.0f, new Integer[] { 0, 0, 90, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableFurCloak, true);

}
