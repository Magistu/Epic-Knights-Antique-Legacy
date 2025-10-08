package com.magistuarmory.antiquelegacy.util;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.antiquelegacy.item.AddonItems;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

public class AddonEquipments
{
    static List<ItemStack> DEAD_LEGIONS_ITEMS = new ArrayList<>();
    
    public static void setup(MinecraftServer server) {
        DEAD_LEGIONS_ITEMS.add(getWeatheredEagleStandardItem());
    }
    
    public static ItemStack getWeatheredEagleStandardItem() {
        ItemStack aquila = new ItemStack(AddonItems.WEATHERED_EAGLE_STANDARD.get());
        return aquila;
    }

    
    public static void equip(LivingEntity livingentity)
    {
        if (livingentity instanceof Zombie || livingentity instanceof Skeleton) {
            setRandomItemSlot(livingentity, EquipmentSlot.MAINHAND, DEAD_LEGIONS_ITEMS, 1f / 60, livingentity.getRandom());
        }
    }

    static void setRandomItemSlot(LivingEntity entity, EquipmentSlot slot, List<? extends ItemStack> stacks, double chance, RandomSource rand)
    {
        if (stacks.size() == 0)
        {
            if (EpicKnights.GENERAL_CONFIG.overrideEquipment)
                entity.setItemSlot(slot, new ItemStack(Items.AIR));
            return;
        }

        int id = rand.nextInt((int) (stacks.size() / chance));

        if (id < stacks.size())
            entity.setItemSlot(slot, stacks.get(id));

        else if (EpicKnights.GENERAL_CONFIG.overrideEquipment)
            entity.setItemSlot(slot, new ItemStack(Items.AIR));
    }
}
