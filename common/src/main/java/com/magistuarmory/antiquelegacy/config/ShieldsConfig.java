// 
// Decompiled by Procyon v0.5.36
// 

package com.magistuarmory.antiquelegacy.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "shields")
public class ShieldsConfig implements ConfigData
{
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableRepublicScutum;
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableImperialScutum;
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableTureos;
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableHoplon;
    @ConfigEntry.Gui.RequiresRestart
    public boolean enablePelta;
    
    public ShieldsConfig() {
        this.enableRepublicScutum = true;
        this.enableImperialScutum = true;
        this.enableTureos = true;
        this.enableHoplon = true;
        this.enablePelta = true;
    }
}
