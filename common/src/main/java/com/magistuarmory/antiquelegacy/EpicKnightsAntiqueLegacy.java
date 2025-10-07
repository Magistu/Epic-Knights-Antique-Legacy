package com.magistuarmory.antiquelegacy;

import com.magistuarmory.antiquelegacy.block.ModBlocks;
import com.magistuarmory.antiquelegacy.client.render.model.AddonModels;
import com.magistuarmory.antiquelegacy.config.AddonConfig;
import com.magistuarmory.antiquelegacy.event.CommonEvents;
import com.magistuarmory.antiquelegacy.item.AddonItems;
import com.magistuarmory.antiquelegacy.misc.AddonCreativeTabs;
import com.magistuarmory.antiquelegacy.misc.AddonMerchOffers;
import com.magistuarmory.antiquelegacy.worldgen.ModBiomeModifications;
import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.EnvType;

public class EpicKnightsAntiqueLegacy
{
	public static final String ID = "antiquelegacy";
	public static AddonConfig CONFIG;
	
	static
	{
		AutoConfig.register(AddonConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(AddonConfig.class).getConfig();
	}
    
    public static void init()
    {
		System.out.println("Hello from Epic Knights: Antique Legacy init!");
	    ModBlocks.init();
	    AddonItems.INSTANCE.init();
	    AddonCreativeTabs.init();
	    AddonMerchOffers.init();
	    ModBiomeModifications.init();
	    CommonEvents.init();
		if (Platform.getEnv() == EnvType.CLIENT)
			AddonModels.INSTANCE.init(AddonItems.INSTANCE);
    }
}
