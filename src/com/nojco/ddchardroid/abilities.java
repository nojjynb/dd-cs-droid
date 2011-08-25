/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * @author halljj
 *
 */
public class abilities extends LinearLayout {

	public abilityStat strength;
	public abilityStat constitution;
	public abilityStat dexterity;
	public abilityStat intelligence;
	public abilityStat wisdom;
	public abilityStat charisma;
	/**
	 * 
	 */
	public abilities(Context c) {
		// TODO Auto-generated constructor stub
		super(c);
		strength 		= new abilityStat (c, 0, "STR");
		constitution 	= new abilityStat (c, 0, "CON");
		dexterity 		= new abilityStat (c, 0, "DEX");
		intelligence 	= new abilityStat (c, 0, "INT");
		wisdom 			= new abilityStat (c, 0, "WIS");
		charisma 		= new abilityStat (c, 0, "CHA");
		init(c);
	}
	
	public abilities(Context c, Integer s, Integer cl, Integer d, Integer i, Integer w, Integer ch) {
		// TODO Auto-generated constructor stub
		super(c);
		strength 		= new abilityStat (c, s,  "STR");
		constitution 	= new abilityStat (c, cl, "CON");
		dexterity 		= new abilityStat (c, d,  "DEX");
		intelligence 	= new abilityStat (c, i,  "INT");
		wisdom 			= new abilityStat (c, w,  "WIS");
		charisma 		= new abilityStat (c, ch, "CHA");
		init(c);
	}
	
	public abilities(Context c, Integer s, Integer cl, Integer d, Integer i, Integer w, Integer ch, Integer b) {
		// TODO Auto-generated constructor stub
		super(c);
		strength 		= new abilityStat (c, s,  "STR", b);
		constitution 	= new abilityStat (c, cl, "CON", b);
		dexterity 		= new abilityStat (c, d,  "DEX", b);
		intelligence 	= new abilityStat (c, i,  "INT", b);
		wisdom 			= new abilityStat (c, w,  "WIS", b);
		charisma 		= new abilityStat (c, ch, "CHA", b);
		init(c);
	}
	
	private void init (Context c)
	{
		setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
		setOrientation(LinearLayout.VERTICAL);
		/*TextView label = new TextView (c);
		label.setText("ABILITY SCORES");
		label.setBackgroundColor(android.graphics.Color.DKGRAY);
		addView(label);*/
		LinearLayout labels = new LinearLayout(c);
		labels.setOrientation(LinearLayout.HORIZONTAL);
		label score = new label (c, "SCORE");
		label abil  = new label (c, "ABILITY");
		label abilm = new label (c, "ABIL MOD");
		label basel = new label (c, "1/2 LVL");
		labels.addView(score);
		labels.addView(abil);
		labels.addView(abilm);
		labels.addView(basel);	
		addView(labels);
		addView(strength);
		addView(constitution);
		addView(dexterity);
		addView(intelligence);
		addView(wisdom);
		addView(charisma);
	}
	
	public void setStr (Integer s)
	{
		strength.setScore(s);
	}
	
	public void increaseStr (Integer s)
	{
		strength.setScore(s + strength.getScore());
	}
	
	public Integer getStr ()
	{
		return strength.getScore();
	}
	
	public Integer getStrMod ()
	{
		return strength.getMod();
	}
	
	public void setCon (Integer s)
	{
		constitution.setScore(s);
	}
	
	public void increaseCon (Integer s)
	{
		constitution.setScore(s + constitution.getScore());
	}
	
	public Integer getCon ()
	{
		return constitution.getScore();
	}
	
	public Integer getConMod ()
	{
		return constitution.getMod();
	}
	
	public void setDex (Integer s)
	{
		dexterity.setScore(s);
	}
	
	public void increaseDex (Integer s)
	{
		dexterity.setScore(s + dexterity.getScore());
	}
	
	public Integer getDex ()
	{
		return dexterity.getScore();
	}
	
	public Integer getDexMod ()
	{
		return dexterity.getMod();
	}
	
	public void setInt (Integer s)
	{
		intelligence.setScore(s);
	}
	
	public void increaseInt (Integer s)
	{
		intelligence.setScore(s + intelligence.getScore());
	}
	
	public Integer getInt ()
	{
		return intelligence.getScore();
	}
	
	public Integer getIntMod ()
	{
		return intelligence.getMod();
	}
	
	public void setWis (Integer s)
	{
		wisdom.setScore(s);
	}
	
	public void increaseWis (Integer s)
	{
		wisdom.setScore(s + wisdom.getScore());
	}
	
	public Integer getWis ()
	{
		return wisdom.getScore();
	}
	
	public Integer getWisMod ()
	{
		return wisdom.getMod();
	}
	
	public void setCha (Integer s)
	{
		charisma.setScore(s);
	}
	
	public void increaseCha (Integer s)
	{
		charisma.setScore(s + charisma.getScore());
	}
	
	public Integer getCha ()
	{
		return charisma.getScore();
	}
	
	public Integer getChaMod ()
	{
		return charisma.getMod();
	}
	
	public String toString()
	{
		String tmp = new String();
		tmp = strength.toString() + "," + constitution.toString() + "," + dexterity.toString() + "," + intelligence.toString() + "," + wisdom.toString() + "," + charisma.toString();
		return tmp;
	}

}
