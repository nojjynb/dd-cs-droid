/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputType;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author halljj
 *
 */
public class defenseStat extends vertLayout {
	private labeledStat base;
	private labeledStat abil;
	private labeledStat cls;
	private labeledStat feat;
	private labeledStat enh;
	private labeledStat misc1;
	private labeledStat misc2;
	
	/**
	 * 
	 */
	public defenseStat(Context c, String n) {
		// TODO Auto-generated constructor stub
		super (c);
		base  = new labeledStat (c, 10, "LVL");
		abil  = new labeledStat (c, 0, "ABIL");
		cls   = new labeledStat (c, 0, "CLASS");
		feat  = new labeledStat (c, 0, "FEAT");
		enh   = new labeledStat (c, 0, "ENH");
		misc1 = new labeledStat (c, 0, "MISC1");
		misc2 = new labeledStat (c, 0, "MISC2");
		init (c,n);
	}
	
	public defenseStat(Context c, String n, Integer a, Integer cl, Integer f, Integer e, Integer m1, Integer m2) {
		// TODO Auto-generated constructor stub
		super (c);
		base  = new labeledStat (c, 10, "LVL");
		abil  = new labeledStat (c, a,  "ABIL");
		cls   = new labeledStat (c, cl, "CLASS");
		feat  = new labeledStat (c, f,  "FEAT");
		enh   = new labeledStat (c, e,  "ENH");
		misc1 = new labeledStat (c, m1, "MISC1");
		misc2 = new labeledStat (c, m2, "MISC2");
		init (c,n);
	}
	
	private void init (Context c, String n)
	{
		horLayout boxes1 = new horLayout(c);
		horLayout boxes2 = new horLayout(c);
		final EditText score = new EditText(c);
		score.setInputType(InputType.TYPE_CLASS_NUMBER);
		score.setWidth(100);
		stat.OnSaveEditsListener l = new stat.OnSaveEditsListener() {	
			@Override
			public void onSaveEdits() {
				// TODO Auto-generated method stub
				score.setText(getScore().toString());
				
			}
		};
        abil.setOnSaveEditsListener(l);
        base.setOnSaveEditsListener(l);
        cls.setOnSaveEditsListener(l);
        feat.setOnSaveEditsListener(l);
        enh.setOnSaveEditsListener(l);
        misc1.setOnSaveEditsListener(l);
        misc2.setOnSaveEditsListener(l);
		TextView label = new TextView(c);
		label.setText(n);
		label.setTextSize (24);
		label.setWidth(100);
		label.setGravity(Gravity.CENTER);
		label.setTypeface(Typeface.MONOSPACE);
		
		
		TextView lbl = new TextView(c);
		lbl.setText("CONDITIONAL BONUSES");
		lbl.setTextSize (10);

        boxes1.addView(score);
        boxes1.addView(label);
		boxes1.addView(base.stat);
		boxes1.addView(abil.stat);
		boxes1.addView(cls.stat);
		TextView blank = new TextView(c);
		blank.setWidth(100);
		boxes2.addView(blank);
		boxes2.addView(feat.stat);
		boxes2.addView(enh.stat);
		boxes2.addView(misc1.stat);
		boxes2.addView(misc2.stat);
		addView(boxes1);
		addView(boxes2);
		addView(lbl);
        
        EditText conditional = new EditText(c);
        conditional.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
        addView(conditional);
        score.setText(getScore().toString());
	}
	
	
	
	public Integer getAbil ()
	{
		return abil.get();
	}
	
	public void setAbil (Integer s)
	{
		abil.set(s);
	}
	
	public Integer getCls ()
	{
		return cls.get();
	}
	
	public void setCls (Integer s)
	{
		cls.set(s);
	}
	
	public Integer getFeat ()
	{
		return feat.get();
	}
	
	public void setFeat (Integer s)
	{
		feat.set(s);
	}
	
	public Integer getEnh ()
	{
		return enh.get();
	}
	
	public void setEnh (Integer s)
	{
		enh.set(s);
	}
	
	public Integer getMisc1 ()
	{
		return misc1.get();
	}
	
	public void setMisc1 (Integer s)
	{
		misc1.set(s);
	}
	
	public Integer getMisc2 ()
	{
		return misc2.get();
	}
	
	public void setMisc2 (Integer s)
	{
		misc2.set(s);
	}
	
	public Integer getBase ()
	{
		return base.get();
	}
	
	public void setBase (Integer s)
	{
		base.set(s);
	}
	
	public Integer getScore ()
	{
		return (getBase() + getAbil() + getCls() + getFeat() + getEnh() + getMisc1() + getMisc2());
	}

}
