/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;

/**
 * @author halljj
 *
 */
public class senseStat extends horLayout {

	public stat base;
	public stat bonus;
	public stat score;
	private label label;
	
	/**
	 * @param c
	 */
	public senseStat(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
		init(c, 0, "PASSIVE");
	}

	/**
	 * @param c
	 * @param s
	 */
	public senseStat(Context c, Integer s) {
		super(c);
		init(c, s, "PASSIVE");
	}

	/**
	 * @param c
	 * @param s
	 * @param l
	 */
	public senseStat(Context c, Integer s, String l) {
		super(c);
		init(c, s, l);
	}
	
	private void init (Context c, Integer b, String l)
	{
		base  = new stat (c, 10);
		bonus = new stat (c, b);
		score = new stat (c, 10+b);
		label = new label (c, l);
		label.setTextSize(20);
		label.setWidth(175);
		addView (score.textBox);
		addView (label);
		addView (base.textBox);
		addView (bonus.textBox);
	}

}
