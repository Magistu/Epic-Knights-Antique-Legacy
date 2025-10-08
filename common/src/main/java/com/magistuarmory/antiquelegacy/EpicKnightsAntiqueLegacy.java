package com.magistuarmory.antiquelegacy;

import com.magistuarmory.antiquelegacy.blocks.ModBlocks;
import com.magistuarmory.antiquelegacy.client.render.model.AddonModels;
import com.magistuarmory.antiquelegacy.config.AddonConfig;
import com.magistuarmory.antiquelegacy.event.CommonEvents;
import com.magistuarmory.antiquelegacy.item.AddonItems;
import com.magistuarmory.antiquelegacy.misc.AddonCreativeTabs;
import com.magistuarmory.antiquelegacy.misc.AddonMerchOffers;
import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicKnightsAntiqueLegacy
{
	public static final String ID = "antiquelegacy";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	public static AddonConfig CONFIG;
	
	static
	{
		AutoConfig.register(AddonConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(AddonConfig.class).getConfig();
	}
    
    public static void init()
    {
		LOGGER.info("Initializing Epic Knights: Antique Legacy for Minecraft 1.21.1!");
	    ModBlocks.init();
	    AddonItems.INSTANCE.init();
	    AddonCreativeTabs.init();
	    AddonMerchOffers.init();
	    CommonEvents.init();
		// Client-side model initialization
		if (Platform.getEnv() == EnvType.CLIENT)
			AddonModels.INSTANCE.init(AddonItems.INSTANCE);
		LOGGER.info("Epic Knights: Antique Legacy initialization complete!");
    }
}
