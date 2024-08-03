package com.magistuarmory.antiquelegacy.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

@Config(name = "weapons")
public class WeaponsConfig implements ConfigData
{
    @ConfigEntry.Gui.CollapsibleObject
    public AntiqueDaggerConfig antiqueDagger;
    @ConfigEntry.Gui.CollapsibleObject
    public SicaConfig sica;
    @ConfigEntry.Gui.CollapsibleObject
    public EagleStandardConfig eagleStandard;
    @ConfigEntry.Gui.CollapsibleObject
    public WeatheredEagleStandardConfig weatheredEagleStandard;
    @ConfigEntry.Gui.CollapsibleObject
    public AntiqueSpearConfig antiqueSpear;
    @ConfigEntry.Gui.CollapsibleObject
    public DoruConfig doru;
    @ConfigEntry.Gui.CollapsibleObject
    public RetiariusConfig retiarius;
    @ConfigEntry.Gui.CollapsibleObject
    public SarissaConfig sarissa;
    @ConfigEntry.Gui.CollapsibleObject
    public TriariiSpearConfig triariiSpear;
    @ConfigEntry.Gui.CollapsibleObject
    public AntiqueSwordConfig antiqueSword;
    @ConfigEntry.Gui.CollapsibleObject
    public CelticSwordConfig celticSword;
    @ConfigEntry.Gui.CollapsibleObject
    public EarlySpathaConfig earlySpatha;
    @ConfigEntry.Gui.CollapsibleObject
    public GladiatorSwordConfig gladiatorSword;
    @ConfigEntry.Gui.CollapsibleObject
    public GladiusConfig gladius;
    @ConfigEntry.Gui.CollapsibleObject
    public KopisConfig kopis;
    @ConfigEntry.Gui.CollapsibleObject
    public RepublicGladiusConfig republicGladius;
    @ConfigEntry.Gui.CollapsibleObject
    public RhomphaiaConfig rhomphaia;
    @ConfigEntry.Gui.CollapsibleObject
    public SingleEdgedSwordConfig singleEdgedSword;
    @ConfigEntry.Gui.CollapsibleObject
    public SpathaConfig spatha;
    @ConfigEntry.Gui.CollapsibleObject
    public XiphosConfig xiphos;

    public WeaponsConfig() {
        this.antiqueDagger = new AntiqueDaggerConfig();
        this.sica = new SicaConfig();
        this.eagleStandard = new EagleStandardConfig();
        this.weatheredEagleStandard = new WeatheredEagleStandardConfig();
        this.antiqueSpear = new AntiqueSpearConfig();
        this.doru = new DoruConfig();
        this.retiarius = new RetiariusConfig();
        this.sarissa = new SarissaConfig();
        this.triariiSpear = new TriariiSpearConfig();
        this.antiqueSword = new AntiqueSwordConfig();
        this.celticSword = new CelticSwordConfig();
        this.earlySpatha = new EarlySpathaConfig();
        this.gladiatorSword = new GladiatorSwordConfig();
        this.gladius = new GladiusConfig();
        this.kopis = new KopisConfig();
        this.republicGladius = new RepublicGladiusConfig();
        this.rhomphaia = new RhomphaiaConfig();
        this.singleEdgedSword = new SingleEdgedSwordConfig();
        this.spatha = new SpathaConfig();
        this.xiphos = new XiphosConfig();
    }

    public static class AntiqueDaggerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public AntiqueDaggerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.80f;
            this.baseAttackSpeed = 1.80f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SicaConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SicaConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.75f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class EagleStandardConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public EagleStandardConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.00f;
            this.baseAttackSpeed = 1.10f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class WeatheredEagleStandardConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public WeatheredEagleStandardConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.00f;
            this.baseAttackSpeed = 1.10f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class AntiqueSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public AntiqueSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.80f;
            this.baseAttackSpeed = 1.30f;
            this.bonusAttackReach = 1.45f;
        }
    }
    public static class DoruConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public DoruConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.28f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 2.00f;
        }
    }
    public static class RetiariusConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RetiariusConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.40f;
        }
    }
    public static class SarissaConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SarissaConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.80f;
            this.baseAttackSpeed = 0.80f;
            this.bonusAttackReach = 4.00f;
        }
    }
    public static class TriariiSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public TriariiSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.10f;
            this.baseAttackSpeed = 1.25f;
            this.bonusAttackReach = 1.90f;
        }
    }
    public static class AntiqueSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public AntiqueSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.55f;
            this.baseAttackSpeed = 1.57f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class CelticSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public CelticSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.60f;
            this.baseAttackSpeed = 1.55f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class EarlySpathaConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public EarlySpathaConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    
    public static class GladiatorSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GladiatorSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class GladiusConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GladiusConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.30f;
            this.baseAttackSpeed = 1.70f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class KopisConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public KopisConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.30f;
            this.baseAttackSpeed = 1.70f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RepublicGladiusConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RepublicGladiusConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.35f;
            this.baseAttackSpeed = 1.65f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RhomphaiaConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RhomphaiaConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.70f;
            this.baseAttackSpeed = 1.50f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SingleEdgedSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SingleEdgedSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.30f;
            this.baseAttackSpeed = 1.65f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SpathaConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SpathaConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class XiphosConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public XiphosConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.30f;
            this.baseAttackSpeed = 1.70f;
            this.bonusAttackReach = 0.00f;
        }
    }
}
