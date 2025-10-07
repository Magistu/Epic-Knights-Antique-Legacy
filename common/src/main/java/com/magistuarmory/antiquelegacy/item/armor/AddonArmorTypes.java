package com.magistuarmory.antiquelegacy.item.armor;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.config.ArmorConfig;
import com.magistuarmory.item.armor.ArmorType;
import dev.architectury.platform.Platform;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class AddonArmorTypes
{
	public static final ArmorConfig ARMOR_CONFIG = EpicKnightsAntiqueLegacy.CONFIG.armor;

	public static final ArmorType ATTIC_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "attic_helmet"), new ResourceLocation("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAtticHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BELL_CUIRASS = new ArmorType(new ResourceLocation("antiquelegacy", "bell_cuirass"), new ResourceLocation("antiquelegacy:bell_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 210, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBellCuirass, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BEOTIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "beotian_helmet"), new ResourceLocation("antiquelegacy:beotian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBeotianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZED_GALLEA = new ArmorType(new ResourceLocation("antiquelegacy", "bronzed_gallea"), new ResourceLocation("antiquelegacy:bronzed_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzedGallea, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_RIDGE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_ridge_helmet"), new ResourceLocation("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRidgeHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_COOLUS = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_coolus"), new ResourceLocation("antiquelegacy:coolus"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeCoolus, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_INTERCISA = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_intercisa"), new ResourceLocation("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeIntercisa, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MELOS = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_melos"), new ResourceLocation("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMelos, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MONTEFORTINO_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_montefortino_helmet"), new ResourceLocation("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMontefortinoHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_MUSCLE_CUIRASS = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_muscle_cuirass"), new ResourceLocation("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeMuscleCuirass, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_NIEDERBIEBER_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_niederbieber_helmet"), new ResourceLocation("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeNiederbieberHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PHRYGIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_phrygian_helmet"), new ResourceLocation("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePhrygianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PILOS_CLOSET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_pilos_closet"), new ResourceLocation("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePilosCloset, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_PILOS = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_pilos"), new ResourceLocation("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzePilos, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_SQUAMATA = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_squamata"), new ResourceLocation("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 190, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeSquamata, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType ROMAN_PARADE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "roman_parade_helmet"), new ResourceLocation("antiquelegacy:roman_parade_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableRomanParadeHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType BRONZE_APULO_CORINTHIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_apulo_corinthian_helmet"), new ResourceLocation("antiquelegacy:apulo_corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeApuloCorinthianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CHALCIDIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "chalcidian_helmet"), new ResourceLocation("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableChalcidianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CORINTHIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "corinthian_helmet"), new ResourceLocation("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 175 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCorinthianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType GALLEA = new ArmorType(new ResourceLocation("antiquelegacy", "gallea"), new ResourceLocation("antiquelegacy:gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGallea, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType GILDED_GALLEA = new ArmorType(new ResourceLocation("antiquelegacy", "gilded_gallea"), new ResourceLocation("antiquelegacy:gilded_gallea"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGallea, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType GOLDEN_RIDGE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "golden_ridge_helmet"), new ResourceLocation("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 150 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGoldenRidgeHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType GREEK_GREAVES = new ArmorType(new ResourceLocation("antiquelegacy", "greek_greaves"), new ResourceLocation("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 200, 0, 0 }, new Integer[] { 0, 3, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreekGreaves, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType HAMATA = new ArmorType(new ResourceLocation("antiquelegacy", "hamata"), new ResourceLocation("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableHamata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType HAMATA_OPTIO = new ArmorType(new ResourceLocation("antiquelegacy", "hamata_optio"), new ResourceLocation("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableHamataOptio, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType HEDDERNHEIM_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "heddernheim_helmet"), new ResourceLocation("antiquelegacy:heddernheim_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeddernheimHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType ILLIRIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "illirian_helmet"), new ResourceLocation("antiquelegacy:illirian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIllirianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_RIDGE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "iron_ridge_helmet"), new ResourceLocation("antiquelegacy:ridge_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRidgeHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_INTERCISA = new ArmorType(new ResourceLocation("antiquelegacy", "iron_intercisa"), new ResourceLocation("antiquelegacy:intercisa"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronIntercisa, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_MELOS = new ArmorType(new ResourceLocation("antiquelegacy", "iron_melos"), new ResourceLocation("antiquelegacy:melos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronMelos, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_NIEDERBIEBER_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "iron_niederbieber_helmet"), new ResourceLocation("antiquelegacy:niederbieber_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronNiederbieberHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_PILOS = new ArmorType(new ResourceLocation("antiquelegacy", "iron_pilos"), new ResourceLocation("antiquelegacy:pilos"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 185 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronPilos, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType IRON_SQUAMATA = new ArmorType(new ResourceLocation("antiquelegacy", "iron_squamata"), new ResourceLocation("antiquelegacy:squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 210, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronSquamata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType LATE_HAMATA = new ArmorType(new ResourceLocation("antiquelegacy", "late_hamata"), new ResourceLocation("antiquelegacy:hamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 250, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateHamata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType MURMILLO_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "murmillo_helmet"), new ResourceLocation("antiquelegacy:murmillo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMurmilloHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType MUSCULATA = new ArmorType(new ResourceLocation("antiquelegacy", "musculata"), new ResourceLocation("antiquelegacy:musculata"), 0.0f, 0.0f, new Integer[] { 0, 0, 260, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMusculata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType OFFICER_SQUAMATA = new ArmorType(new ResourceLocation("antiquelegacy", "officer_squamata"), new ResourceLocation("antiquelegacy:officer_squamata"), 0.0f, 0.0f, new Integer[] { 0, 0, 240, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableOfficerSquamata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType OPEN_ATTIC_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "open_attic_helmet"), new ResourceLocation("antiquelegacy:open_attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableOpenAtticHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType PROVOCATOR_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "provocator_helmet"), new ResourceLocation("antiquelegacy:provocator_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableProvocatorHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SECUTOR_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "secutor_helmet"), new ResourceLocation("antiquelegacy:secutor_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSecutorHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SEGMENTATA = new ArmorType(new ResourceLocation("antiquelegacy", "segmentata"), new ResourceLocation("antiquelegacy:segmentata"), 0.0f, 0.0f, new Integer[] { 0, 0, 245, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSegmentata, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType SUBARMALIS = new ArmorType(new ResourceLocation("antiquelegacy", "subarmalis"), new ResourceLocation("antiquelegacy:underarmor"), 0.0f, 0.0f, new Integer[] { 0, 0, 110, 0 }, new Integer[] { 0, 0, 2, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableSubarmalis, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType THRACIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "thracian_helmet"), new ResourceLocation("antiquelegacy:thracian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableThracianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType TINNED_MUSCLE_CUIRASS = new ArmorType(new ResourceLocation("antiquelegacy", "tinned_muscle_cuirass"), new ResourceLocation("antiquelegacy:muscle_cuirass"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableTinnedMuscleCuirass, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType TINNED_PHRYGIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "tinned_phrygian_helmet"), new ResourceLocation("antiquelegacy:phrygian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableTinnedPhrygianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType WEATHERED_CORINTHIAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "weathered_corinthian_helmet"), new ResourceLocation("antiquelegacy:corinthian_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 90 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableWeatheredCorinthianHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CARDIOPHYLAX = new ArmorType(new ResourceLocation("antiquelegacy", "cardiophylax"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 0, 190, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCardiophylax, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LEFT_GLADIATOR_SHOULDER_PAD = new ArmorType(new ResourceLocation("antiquelegacy", "left_gladiator_shoulder_pad"), new ResourceLocation("antiquelegacy:left_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 2, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLeftGladiatorShoulderPad, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType RIGHT_GLADIATOR_SHOULDER_PAD = new ArmorType(new ResourceLocation("antiquelegacy", "right_gladiator_shoulder_pad"), new ResourceLocation("antiquelegacy:right_gladiator_shoulder_pad"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 2, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableRightGladiatorShoulderPad, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_LEFT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "iron_left_hand_manika"), new ResourceLocation("antiquelegacy:iron_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 220, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronLeftHandManika, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_LEFT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_left_hand_manika"), new ResourceLocation("antiquelegacy:bronze_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeLeftHandManika, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType FABRIC_LEFT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "fabric_left_hand_manika"), new ResourceLocation("antiquelegacy:fabric_left_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 100, 0 }, new Integer[] { 0, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableFabricLeftHandManika, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_RIGHT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "iron_right_hand_manika"), new ResourceLocation("antiquelegacy:iron_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 220, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRightHandManika, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_RIGHT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_right_hand_manika"), new ResourceLocation("antiquelegacy:bronze_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 3, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRightHandManika, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType FABRIC_RIGHT_HAND_MANIKA = new ArmorType(new ResourceLocation("antiquelegacy", "fabric_right_hand_manika"), new ResourceLocation("antiquelegacy:fabric_right_hand_manika"), 0.0f, 0.0f, new Integer[] { 0, 0, 100, 0 }, new Integer[] { 0, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableFabricRightHandManika, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType MARS_OF_TODI_THORAX = new ArmorType(new ResourceLocation("antiquelegacy", "mars_of_todi_thorax"), new ResourceLocation("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMarsOfTodiThorax, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LINOTHORAX = new ArmorType(new ResourceLocation("antiquelegacy", "linothorax"), new ResourceLocation("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 130, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLinothorax, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_THORAX = new ArmorType(new ResourceLocation("antiquelegacy", "iron_thorax"), new ResourceLocation("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 230, 0 }, new Integer[] { 0, 0, 5, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronThorax, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType SCALE_THORAX = new ArmorType(new ResourceLocation("antiquelegacy", "scale_thorax"), new ResourceLocation("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScaleThorax, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SANDALS = new ArmorType(new ResourceLocation("antiquelegacy", "sandals"), new ResourceLocation("antiquelegacy:sandals"), 0.0f, 0.0f, new Integer[] { 90, 0, 0, 0 }, new Integer[] { 1, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableSandals, "magistuarmory:leather_strips");

	public static final ArmorType CHITON = new ArmorType(new ResourceLocation("antiquelegacy", "chiton"), new ResourceLocation("antiquelegacy:underarmor"), 0.0f, 0.0f, new Integer[] { 0, 0, 90, 0 }, new Integer[] { 0, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableChiton, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType GOLDEN_LAUREL_WREATH = new ArmorType(new ResourceLocation("antiquelegacy", "golden_laurel_wreath"), new ResourceLocation("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 90 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGoldenLaurelWreath, Platform.isForge() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final ArmorType LAUREL_WREATH = new ArmorType(new ResourceLocation("antiquelegacy", "laurel_wreath"), new ResourceLocation("antiquelegacy:laurel_wreath"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 50 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLaurelWreath);

	public static final ArmorType KUBAN_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "kuban_helmet"), new ResourceLocation("antiquelegacy:kuban_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKubanHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SCYTHIAN_SCALE_THORAX = new ArmorType(new ResourceLocation("antiquelegacy", "scythian_scale_thorax"), new ResourceLocation("antiquelegacy:thorax"), 0.0f, 0.0f, new Integer[] { 0, 0, 200, 0 }, new Integer[] { 0, 0, 4, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScythianScaleThorax, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SCYTHIAN_ATTIC_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "scythian_attic_helmet"), new ResourceLocation("antiquelegacy:attic_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableScythianAtticHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType IRON_SCYTHIAN_SCALE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "iron_scythian_scale_helmet"), new ResourceLocation("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronScythianScaleHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_SCYTHIAN_SCALE_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_scythian_scale_helmet"), new ResourceLocation("antiquelegacy:scythian_scale_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeScythianScaleHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType PHRYGIAN_CAP = new ArmorType(new ResourceLocation("antiquelegacy", "phrygian_cap"), new ResourceLocation("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 70 }, new Integer[] { 0, 0, 0, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePhrygianCap, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType SHORT_PHRYGIAN_CAP = new ArmorType(new ResourceLocation("antiquelegacy", "short_phrygian_cap"), new ResourceLocation("antiquelegacy:phrygian_cap"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 70 }, new Integer[] { 0, 0, 0, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableShortPhrygianCap, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType IRON_ROMAN_GREAVES = new ArmorType(new ResourceLocation("antiquelegacy", "iron_roman_greaves"), new ResourceLocation("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 180, 0, 0 }, new Integer[] { 0, 2, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableIronRomanGreaves, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType BRONZE_ROMAN_GREAVES = new ArmorType(new ResourceLocation("antiquelegacy", "bronze_roman_greaves"), new ResourceLocation("antiquelegacy:greek_greaves"), 0.0f, 0.0f, new Integer[] { 0, 150, 0, 0 }, new Integer[] { 0, 2, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBronzeRomanGreaves, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType AGEN_PORT_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "agen_port_helmet"), new ResourceLocation("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAgenPortHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType CELTIC_MONTEFORTINO_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "celtic_montefortino_helmet"), new ResourceLocation("antiquelegacy:montefortino_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCelticMontefortinoHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType LA_GORGE_MEILLET = new ArmorType(new ResourceLocation("antiquelegacy", "la_gorge_meillet"), new ResourceLocation("antiquelegacy:la_gorge_meillet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLaGorgeMeillet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType SAVA_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "sava_helmet"), new ResourceLocation("antiquelegacy:agen_port_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 190 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSavaHelmet, Platform.isForge() ? "forge:ingots/iron" : "c:iron_ingots");

	public static final ArmorType WATERLOO_HELMET = new ArmorType(new ResourceLocation("antiquelegacy", "waterloo_helmet"), new ResourceLocation("antiquelegacy:waterloo_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 170 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableWaterlooHelmet, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");

	public static final ArmorType CELTIC_TUNIC = new ArmorType(new ResourceLocation("antiquelegacy", "celtic_tunic"), new ResourceLocation("antiquelegacy:tunic"), 0.0f, 0.0f, new Integer[] { 90, 0, 120, 0 }, new Integer[] { 1, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCelticTunic, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType CELTIC_PANTS = new ArmorType(new ResourceLocation("antiquelegacy", "celtic_pants"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCelticPants, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType RED_CELTIC_PANTS = new ArmorType(new ResourceLocation("antiquelegacy", "red_celtic_pants"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableRedCelticPants, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType GREEN_CELTIC_PANTS = new ArmorType(new ResourceLocation("antiquelegacy", "green_celtic_pants"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGreenCelticPants, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType BROWN_CELTIC_PANTS = new ArmorType(new ResourceLocation("antiquelegacy", "brown_celtic_pants"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBrownCelticPants, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType BLACK_CELTIC_PANTS = new ArmorType(new ResourceLocation("antiquelegacy", "black_celtic_pants"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 0, 90, 0, 0 }, new Integer[] { 0, 1, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBlackCelticPants, () -> Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType FUR_CLOAK = new ArmorType(new ResourceLocation("antiquelegacy", "fur_cloak"), new ResourceLocation("antiquelegacy:fur_cloak"), 0.0f, 0.0f, new Integer[] { 0, 0, 90, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableFurCloak);

}
