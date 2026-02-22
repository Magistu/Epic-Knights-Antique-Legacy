package com.magistuarmory.antiquelegacy.config;

import com.magistuarmory.item.WeaponType;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "weapons")
public class WeaponsConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    private Map<String, WeaponType> meleeWeapons = new LinkedHashMap<>() {{
        put("antiqueDagger", WeaponType.of(2.80f, 1.80f, 0.00f, 0.00f, 0.6f, 0, true));
        put("sica", WeaponType.of(3.00f, 1.75f, 0.00f, 0.00f, 0.8f, 0, true));
        put("eagleStandard", WeaponType.of(2.00f, 1.10f, 1.00f, 0.05f, 3.8f, 0, true, 2, 0.0f, false, false, false));
        put("weatheredEagleStandard", WeaponType.of(2.00f, 1.10f, 1.00f, 0.05f, 3.8f, 0, true, 2, 0.0f, false, false, false));
        put("rhomphaia", WeaponType.of(3.70f, 1.50f, 0.00f, 0.00f, 1.9f, 0, true, 1, 0.0f, false, false, false));
        put("antiqueSpear", WeaponType.of(2.80f, 1.30f, 1.45f, 0.00f, 2.0f, 0, true, 0, 2.0f, true, false, false));
        put("doru", WeaponType.of(3.28f, 1.20f, 2.00f, 0.00f, 2.0f, 0, true, 0, 3.0f, true, false, false));
        put("retiarius", WeaponType.of(4.00f, 1.20f, 1.40f, 0.00f, 1.3f, 0, true));
        put("sarissa", WeaponType.of(0.0f, 1.10f, 4.00f, 0.00f, 4.0f, 0, true));
        put("triariiSpear", WeaponType.of(3.10f, 1.25f, 1.90f, 0.00f, 2.0f, 0, true, 0, 2.0f, true, false, false));
        put("antiqueSword", WeaponType.of(3.55f, 1.57f, 0.00f, 0.00f, 1.1f, 0, true));
        put("celticSword", WeaponType.of(3.60f, 1.55f, 0.00f, 0.00f, 1.3f, 0, true));
        put("earlySpatha", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.0f, 0, true));
        put("gladiatorSword", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.0f, 0, true));
        put("gladius", WeaponType.of(3.30f, 1.70f, 0.00f, 0.00f, 1.0f, 0, true));
        put("kopis", WeaponType.of(3.30f, 1.70f, 0.00f, 0.00f, 1.0f, 0, true));
        put("republicGladius", WeaponType.of(3.35f, 1.65f, 0.00f, 0.00f, 1.0f, 0, true));
        put("singleEdgedSword", WeaponType.of(3.30f, 1.65f, 0.00f, 0.00f, 0.9f, 0, true));
        put("spatha", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.5f, 0, true));
        put("xiphos", WeaponType.of(3.30f, 1.70f, 0.00f, 0.00f, 1.3f, 0, true));
    }};

    public WeaponType getMelee(String name) {
        return this.meleeWeapons.get(name);
    }
}
