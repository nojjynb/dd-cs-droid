/**
 * 
 */
package com.nojco.ddchardroid;

import android.content.Context;
import android.text.InputType;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


/**
 * @author halljj
 *
 */

public class stat {
	public EditText textBox;
	
	//private String name;
	private Integer value;
	
	public Integer get ()
	{
		return value;
	}
	
	public void set (Integer v)
	{
		value = v;
		if (saveEditsListener != null)
			saveEditsListener.onSaveEdits();
		if (textBox.getText().toString() != value.toString())
			textBox.setText(value.toString());
	}
	
	private void set (String s)
	{
		value = Integer.parseInt(s);
		if (saveEditsListener != null)
			saveEditsListener.onSaveEdits();
	}
	
	public stat (Context c)
	{
		initEditText (c);
		set(0);
	}
	
	private void initEditText (final Context c)
	{
		textBox = new EditText(c);
		textBox.setGravity(Gravity.CENTER);
		textBox.setInputType(InputType.TYPE_CLASS_NUMBER);
		textBox.setImeActionLabel("Done", EditorInfo.IME_ACTION_DONE);
		textBox.setWidth(100);
		textBox.setSelectAllOnFocus(true);
		textBox.setOnEditorActionListener(new EditText.OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		        if (actionId == EditorInfo.IME_ACTION_SEND ||
		                actionId == EditorInfo.IME_ACTION_DONE ||
		        		actionId == EditorInfo.IME_ACTION_NEXT) {
		            set(v.getText().toString());
		            InputMethodManager mgr = (InputMethodManager)c.getSystemService(Context.INPUT_METHOD_SERVICE);
		            mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);
		        }
		        return true;
		    }
		});
		textBox.setOnFocusChangeListener(new OnFocusChangeListener() {          

	        public void onFocusChange(View v, boolean hasFocus) {
	            if(!hasFocus)
	            	set(textBox.getText().toString());
	        }
	    });

	}
	
	public stat (Context c, Integer s)
	{
		initEditText (c);
		set(s);
	}
	
	public interface OnSaveEditsListener
	{
	    public abstract void onSaveEdits();
	}
	private OnSaveEditsListener saveEditsListener = null;
	public void setOnSaveEditsListener(OnSaveEditsListener l)
	{
	    saveEditsListener = l;
	}
	
	public String toString()
	{
		return value.toString();
	}
}
