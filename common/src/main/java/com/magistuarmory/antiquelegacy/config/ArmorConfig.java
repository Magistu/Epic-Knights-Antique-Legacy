package com.magistuarmory.antiquelegacy.config;

import com.magistuarmory.config.ArmorConfig.ArmorTypeConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "armor")
public class ArmorConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    private Map<String, ArmorTypeConfig> armor = new LinkedHashMap<>() {{
        put("atticHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bellCuirass", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 210, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("beotianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzedGallea", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeRidgeHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeCoolus", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeIntercisa", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeMelos", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeMontefortinoHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeMuscleCuirass", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 230, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("bronzeNiederbieberHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzePhrygianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzePilosCloset", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzePilos", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeSquamata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 190, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("romanParadeHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeApuloCorinthianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("chalcidianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("corinthianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 175}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("gallea", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("gildedGallea", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("goldenRidgeHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 150}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("greekGreaves", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 200, 0, 0}, new Integer[]{0, 3, 0, 0}, 9, true));
        put("hamata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 240, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("hamataOptio", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 240, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("heddernheimHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("illirianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironRidgeHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironIntercisa", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironMelos", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironNiederbieberHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironPilos", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 185}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironSquamata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 210, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("lateHamata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 250, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("murmilloHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("musculata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 260, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("officerSquamata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 240, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("openAtticHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("provocatorHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("secutorHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("segmentata", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 245, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("subarmalis", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 110, 0}, new Integer[]{0, 0, 2, 0}, 9, true));
        put("thracianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("tinnedMuscleCuirass", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 230, 0}, new Integer[]{0, 0, 6, 0}, 9, true));
        put("tinnedPhrygianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("weatheredCorinthianHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 90}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("cardiophylax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 190, 0}, new Integer[]{0, 0, 4, 0}, 9, true));
        put("leftGladiatorShoulderPad", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 180, 0}, new Integer[]{0, 0, 2, 0}, 9, true));
        put("rightGladiatorShoulderPad", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 180, 0}, new Integer[]{0, 0, 2, 0}, 9, true));
        put("ironLeftHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 220, 0}, new Integer[]{0, 0, 3, 0}, 9, true));
        put("bronzeLeftHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 200, 0}, new Integer[]{0, 0, 3, 0}, 9, true));
        put("fabricLeftHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 100, 0}, new Integer[]{0, 0, 1, 0}, 9, true));
        put("ironRightHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 220, 0}, new Integer[]{0, 0, 3, 0}, 9, true));
        put("bronzeRightHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 200, 0}, new Integer[]{0, 0, 3, 0}, 9, true));
        put("fabricRightHandManika", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 100, 0}, new Integer[]{0, 0, 1, 0}, 9, true));
        put("marsOfTodiThorax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 200, 0}, new Integer[]{0, 0, 4, 0}, 9, true));
        put("linothorax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 130, 0}, new Integer[]{0, 0, 4, 0}, 9, true));
        put("ironThorax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 230, 0}, new Integer[]{0, 0, 5, 0}, 9, true));
        put("scaleThorax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 200, 0}, new Integer[]{0, 0, 4, 0}, 9, true));
        put("sandals", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{90, 0, 0, 0}, new Integer[]{1, 0, 0, 0}, 9, true));
        put("chiton", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 90, 0}, new Integer[]{0, 0, 1, 0}, 9, true));
        put("goldenLaurelWreath", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 90}, new Integer[]{0, 0, 0, 0}, 9, true));
        put("laurelWreath", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 50}, new Integer[]{0, 0, 0, 0}, 9, true));
        put("kubanHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("scythianScaleThorax", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 200, 0}, new Integer[]{0, 0, 4, 0}, 9, true));
        put("scythianAtticHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("ironScythianScaleHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 200}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("bronzeScythianScaleHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("phrygianCap", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 70}, new Integer[]{0, 0, 0, 1}, 9, true));
        put("shortPhrygianCap", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 70}, new Integer[]{0, 0, 0, 1}, 9, true));
        put("ironRomanGreaves", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 180, 0, 0}, new Integer[]{0, 2, 0, 0}, 9, true));
        put("bronzeRomanGreaves", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 150, 0, 0}, new Integer[]{0, 2, 0, 0}, 9, true));
        put("agenPortHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("celticMontefortinoHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 160}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("laGorgeMeillet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("savaHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 190}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("waterlooHelmet", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 0, 170}, new Integer[]{0, 0, 0, 2}, 9, true));
        put("celticTunic", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{90, 0, 120, 0}, new Integer[]{1, 0, 1, 0}, 9, true));
        put("celticPants", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 90, 0, 0}, new Integer[]{0, 1, 0, 0}, 9, true));
        put("redCelticPants", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 90, 0, 0}, new Integer[]{0, 1, 0, 0}, 9, true));
        put("greenCelticPants", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 90, 0, 0}, new Integer[]{0, 1, 0, 0}, 9, true));
        put("brownCelticPants", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 90, 0, 0}, new Integer[]{0, 1, 0, 0}, 9, true));
        put("blackCelticPants", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 90, 0, 0}, new Integer[]{0, 1, 0, 0}, 9, true));
        put("furCloak", ArmorTypeConfig.of(0.0f, 0.0f, new Integer[]{0, 0, 90, 0}, new Integer[]{0, 0, 0, 0}, 9, true));
    }};

    public ArmorTypeConfig get(String name) {
        return this.armor.get(name);
    }
}
