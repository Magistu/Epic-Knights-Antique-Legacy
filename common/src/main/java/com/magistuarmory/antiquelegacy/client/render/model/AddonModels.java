package com.magistuarmory.antiquelegacy.client.render.model;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.client.render.model.armor.*;
import com.magistuarmory.antiquelegacy.client.render.model.decoration.*;
import com.magistuarmory.antiquelegacy.client.render.model.shield.*;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.decoration.RondelModel;
import com.magistuarmory.client.render.model.decoration.TopDecorationModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;

public class AddonModels extends ModModelsProvider
{
	public static AddonModels INSTANCE = new AddonModels(EpicKnightsAntiqueLegacy.ID);

	// Armor
	public static final ModelLayerLocation ATTIC_HELMET_LOCATION = INSTANCE.addArmorModel("attic_helmet", AtticHelmetModel::createLayer);
	public static final ModelLayerLocation BELL_CUIRASS_LOCATION = INSTANCE.addArmorModel("bell_cuirass", BellCuirassModel::createLayer);
	public static final ModelLayerLocation BEOTIAN_HELMET_LOCATION = INSTANCE.addArmorModel("beotian_helmet", BeotianHelmetModel::createLayer);
	public static final ModelLayerLocation BRONZED_GALLEA_LOCATION = INSTANCE.addArmorModel("bronzed_gallea", GalleaModel::createLayer);
	public static final ModelLayerLocation RIDGE_HELMET_LOCATION = INSTANCE.addArmorModel("ridge_helmet", RidgeHelmetModel::createLayer);
	public static final ModelLayerLocation COOLUS_LOCATION = INSTANCE.addArmorModel("coolus", CoolusModel::createLayer);
	public static final ModelLayerLocation INTERCISA_LOCATION = INSTANCE.addArmorModel("intercisa", IntercisaModel::createLayer);
	public static final ModelLayerLocation MELOS_LOCATION = INSTANCE.addArmorModel("melos", MelosModel::createLayer);
	public static final ModelLayerLocation MONTEFORTINO_HELMET_LOCATION = INSTANCE.addArmorModel("montefortino_helmet", MontefortinoHelmetModel::createLayer);
	public static final ModelLayerLocation MUSCLE_CUIRASS_LOCATION = INSTANCE.addArmorModel("muscle_cuirass", MuscleCuirassModel::createLayer);
	public static final ModelLayerLocation NIEDERBIEBER_HELMET_LOCATION = INSTANCE.addArmorModel("niederbieber_helmet", NiederbieberHelmetModel::createLayer);
	public static final ModelLayerLocation PHRYGIAN_HELMET_LOCATION = INSTANCE.addArmorModel("phrygian_helmet", PhrygianHelmetModel::createLayer);
	public static final ModelLayerLocation PILOS_LOCATION = INSTANCE.addArmorModel("pilos", PilosModel::createLayer);
	public static final ModelLayerLocation SQUAMATA_LOCATION = INSTANCE.addArmorModel("squamata", SquamataModel::createLayer);
	public static final ModelLayerLocation ROMAN_PARADE_HELMET_LOCATION = INSTANCE.addArmorModel("roman_parade_helmet", RomanParadeHelmetModel::createLayer);
	public static final ModelLayerLocation APULO_CORINTHIAN_HELMET_LOCATION = INSTANCE.addArmorModel("apulo_corinthian_helmet", ApuloCorinthianHelmetModel::createLayer);
	public static final ModelLayerLocation CORINTHIAN_HELMET_LOCATION = INSTANCE.addArmorModel("corinthian_helmet", CorinthianHelmetModel::createLayer);
	public static final ModelLayerLocation GALLEA_LOCATION = INSTANCE.addArmorModel("gallea", GalleaModel::createLayer);
	public static final ModelLayerLocation GILDED_GALLEA_LOCATION = INSTANCE.addArmorModel("gilded_gallea", GildedGalleaModel::createLayer);
	public static final ModelLayerLocation GREEK_GREAVES_LOCATION = INSTANCE.addArmorModel("greek_greaves", GreekGreavesModel::createLayer);
	public static final ModelLayerLocation HAMATA_LOCATION = INSTANCE.addArmorModel("hamata", HamataModel::createLayer);
	public static final ModelLayerLocation HEDDERNHEIM_HELMET_LOCATION = INSTANCE.addArmorModel("heddernheim_helmet", HeddernheimHelmetModel::createLayer);
	public static final ModelLayerLocation ILLIRIAN_HELMET_LOCATION = INSTANCE.addArmorModel("illirian_helmet", IllirianHelmetModel::createLayer);
	public static final ModelLayerLocation MURMILLO_HELMET_LOCATION = INSTANCE.addArmorModel("murmillo_helmet", MurmilloHelmetModel::createLayer);
	public static final ModelLayerLocation MUSCULATA_LOCATION = INSTANCE.addArmorModel("musculata", MusculataModel::createLayer);
	public static final ModelLayerLocation OFFICER_SQUAMATA_LOCATION = INSTANCE.addArmorModel("officer_squamata", OfficerSquamataModel::createLayer);
	public static final ModelLayerLocation OPEN_ATTIC_HELMET_LOCATION = INSTANCE.addArmorModel("open_attic_helmet", AtticHelmetModel::createLayer);
	public static final ModelLayerLocation PROVOCATOR_HELMET_LOCATION = INSTANCE.addArmorModel("provocator_helmet", ProvocatorHelmetModel::createLayer);
	public static final ModelLayerLocation SECUTOR_HELMET_LOCATION = INSTANCE.addArmorModel("secutor_helmet", SecutorHelmetModel::createLayer);
	public static final ModelLayerLocation SEGMENTATA_LOCATION = INSTANCE.addArmorModel("segmentata", SegmentataModel::createLayer);
	public static final ModelLayerLocation UNDERARMOR_LOCATION = INSTANCE.addArmorModel("underarmor", UnderarmorModel::createLayer);
	public static final ModelLayerLocation THRACIAN_HELMET_LOCATION = INSTANCE.addArmorModel("thracian_helmet", ThracianHelmetModel::createLayer);
	public static final ModelLayerLocation LEFT_GLADIATOR_SHOULDER_PAD_LOCATION = INSTANCE.addArmorModel("left_gladiator_shoulder_pad", LeftGladiatorShoulderPadModel::createLayer);
	public static final ModelLayerLocation RIGHT_GLADIATOR_SHOULDER_PAD_LOCATION = INSTANCE.addArmorModel("right_gladiator_shoulder_pad", RightGladiatorShoulderPadModel::createLayer);
	public static final ModelLayerLocation IRON_LEFT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("iron_left_hand_manika", LeftHandManikaModel::createLayer);
	public static final ModelLayerLocation BRONZE_LEFT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("bronze_left_hand_manika", LeftHandManikaModel::createLayer);
	public static final ModelLayerLocation FABRIC_LEFT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("fabric_left_hand_manika", LeftHandManikaModel::createLayer);
	public static final ModelLayerLocation IRON_RIGHT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("iron_right_hand_manika", RightHandManikaModel::createLayer);
	public static final ModelLayerLocation BRONZE_RIGHT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("bronze_right_hand_manika", RightHandManikaModel::createLayer);
	public static final ModelLayerLocation FABRIC_RIGHT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("fabric_right_hand_manika", RightHandManikaModel::createLayer);
	public static final ModelLayerLocation THORAX_LOCATION = INSTANCE.addArmorModel("thorax", ThoraxModel::createLayer);
	public static final ModelLayerLocation SANDALS_LOCATION = INSTANCE.addArmorModel("sandals", SandalsModel::createLayer);
	public static final ModelLayerLocation LAUREL_WREATH_LOCATION = INSTANCE.addArmorModel("laurel_wreath", LaurelWreathModel::createLayer);
	public static final ModelLayerLocation KUBAN_HELMET_LOCATION = INSTANCE.addArmorModel("kuban_helmet", KubanHelmetModel::createLayer);
	public static final ModelLayerLocation SCYTHIAN_SCALE_HELMET_LOCATION = INSTANCE.addArmorModel("scythian_scale_helmet", ScythianScaleHelmetModel::createLayer);
	public static final ModelLayerLocation PHRYGIAN_CAP_LOCATION = INSTANCE.addArmorModel("phrygian_cap", PhrygianCapModel::createLayer);
	public static final ModelLayerLocation AGEN_PORT_HELMET_LOCATION = INSTANCE.addArmorModel("agen_port_helmet", AgenPortHelmetModel::createLayer);
	public static final ModelLayerLocation LA_GORGE_MEILLET_LOCATION = INSTANCE.addArmorModel("la_gorge_meillet", LaGorgeMeilletModel::createLayer);
	public static final ModelLayerLocation WATERLOO_HELMET_LOCATION = INSTANCE.addArmorModel("waterloo_helmet", WaterlooHelmetModel::createLayer);
	public static final ModelLayerLocation TUNIC_LOCATION = INSTANCE.addArmorModel("tunic", TunicModel::createLayer);
	public static final ModelLayerLocation FUR_CLOAK_LOCATION = INSTANCE.addArmorModel("fur_cloak", FurCloakModel::createLayer);

