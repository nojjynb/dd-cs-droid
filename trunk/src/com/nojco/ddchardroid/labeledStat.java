/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

/**
 * @author halljj
 *
 */
public class labeledStat extends stat {

	public TextView label;
	public vertLayout stat;
	
	/**
	 * @param c
	 */
	public labeledStat(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
		stat = new vertLayout (c);
		label = new TextView (c);
		label.setText("");
		label.setGravity(Gravity.CENTER);
		label.setTextSize (10);
		label.setWidth(100);
		stat.addView(label);
		stat.addView(textBox);
	}

	/**
	 * @param c
	 * @param s
	 */
	public labeledStat(Context c, Integer s, String n) {
		super(c, s);
		// TODO Auto-generated constructor stub
		stat = new vertLayout (c);
		label = new TextView (c);
		label.setText(n);
		label.setGravity(Gravity.CENTER);
		label.setTextSize (10);
		label.setWidth(100);
		stat.addView(label);
		stat.addView(textBox);
	}

}
