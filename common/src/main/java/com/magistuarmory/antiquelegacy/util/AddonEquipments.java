package com.magistuarmory.antiquelegacy.util;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.antiquelegacy.item.AddonItems;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
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
        ListTag listtag = getLoreTag(aquila);
        listtag.add(StringTag.valueOf(Component.Serializer.toJson(Component.translatable("lore.antiquelegacy.varus_give_me_back_my_legions").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.DARK_PURPLE))));
        return aquila;
    }

    static ListTag getLoreTag(ItemStack itemStack) {
        CompoundTag compoundTag2;
        CompoundTag compoundTag;
        
        if (itemStack.hasTag()) 
        {
            compoundTag = itemStack.getTag();
        } 
        else
        {
            compoundTag = new CompoundTag();
            itemStack.setTag(compoundTag);
        }
        
        if (compoundTag.contains("display", 10))
        {
            compoundTag2 = compoundTag.getCompound("display");
        } 
        else
        {
            compoundTag2 = new CompoundTag();
            compoundTag.put("display", compoundTag2);
        }
        
        if (compoundTag2.contains("Lore", 9))
            return compoundTag2.getList("Lore", 8);
        
        ListTag listTag = new ListTag();
        compoundTag2.put("Lore", listTag);
        
        return listTag;
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
