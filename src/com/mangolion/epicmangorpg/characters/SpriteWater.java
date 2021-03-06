package com.mangolion.epicmangorpg.characters;

import com.mangolion.epicmangorpg.ais.AISimple;
import com.mangolion.epicmangorpg.components.Element;
import com.mangolion.epicmangorpg.components.Elements;
import com.mangolion.epicmangorpg.items.Items;
import com.mangolion.epicmangorpg.skills.Skill;
import com.mangolion.epicmangorpg.skills.SkillHealBasic;
import com.mangolion.epicmangorpg.skills.SkillKickBasic;
import com.mangolion.epicmangorpg.skills.SkillSlashBasic;
import com.mangolion.epicmangorpg.skills.SkillBasicSwordCombo;
import com.mangolion.epicmangorpg.skills.SkillBite;
import com.mangolion.epicmangorpg.skills.SkillBlock;
import com.mangolion.epicmangorpg.skills.SkillBodySlam;
import com.mangolion.epicmangorpg.skills.SkillDodge;
import com.mangolion.epicmangorpg.skills.SkillBoltFire;
import com.mangolion.epicmangorpg.skills.SkillBoltIce;
import com.mangolion.epicmangorpg.skills.SkillJumpAtk;
import com.mangolion.epicmangorpg.skills.SkillParry;
import com.mangolion.epicmangorpg.skills.SkillSlashHeavy;
import com.mangolion.epicmangorpg.skills.SkillStab;
import com.mangolion.epicmangorpg.weapons.Weapon;
import com.mangolion.epicmangorpg.weapons.GreatCopperSword;
import com.mangolion.epicmangorpg.weapons.LongSword;
import com.mangolion.epicmangorpg.weapons.Weapons;

public class SpriteWater extends Character{

	public SpriteWater() {
		super("Water Sprite", "A floating ball of water with wings, mainly use water skills.",70, 70, 40, 40, 5, 100, 60, 10, 0, 0,new Weapon("Water", 0, 100, Weapons.BareHand, 1, 1, 1f),  new SkillBodySlam(), new SkillBlock(), new SkillSlashBasic(), new SkillBoltFire());
		addElements(new Element("Fire", 1));
		ai = new AISimple(this);
		
		addDrop(Items.mstone, 0.8f, 1);
		addDrop(Items.crystalWater, 1f, 10);
	}
}
