/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputType;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author halljj
 *
 */
public class abilityStat extends LinearLayout {
	private stat score;
	private stat base;
	
	private Integer calculateModifier(Integer s)
	{
		return s/2-5;
	}
	
	public Integer getMod ()
	{
		return calculateModifier(score.get() + base.get());
	}
	
	public void setScore (Integer s)
	{
		score.set(s);
	}
	
	public Integer getScore ()
	{
		return score.get();
	}
	
	public void setBase (Integer s)
	{
		base.set(s);
	}
	
	public Integer getBase ()
	{
		return base.get();
	}
	
	public abilityStat (Context c, String n)
	{
		super (c);
		score = new stat (c, 0);
		base  = new stat (c, 0);
		init (c, n);
	}
	
	public abilityStat (Context c, Integer s, String n)
	{
		super (c);
		score = new stat (c, s);
		base  = new stat (c, 0);
		init (c,n);
	}
	
	public abilityStat (Context c, Integer s, String n, Integer b)
	{
		super (c);
		score = new stat (c, s);
		base  = new stat (c, b);
		init (c,n);
	}
	
	private void init (Context c, String n)
	{
		addView(score.textBox);
		TextView label = new TextView(c);
		label.setText(n);
		label.setTextSize (24);
		label.setWidth(100);
		label.setGravity(Gravity.CENTER);
		label.setTypeface(Typeface.MONOSPACE);
		addView(label);
        final TextView mod = new EditText(c);
        mod.setInputType(InputType.TYPE_CLASS_NUMBER);
        mod.setWidth(100);
        score.setOnSaveEditsListener(new stat.OnSaveEditsListener() {
            public void onSaveEdits() {
                mod.setText(getMod().toString());
            }
        });
        base.setOnSaveEditsListener(new stat.OnSaveEditsListener() {
            public void onSaveEdits() {
                mod.setText(getMod().toString());
            }
        });
        addView(mod);
        addView(base.textBox);
        
	}
	
	public String toString()
	{
		return score.toString() + ":" + base.toString();
	}
	
}
