package com.magistuarmory.antiquelegacy.event;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.antiquelegacy.util.AddonEquipments;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.event.events.common.LifecycleEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;


public class CommonEvents
{
    
    public static void init()
    {
        EntityEvent.ADD.register(CommonEvents::onEntityJoinLevel);
        LifecycleEvent.SERVER_STARTING.register(CommonEvents::onServerStarting);
    }
    
    public static EventResult onEntityJoinLevel(Entity entity, Level level)
    {
        if (entity instanceof LivingEntity livingentity && !entity.level().isClientSide() && EpicKnights.GENERAL_CONFIG.equipMonsters)
            AddonEquipments.equip(livingentity);
        
        return EventResult.pass();
    }
    
    public static void onServerStarting(MinecraftServer server)
    {
        AddonEquipments.setup(server);
    }

}
