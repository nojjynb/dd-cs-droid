/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/**
 * @author halljj
 *
 */
public class label extends TextView {

	/**
	 * @param context
	 */
	public label(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setText("");
		setGravity(Gravity.CENTER);
		setTextSize (10);
		setWidth(100);
	}
	
	/**
	 * @param context
	 * @param text
	 */
	public label(Context context, String text) {
		super(context);
		// TODO Auto-generated constructor stub
		setText(text);
		setGravity(Gravity.CENTER);
		setTextSize (10);
		setWidth(100);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public label(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setText("");
		setGravity(Gravity.CENTER);
		setTextSize (10);
		setWidth(100);
	}

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public label(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		setText("");
		setGravity(Gravity.CENTER);
		setTextSize (10);
		setWidth(100);
	}

}
