/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;

/**
 * @author halljj
 *
 */
public class speed extends horLayout {
	public labeledStat base;
	public labeledStat armor;
	public labeledStat item;
	public labeledStat misc;
	
	/**
	 * 
	 */
	public speed(Context c) {
		// TODO Auto-generated constructor stub
		super(c);
		base  = new labeledStat (c, 0, "BASE");
		armor = new labeledStat (c, 0, "ARMOR");
		item  = new labeledStat (c, 0, "ITEM");
		misc  = new labeledStat (c, 0, "MISC");
		init(c);
	}
	
	public speed(Context c, Integer s) {
		// TODO Auto-generated constructor stub
		super(c);
		base  = new labeledStat (c, s, "BASE");
		armor = new labeledStat (c, 0, "ARMOR");
		item  = new labeledStat (c, 0, "ITEM");
		misc  = new labeledStat (c, 0, "MISC");
		init(c);
	}
	
	protected void init(Context c)
	{
		addView(base.stat);
		addView(armor.stat);
		addView(item.stat);
		addView(misc.stat);
	}
	
	public void setBase (Integer s)
	{
		base.set (s);
	}
	
	public Integer getBase ()
	{
		return base.get();
	}
	
	public void setArmor (Integer s)
	{
		armor.set (s);
	}
	
	public Integer getArmor ()
	{
		return armor.get();
	}
	
	public void setItem (Integer s)
	{
		item.set (s);
	}
	
	public Integer getItem ()
	{
		return item.get();
	}
	
	public void setMisc (Integer s)
	{
		misc.set (s);
	}
	
	public Integer getMisc ()
	{
		return misc.get();
	}
	
	public Integer getScore ()
	{
		return base.get() + armor.get() + item.get() + misc.get();
	}

}
