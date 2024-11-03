package com.magistuarmory.antiquelegacy.misc;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.antiquelegacy.item.AddonItems;
import com.magistuarmory.antiquelegacy.util.AddonEquipments;
import com.magistuarmory.item.ArmorDecoration;
import com.magistuarmory.item.MedievalShieldItem;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class AddonCreativeTabs
{
	public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "particular_weapons"));
	public static final ResourceKey<CreativeModeTab> ARMOR_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "armor"));
	public static final ResourceKey<CreativeModeTab> ARMOR_DECORATIONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "armor_decorations"));
	public static final ResourceKey<CreativeModeTab> INGRIDIENTS_RESOURCE_KEY = CreativeModeTabs.INGREDIENTS;
	public static final ResourceKey<CreativeModeTab> NATURAL_BLOCKS_RESOURCE_KEY = CreativeModeTabs.NATURAL_BLOCKS;

	public static void init()
	{
		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.weaponItems)
		{
			if (item != AddonItems.WEATHERED_EAGLE_STANDARD)
				append(PARTICULAR_WEAPONS_RESOURCE_KEY, item);
			else
				CreativeTabRegistry.appendStack(PARTICULAR_WEAPONS_RESOURCE_KEY, AddonEquipments::getWeatheredEagleStandardItem);
		}

		for (RegistrySupplier<? extends MedievalShieldItem> item : AddonItems.INSTANCE.shieldItems)
			append(PARTICULAR_WEAPONS_RESOURCE_KEY, item);
		
		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.armorItems)
			append(ARMOR_RESOURCE_KEY, item);
		
		for (RegistrySupplier<? extends ArmorDecoration> item : AddonItems.INSTANCE.armorDecorationItems)
			append(ARMOR_DECORATIONS_RESOURCE_KEY, item);

		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.ingredientItems)
			append(INGRIDIENTS_RESOURCE_KEY, item);
		
		append(NATURAL_BLOCKS_RESOURCE_KEY, AddonItems.TIN_ORE);
		append(NATURAL_BLOCKS_RESOURCE_KEY, AddonItems.DEEPSLATE_TIN_ORE);
	}

	@SafeVarargs
	public static <I extends ItemLike, T extends Supplier<I>> void append(ResourceKey<CreativeModeTab> tab, T... items)
	{
		Arrays.stream(items).filter(Objects::nonNull).forEach((item) -> CreativeTabRegistry.append(tab, item));
	}
}
