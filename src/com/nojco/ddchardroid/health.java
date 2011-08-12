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
public class health extends LinearLayout {

	private labeledStat hp;
	private labeledStat surgeVal;
	private labeledStat surgeMod;
	private labeledStat surgesPerDay;
	private labeledStat surgesUsed;
	private labeledStat maxHP;
	private labeledStat bloodied;
	/**
	 * 
	 */
	public health(Context c) {
		// TODO Auto-generated constructor stub
		super(c);
		hp = new labeledStat(c, 0, "CURRENT HP");
		surgeMod = new labeledStat(c, 0, "SURGE MOD");
		surgeVal = new labeledStat(c, 0, "SURGE VAL");
		surgesPerDay = new labeledStat(c, 0, "SURGES/DAY");
		surgesUsed = new labeledStat(c, 0, "SUREGES USED");
		maxHP = new labeledStat(c, 0, "MAX HP");
		bloodied = new labeledStat(c, 0, "BLOODIED");
		horLayout hor1 = new horLayout(c);
		horLayout hor2 = new horLayout(c);
		vertLayout vert = new vertLayout(c);
		hor1.addView(maxHP.stat);
		hor1.addView(bloodied.stat);
		hor1.addView(hp.stat);
		hor2.addView(surgeVal.stat);
		hor2.addView(surgesPerDay.stat);
		hor2.addView(surgeMod.stat);
		hor2.addView(surgesUsed.stat);
		
		vert.addView(hor1);
		vert.addView(hor2);
		addView(vert);
	}
	
	public void setMaxHP (Integer s)
	{
		maxHP.set(s);
		surgeVal.set (maxHP.get()/4 + surgeMod.get());
	}
	
	public void setSurgeCountModifier (Integer s)
	{
		surgeVal.set (surgeVal.get() - surgeMod.get() + s);
		surgeMod.set (s);
	}
	
	public void setSurgesPerDay (Integer s)
	{
		surgesPerDay.set(s);
	}
	
	public void setHP (Integer s)
	{
		hp.set(s);
	}
	
	public void takeDamage (Integer s)
	{
		hp.set (hp.get()-s);
	}
	
	public void heal ()
	{
		hp.set (hp.get() + surgeVal.get());
		surgesUsed.set (surgesUsed.get() - 1);
	}
	
	public void useSurges (Integer count)
	{
		for (int i = 0; i < count; i++)
		{
			heal();
		}
	}
	
	public Integer getMaxHP ()
	{
		return maxHP.get();
	}
	
	public Integer getCurrentHP()
	{
		return hp.get();
	}
	
	public Integer getBloodiedValue ()
	{
		return maxHP.get()/2;
	}
	
	public Integer getSurgeValue ()
	{
		return surgeVal.get();
	}
	
	public Integer getSurgersPerDay ()
	{
		return surgesPerDay.get();
	}
	
	public Integer getSuregesUsed ()
	{
		return surgesUsed.get();
	}
	
	public void resetSurgesUesd ()
	{
		surgesUsed.set(0);
	}

}
