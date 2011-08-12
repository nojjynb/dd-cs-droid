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
public class defenses extends ScrollView {
	public defenseStat ac;
	public defenseStat fort;
	public defenseStat ref;
	public defenseStat will;
	
	/**
	 * 
	 */
	public defenses(Context c) {
		// TODO Auto-generated constructor stub
		super (c);
		ac   = new defenseStat(c, "AC");
		fort = new defenseStat(c, "FORT");
		ref  = new defenseStat(c, "REF");
		will = new defenseStat(c, "WILL");
		vertLayout layout = new vertLayout(c);
		layout.addView(ac);
		layout.addView(fort);
		layout.addView(ref);
		layout.addView(will);
		addView(layout);
	}
	
	public Integer getAC ()
	{
		return ac.getScore();
	}
	
	public Integer getFORT ()
	{
		return fort.getScore();
	}
	
	public Integer getREF ()
	{
		return ref.getScore();
	}
	
	public Integer getWILL ()
	{
		return will.getScore();
	}

}
