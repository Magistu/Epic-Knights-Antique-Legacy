package com.magistuarmory.antiquelegacy.item;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.config.ShieldsConfig;
import com.magistuarmory.item.ShieldType;

public final class AddonShieldTypes
{
    public static final ShieldsConfig SHIELDS_CONFIG = EpicKnightsAntiqueLegacy.CONFIG.shields;

    public static final ShieldType REPUBLIC_SCUTUM = new ShieldType(420, 0.9f, 6, 11, SHIELDS_CONFIG.enableImperialScutum);
    public static final ShieldType IMPERIAL_SCUTUM = new ShieldType(420, 0.9f, 6, 11, SHIELDS_CONFIG.enableRepublicScutum);
    public static final ShieldType TUREOS = new ShieldType(420, 0.9f, 6, 11, SHIELDS_CONFIG.enableTureos);
    public static final ShieldType HOPLON = new ShieldType(480, 1.5f, 7, 14, SHIELDS_CONFIG.enableHoplon);
    public static final ShieldType PELTA = new ShieldType(380, 0.8f, 3, 7, SHIELDS_CONFIG.enablePelta);
}
