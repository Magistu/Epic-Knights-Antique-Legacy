package com.magistuarmory.antiquelegacy.forge;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicKnightsAntiqueLegacy.ID)
public class EpicKnightsAntiqueLegacyForge
{
    public EpicKnightsAntiqueLegacyForge()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(EpicKnightsAntiqueLegacy.ID, modEventBus);

        EpicKnightsAntiqueLegacy.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
