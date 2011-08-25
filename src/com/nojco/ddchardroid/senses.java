/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.util.AttributeSet;

/**
 * @author halljj
 *
 */
public class senses extends vertLayout {
	
	public senseStat perception;
	public senseStat insight;
	private horLayout labels;
	private label score;
	private label sense;
	private label base;
	private label bonus;
	/**
	 * @param context
	 */
	public senses(Context context) {
		super(context);
		init(context, 0);
	}
	
	private void init (Context c, Integer b)
	{
		perception = new senseStat (c, b, "PASSIVE PERCEPTION");
		insight    = new senseStat (c, b, "PASSIVE INSIGHT");
		score	   = new label (c, "SCORE"); 
		sense	   = new label (c, "SENSE"); 
		base 	   = new label (c, "BASE"); 
		bonus	   = new label (c, "BONUS"); 
		labels     = new horLayout(c);
		sense.setWidth(175);
		labels.addView(score);
		labels.addView(sense);
		labels.addView(base);
		labels.addView(bonus);
		addView (labels);
		addView (insight);
		addView (perception);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public senses(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

}
