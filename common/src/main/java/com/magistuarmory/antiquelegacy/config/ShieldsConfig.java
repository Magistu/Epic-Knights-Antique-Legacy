package com.magistuarmory.antiquelegacy.config;

import com.magistuarmory.item.ShieldType;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "shields")
public class ShieldsConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    private Map<String, ShieldType> shields = new LinkedHashMap<>() {{
        put("republicScutum", ShieldType.of(420, 0.9f, 6, 11, true, false));
        put("imperialScutum", ShieldType.of(420, 0.9f, 6, 11, true, false));
        put("tureos", ShieldType.of(420, 0.9f, 6, 11, true, false));
        put("hoplon", ShieldType.of(440, 1.5f, 7, 12, true, false));
        put("pelta", ShieldType.of(380, 0.8f, 3, 7, true, false));
    }};

    public ShieldType get(String name) {
        return shields.get(name);
    }
}
