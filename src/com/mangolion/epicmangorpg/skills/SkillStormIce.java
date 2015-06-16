package com.mangolion.epicmangorpg.skills;

import java.util.LinkedList;

import com.mangolion.epicmangorpg.characters.Character;
import com.mangolion.epicmangorpg.components.ActionType;
import com.mangolion.epicmangorpg.components.Element;
import com.mangolion.epicmangorpg.components.Elements;
import com.mangolion.epicmangorpg.events.Event;
import com.mangolion.epicmangorpg.events.EventArrow;
import com.mangolion.epicmangorpg.events.EventRange;
import com.mangolion.epicmangorpg.messages.Msg;
import com.mangolion.epicmangorpg.statuses.StatusPoison;
import com.mangolion.epicmangorpg.steps.Step;
import com.mangolion.epicmangorpg.weapons.Weapons;

public class SkillStormIce extends Skill {

	public SkillStormIce() {
		super("Ice Blizzard", "Summon a giant snow storm that freezes enemies",Weapons.Wand, ActionType.Magic);
		weapons.add(Weapons.Staff);
		addSteps(new Step(this, "Ice Blizzard", "",ActionType.Magic, 1f, 0.3f, 0.1f,0.7f){

			public void init() {
			strBased = false;
			intBased = true;
			dmgBase = 5;
			mpCost = 10;
			isAOE = true;
			setElement(new Element("Ice", 1));
			setEvents(new EventStorm(0.3f, getCharacter(), null, 20, this));
				super.init();
			}

	
		}.setChances(1, 0, -0.2f),
		new Step(this, "Ice Blizzard", "",ActionType.Magic, 0.5f, 0.3f, 0.1f,1f){

			public void init() {
			strBased = false;
			intBased = true;
			dmgBase = 5;
			mpCost = 15;
			isAOE = true;
			setElement(new Element("Ice", 1));
			setEvents(new EventStorm(0.3f, getCharacter(), null, 20, this));
				super.init();
			}
		
		}.setChances(1, 0, -0.2f),
		new Step(this, "Ice Blizzard", "",ActionType.Magic, 0.5f, 0.3f, 0.1f, 1.2f){

			public void init() {
			strBased = false;
			intBased = true;
			dmgBase = 5;
			mpCost = 20;
			isAOE = true;
			setElement(new Element("Ice", 1));
			setEvents(new EventStorm(0.3f, getCharacter(), null, 20, this));
				super.init();
			}


		}.setChances(1, 0, -0.2f));
		setObservable(true, 0.7f);
	}
	public class EventStorm extends EventRange{

		public EventStorm(float time, Character source, Character target, float dmgbase, Step step) {
			super("Ice Blizzard", "", time, source, target, dmgbase, step);
			setMessages(null, null, null, null);
			isAOE = true;
			//setStatus(new StatusPoison(null, 1), 1);
		}

}
}
