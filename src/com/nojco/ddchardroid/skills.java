/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.widget.ScrollView;

/**
 * @author halljj
 *
 */
public class skills extends ScrollView {
	public skillArmor acrobatics;
	public skill arcana;
	public skillArmor athletics;
	public skill bluff;
	public skill diplomacy;
	public skill dungeoneering;
	public skillArmor endurance;
	public skill heal;
	public skill history;
	public skill insight;
	public skill intimidate;
	public skill nature;
	public skill perception;
	public skill religion;
	public skillArmor stealth;
	public skill streetwise;
	public skillArmor thievery;
	
	/**
	 * 
	 */
	public skills(Context c) {
		// TODO Auto-generated constructor stub
		super(c);
		acrobatics 		= new skillArmor(c, "Acrobatics", 	  abilitiesEnum.Dexterity);
		arcana			= new skill		(c, "Arcana", 		  abilitiesEnum.Intelligence);
		athletics 		= new skillArmor(c, "Athletics", 	  abilitiesEnum.Strength);
		bluff 			= new skill		(c, "Bluff", 		  abilitiesEnum.Charisma);
		diplomacy 		= new skill		(c, "Diplomacy", 	  abilitiesEnum.Charisma);
		dungeoneering 	= new skill		(c, "Dungeoneering",  abilitiesEnum.Wisdom);
		endurance 		= new skillArmor(c, "Endurance", 	  abilitiesEnum.Constitution);
		heal 			= new skill		(c, "Heal", 		  abilitiesEnum.Wisdom);
		history 		= new skill		(c, "History", 	  	  abilitiesEnum.Intelligence);
		insight 		= new skill		(c, "Insight", 	  	  abilitiesEnum.Wisdom);
		intimidate 		= new skill		(c, "Intimidate", 	  abilitiesEnum.Charisma);
		nature 			= new skill		(c, "Nature", 		  abilitiesEnum.Wisdom);
		perception 		= new skill		(c, "Perception", 	  abilitiesEnum.Wisdom);
		religion 		= new skill		(c, "Religion", 	  abilitiesEnum.Intelligence);
		stealth 		= new skillArmor(c, "Stealth", 	  	  abilitiesEnum.Dexterity);
		streetwise 		= new skill		(c, "Streetwise", 	  abilitiesEnum.Charisma);
		thievery 		= new skillArmor(c, "Thievery", 	  abilitiesEnum.Dexterity);
		
		vertLayout layout = new vertLayout (c);
		layout.addView(acrobatics);
		layout.addView(arcana);
		layout.addView(athletics);
		layout.addView(bluff);
		layout.addView(diplomacy);
		layout.addView(dungeoneering);
		layout.addView(endurance);
		layout.addView(heal);
		layout.addView(history);
		layout.addView(insight);
		layout.addView(intimidate);
		layout.addView(nature);
		layout.addView(perception);
		layout.addView(religion);
		layout.addView(stealth);
		layout.addView(streetwise);
		layout.addView(thievery);
		
		addView(layout);
	}

}
