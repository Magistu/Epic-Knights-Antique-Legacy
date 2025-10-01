package com.magistuarmory.antiquelegacy.neoforge;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import dev.architectury.platform.Platform;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(EpicKnightsAntiqueLegacy.ID)
public class EpicKnightsAntiqueLegacyNeoForge {
    public EpicKnightsAntiqueLegacyNeoForge(IEventBus modEventBus) {
        EpicKnightsAntiqueLegacy.init();
    }
}