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
public class skill extends vertLayout {
	public labeledStat abil;
	public labeledStat trained;
	public labeledStat misc;
	public labeledStat bonus;
	protected label name;
	protected abilitiesEnum type;
	/**
	 * 
	 */
	public skill(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
		bonus = new labeledStat(c);
		abil = new labeledStat(c);
		trained = new labeledStat(c);
		misc = new labeledStat(c);
		init(c);
		
	}
	public skill(Context c, String n, abilitiesEnum a) {
		// TODO Auto-generated constructor stub
		super(c);
		bonus   = new labeledStat(c, 0, "BONUS");
		abil    = new labeledStat(c, 0, "ABIL");
		trained = new labeledStat(c, 0, "TRND");
		misc    = new labeledStat(c, 0, "MISC");
		name    = new label(c, n);
		type    = a;	
		init(c);
	}
	
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
		typeL.setTextSize(24);
		typeL.setGravity(Gravity.LEFT);
		row1.addView(typeL);
		row2.addView(new label(c, ""));
		row2.addView(abil.stat);
		row2.addView(trained.stat);
		row2.addView(misc.stat);
		addView(row1);
		addView(row2);
	}
	
	public void setAbil(Integer s)
	{
		abil.set(s);
	}
	
	public void setTrained()
	{
		trained.set (5);
	}
	
	public void setMisc(Integer s)
	{
		misc.set(s);
	}
	
	public Integer getAbil()
	{
		return abil.get();
	}
	
	public Integer getTrained()
	{
		return trained.get();
	}
	
	public Integer getMisc()
	{
		return misc.get();
	}
	
	public Integer get()
	{
		return abil.get() + misc.get() + trained.get();
	}
	
	public String getName()
	{
		return name.getText().toString();
	}
	
	public void setName (String s)
	{
		name.setText(s);
	}
	
	public void setType (abilitiesEnum t)
	{
		type = t;
	}
	
	public abilitiesEnum getType()
	{
		return type;
	}

}