	// Decorations
	public static final LayerDefinition LEFT_HAND_MANIKA_MODEL = LeftHandManikaModel.createLayer();
	public static final LayerDefinition RIGHT_HAND_MANIKA_MODEL = RightHandManikaModel.createLayer();
	public static final LayerDefinition UNDERARMOR_MODEL = UnderarmorModel.createLayer();
	public static final LayerDefinition LAUREL_WREATH_DECORATION_MODEL = LaurelWreathDecorationModel.createLayer();


	public static final ModelLayerLocation BRONZE_HORNS_DECORATION_LOCATION = INSTANCE.addDecorationModel("bronze_horns", BronzeHornsModel::createLayer);
	public static final ModelLayerLocation BRONZE_SMALL_WINGS_DECORATION_LOCATION = INSTANCE.addDecorationModel("bronze_small_wings", BronzeSmallWingsModel::createLayer);
	public static final ModelLayerLocation ANTIQUE_CLOAK_DECORATION_LOCATION = INSTANCE.addDecorationModel("antique_cloak", CloakModel::createLayer);
	public static final ModelLayerLocation GREEK_CREST_DECORATION_LOCATION = INSTANCE.addDecorationModel("greek_crest", GreekCrestModel::createLayer);
	public static final ModelLayerLocation GREEK_HIGH_CREST_DECORATION_LOCATION = INSTANCE.addDecorationModel("greek_high_crest", GreekHighCrestModel::createLayer);
	public static final ModelLayerLocation HAIR_PLUME_DECORATION_LOCATION = INSTANCE.addDecorationModel("hair_plume", HairPlumeModel::createLayer);
	public static final ModelLayerLocation ROMAN_CREST_DECORATION_LOCATION = INSTANCE.addDecorationModel("roman_crest", RomanCrestModel::createLayer);
	public static final ModelLayerLocation ROMAN_CREST_ALT_DECORATION_LOCATION = INSTANCE.addDecorationModel("roman_crest_alt", RomanCrestAltModel::createLayer);
	public static final ModelLayerLocation ROMAN_FEATHERS_DECORATION_LOCATION = INSTANCE.addDecorationModel("roman_feathers", RomanFeathersModel::createLayer);
	public static final ModelLayerLocation ROMAN_TWO_FEATHERS_DECORATION_LOCATION = INSTANCE.addDecorationModel("roman_two_feathers", RomanTwoFeathersModel::createLayer);
	public static final ModelLayerLocation TRIPLE_FEATHER_DECORATION_LOCATION = INSTANCE.addDecorationModel("triple_feather", TripleFeatherModel::createLayer);
	public static final ModelLayerLocation TWO_HAIR_PLUMES_DECORATION_LOCATION = INSTANCE.addDecorationModel("two_hair_plumes", TwoHairPlumesModel::createLayer);
	public static final ModelLayerLocation LEFT_GLADIATOR_SHOULDER_PAD_DECORATION_LOCATION = INSTANCE.addDecorationModel("left_gladiator_shoulder_pad", LeftGladiatorShoulderPadModel::createLayer);
	public static final ModelLayerLocation RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION_LOCATION = INSTANCE.addDecorationModel("right_gladiator_shoulder_pad", RightGladiatorShoulderPadModel::createLayer);
	public static final ModelLayerLocation IRON_LEFT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("iron_left_hand_manika", () -> LEFT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation BRONZE_LEFT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("bronze_left_hand_manika", () -> LEFT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation FABRIC_LEFT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("fabric_left_hand_manika", () -> LEFT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation IRON_RIGHT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("iron_right_hand_manika", () -> RIGHT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation BRONZE_RIGHT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("bronze_right_hand_manika", () -> RIGHT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation FABRIC_RIGHT_HAND_MANIKA_DECORATION_LOCATION = INSTANCE.addDecorationModel("fabric_right_hand_manika", () -> RIGHT_HAND_MANIKA_MODEL);
	public static final ModelLayerLocation CHITON_DECORATION_LOCATION = INSTANCE.addDecorationModel("chiton", () -> UNDERARMOR_MODEL);
	public static final ModelLayerLocation GOLDEN_LAUREL_WREATH_DECORATION_LOCATION = INSTANCE.addDecorationModel("golden_laurel_wreath", () -> LAUREL_WREATH_DECORATION_MODEL);
	public static final ModelLayerLocation LAUREL_WREATH_DECORATION_LOCATION = INSTANCE.addDecorationModel("laurel_wreath", () -> LAUREL_WREATH_DECORATION_MODEL);
	public static final ModelLayerLocation SUBARMALIS_DECORATION_LOCATION = INSTANCE.addDecorationModel("subarmalis", () -> UNDERARMOR_MODEL);
	public static final ModelLayerLocation CELTIC_TUNIC_UNDERARMOR_DECORATION_LOCATION = INSTANCE.addDecorationModel("celtic_tunic_underarmor", TunicModel::createLayer);
	public static final ModelLayerLocation FUR_CLOAK_DECORATION_LOCATION = INSTANCE.addDecorationModel("fur_cloak", FurCloakDecorationModel::createLayer);

	// Shields
	public static final ModelLayerLocation REPUBLIC_SCUTUM = INSTANCE.addModel("republic_scutum", RepublicScutumModel::createLayer);
	public static final ModelLayerLocation IMPERAIL_SCUTUM = INSTANCE.addModel("imperial_scutum", ImperialScutumModel::createLayer);
	public static final ModelLayerLocation TUREOS = INSTANCE.addModel("tureos", TureosModel::createLayer);
	public static final ModelLayerLocation HOPLON = INSTANCE.addModel("hoplon", HoplonModel::createLayer);
	public static final ModelLayerLocation PELTA = INSTANCE.addModel("pelta", PeltaModel::createLayer);

	public AddonModels(String modId)
	{
		super(modId);
	}
}