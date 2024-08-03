package com.magistuarmory.antiquelegacy.item;

import com.magistuarmory.antiquelegacy.EpicKnightsAntiqueLegacy;
import com.magistuarmory.antiquelegacy.config.WeaponsConfig;
import com.magistuarmory.item.WeaponType;

public class AddonWeaponTypes
{
	public static final WeaponsConfig WEAPONS_CONFIG = EpicKnightsAntiqueLegacy.CONFIG.weapons;

	public static final WeaponType ANTIQUE_DAGGER = new WeaponType(WEAPONS_CONFIG.antiqueDagger.baseAttackDamage, WEAPONS_CONFIG.antiqueDagger.baseAttackSpeed, WEAPONS_CONFIG.antiqueDagger.bonusAttackReach, 0.00f, 0.6f, 0, WEAPONS_CONFIG.antiqueDagger.enabled);
	public static final WeaponType SICA = new WeaponType(WEAPONS_CONFIG.sica.baseAttackDamage, WEAPONS_CONFIG.sica.baseAttackSpeed, WEAPONS_CONFIG.sica.bonusAttackReach, 0.00f, 0.8f, 0, WEAPONS_CONFIG.sica.enabled);
	public static final WeaponType EAGLE_STANDARD = new WeaponType(WEAPONS_CONFIG.eagleStandard.baseAttackDamage, WEAPONS_CONFIG.eagleStandard.baseAttackSpeed, WEAPONS_CONFIG.eagleStandard.bonusAttackReach, 0.05f, 3.8f, 0, WEAPONS_CONFIG.eagleStandard.enabled).setTwoHanded(2);
	public static final WeaponType WEATHERED_EAGLE_STANDARD = new WeaponType(WEAPONS_CONFIG.weatheredEagleStandard.baseAttackDamage, WEAPONS_CONFIG.weatheredEagleStandard.baseAttackSpeed, WEAPONS_CONFIG.weatheredEagleStandard.bonusAttackReach, 0.05f, 3.8f, 0, WEAPONS_CONFIG.weatheredEagleStandard.enabled).setTwoHanded(2);
	public static final WeaponType RHOMPHAIA = new WeaponType(WEAPONS_CONFIG.rhomphaia.baseAttackDamage, WEAPONS_CONFIG.rhomphaia.baseAttackSpeed, WEAPONS_CONFIG.rhomphaia.bonusAttackReach, 0.00f, 1.9f, 0, WEAPONS_CONFIG.rhomphaia.enabled).setTwoHanded(1);
	public static final WeaponType ANTIQUE_SPEAR = new WeaponType(WEAPONS_CONFIG.antiqueSpear.baseAttackDamage, WEAPONS_CONFIG.antiqueSpear.baseAttackSpeed, WEAPONS_CONFIG.antiqueSpear.bonusAttackReach, 0.00f, 2.0f, 0, WEAPONS_CONFIG.antiqueSpear.enabled).setMaxBlockDamage(2.00f);
	public static final WeaponType DORU = new WeaponType(WEAPONS_CONFIG.doru.baseAttackDamage, WEAPONS_CONFIG.doru.baseAttackSpeed, WEAPONS_CONFIG.doru.bonusAttackReach, 0.00f, 2.0f, 0, WEAPONS_CONFIG.doru.enabled).setMaxBlockDamage(3.00f);
	public static final WeaponType RETIARIUS = new WeaponType(WEAPONS_CONFIG.retiarius.baseAttackDamage, WEAPONS_CONFIG.retiarius.baseAttackSpeed, WEAPONS_CONFIG.retiarius.bonusAttackReach, 0.00f, 1.3f, 0, WEAPONS_CONFIG.retiarius.enabled);
	public static final WeaponType SARISSA = new WeaponType(WEAPONS_CONFIG.sarissa.baseAttackDamage, WEAPONS_CONFIG.sarissa.baseAttackSpeed, WEAPONS_CONFIG.sarissa.bonusAttackReach, 0.00f, 4.0f, 0, WEAPONS_CONFIG.sarissa.enabled);
	public static final WeaponType TRIARII_SPEAR = new WeaponType(WEAPONS_CONFIG.triariiSpear.baseAttackDamage, WEAPONS_CONFIG.triariiSpear.baseAttackSpeed, WEAPONS_CONFIG.triariiSpear.bonusAttackReach, 0.00f, 2.0f, 0, WEAPONS_CONFIG.triariiSpear.enabled).setMaxBlockDamage(2.00f);
	public static final WeaponType ANTIQUE_SWORD = new WeaponType(WEAPONS_CONFIG.antiqueSword.baseAttackDamage, WEAPONS_CONFIG.antiqueSword.baseAttackSpeed, WEAPONS_CONFIG.antiqueSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.antiqueSword.enabled);
	public static final WeaponType CELTIC_SWORD = new WeaponType(WEAPONS_CONFIG.celticSword.baseAttackDamage, WEAPONS_CONFIG.celticSword.baseAttackSpeed, WEAPONS_CONFIG.celticSword.bonusAttackReach, 0.00f, 1.3f, 0, WEAPONS_CONFIG.celticSword.enabled);
	public static final WeaponType EARLY_SPATHA = new WeaponType(WEAPONS_CONFIG.earlySpatha.baseAttackDamage, WEAPONS_CONFIG.earlySpatha.baseAttackSpeed, WEAPONS_CONFIG.earlySpatha.bonusAttackReach, 0.00f, 1.0f, 0, WEAPONS_CONFIG.earlySpatha.enabled);
	public static final WeaponType GLADIATOR_SWORD = new WeaponType(WEAPONS_CONFIG.gladiatorSword.baseAttackDamage, WEAPONS_CONFIG.gladiatorSword.baseAttackSpeed, WEAPONS_CONFIG.gladiatorSword.bonusAttackReach, 0.00f, 1.0f, 0, WEAPONS_CONFIG.gladiatorSword.enabled);
	public static final WeaponType GLADIUS = new WeaponType(WEAPONS_CONFIG.gladius.baseAttackDamage, WEAPONS_CONFIG.gladius.baseAttackSpeed, WEAPONS_CONFIG.gladius.bonusAttackReach, 0.00f, 1.0f, 0, WEAPONS_CONFIG.gladius.enabled);
	public static final WeaponType KOPIS = new WeaponType(WEAPONS_CONFIG.kopis.baseAttackDamage, WEAPONS_CONFIG.kopis.baseAttackSpeed, WEAPONS_CONFIG.kopis.bonusAttackReach, 0.00f, 1.0f, 0, WEAPONS_CONFIG.kopis.enabled);
	public static final WeaponType REPUBLIC_GLADIUS = new WeaponType(WEAPONS_CONFIG.republicGladius.baseAttackDamage, WEAPONS_CONFIG.republicGladius.baseAttackSpeed, WEAPONS_CONFIG.republicGladius.bonusAttackReach, 0.00f, 1.0f, 0, WEAPONS_CONFIG.republicGladius.enabled);
	public static final WeaponType SINGLE_EDGED_SWORD = new WeaponType(WEAPONS_CONFIG.singleEdgedSword.baseAttackDamage, WEAPONS_CONFIG.singleEdgedSword.baseAttackSpeed, WEAPONS_CONFIG.singleEdgedSword.bonusAttackReach, 0.00f, 0.9f, 0, WEAPONS_CONFIG.singleEdgedSword.enabled);
	public static final WeaponType SPATHA = new WeaponType(WEAPONS_CONFIG.spatha.baseAttackDamage, WEAPONS_CONFIG.spatha.baseAttackSpeed, WEAPONS_CONFIG.spatha.bonusAttackReach, 0.00f, 1.5f, 0, WEAPONS_CONFIG.spatha.enabled);
	public static final WeaponType XIPHOS = new WeaponType(WEAPONS_CONFIG.xiphos.baseAttackDamage, WEAPONS_CONFIG.xiphos.baseAttackSpeed, WEAPONS_CONFIG.xiphos.bonusAttackReach, 0.00f, 1.3f, 0, WEAPONS_CONFIG.xiphos.enabled);
}
