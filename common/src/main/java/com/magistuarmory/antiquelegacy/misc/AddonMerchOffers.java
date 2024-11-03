package com.magistuarmory.antiquelegacy.misc;

import com.magistuarmory.antiquelegacy.item.AddonItems;
import com.magistuarmory.item.ModItems;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AddonMerchOffers
{
	public static VillagerTrades.ItemListing[] WANDERING_TRADER_TRADES;
	
	public static void init()
	{
		LifecycleEvent.SETUP.register(AddonMerchOffers::setup);
	}
	
	public static void setup()
	{
		WANDERING_TRADER_TRADES = new VillagerTrades.ItemListing[] {
				new SimpleTrade(new ItemStack(Items.EMERALD, 10), ItemStack.EMPTY, new ItemStack(AddonItems.GOLDEN_LAUREL_WREATH_DECORATION.get()), 1, 0, 1),
				new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.LAUREL_WREATH_DECORATION.get()), 7, 0, 1),
				new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.BRONZE_SMALL_WINGS_DECORATION.get()), 7, 0, 1),
				new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.BRONZE_HORNS_DECORATION.get()), 7, 0, 1),
				new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.FUR_CLOAK_DECORATION.get()), 7, 0, 1)
		};
		
		TradeRegistry.registerTradeForWanderingTrader(false, AddonMerchOffers.WANDERING_TRADER_TRADES);
	}
}
