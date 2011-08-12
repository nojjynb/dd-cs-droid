/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

/**
 * @author halljj
 *
 */
public class horLayout extends LinearLayout {

	/**
	 * @param context
	 */
	public horLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setOrientation(LinearLayout.HORIZONTAL);
		setGravity(Gravity.BOTTOM);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public horLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setOrientation(LinearLayout.HORIZONTAL);
		setGravity(Gravity.BOTTOM);
	}

}
