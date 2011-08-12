/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @author halljj
 *
 */
public class vertLayout extends LinearLayout {

	/**
	 * @param context
	 */
	public vertLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setOrientation(LinearLayout.VERTICAL);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public vertLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setOrientation(LinearLayout.VERTICAL);
	}

}
