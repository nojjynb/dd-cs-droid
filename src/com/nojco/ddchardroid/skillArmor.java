/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.view.Gravity;

/**
 * @author halljj
 *
 */
public class skillArmor extends skill {
	public labeledStat armor;
	/**
	 * 
	 */
	
	public skillArmor(Context c) {
		// TODO Auto-generated constructor stub
		super(c);
	}
	
	public skillArmor(Context c, String n, abilitiesEnum a) {
		// TODO Auto-generated constructor stub
		super(c,n,a);
	}
	
	@Override
	protected void init(Context c)
	{

		horLayout row1 = new horLayout(c);
		horLayout row2 = new horLayout(c);
		row1.addView(bonus.stat);
		name.setWidth(250);
		name.setTextSize(24);
		name.setGravity(Gravity.LEFT);
		row1.addView(name);
		label typeL = new label(c, type.toString().toUpperCase().substring(0, 3));
		typeL.setWidth(200);
		typeL.setTextSize(24);
		typeL.setGravity(Gravity.LEFT);
		row1.addView(typeL);
		row2.addView(new label(c, ""));
		row2.addView(abil.stat);
		row2.addView(trained.stat);
		row2.addView(misc.stat);
		armor = new labeledStat(c, 0, "ARMOR");
		row2.addView(armor.stat);
		addView(row1);
		addView(row2);
	}
	public Integer getArmor ()
	{
		return armor.get();
	}
	
	public void setArmor (Integer s)
	{
		armor.set(s);
	}
	
	@Override
	public Integer get ()
	{
		return abil.get() + trained.get() + armor.get() + misc.get();
	}

}
