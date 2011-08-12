package com.nojco.ddchardroid;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class main extends Activity {
	
	private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private LinearLayout pages;
    private character character;
    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;
    private ScrollView sc;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        pages = (LinearLayout) findViewById(R.id.info);
        sc = new ScrollView(this);
        character = new character (this);
        
        // Gesture detection
        gestureDetector = new GestureDetector(new MyGestureDetector());
        gestureListener = new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (gestureDetector.onTouchEvent(event)) {
                    return true;
                }
                return false;
            }
        };
        
        pages.setOnTouchListener(gestureListener);
        sc.addView(character.pages);
        pages.addView(sc);

        setContentView(pages);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.donate:
            return true;
        case R.id.save:
            try {
				saveCharacter (character);
			} catch (EOFException ex) { //This exception will be caught when EOF is reached
	            System.out.println("End of file reached.");
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return true;
        case R.id.load:
        	try {
				character = loadCharacter();
			} catch (EOFException ex) { //This exception will be caught when EOF is reached
	            System.out.println("End of file reached.");
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return true;
        case R.id.settings:
        	return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }

    public boolean saveCharacter (character c) throws Exception
    {
    	FileOutputStream fos = openFileOutput("character", Context.MODE_PRIVATE);
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(c);

    	oos.close();
    	fos.close();
    	return true;
    }

    public character loadCharacter () throws Exception
    {
    	character c;
    	FileInputStream fis = openFileInput("character");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	c = (com.nojco.ddchardroid.character) ois.readObject();

    	ois.close();
    	fis.close();
    	pages.removeAllViews();
        sc.addView(character.pages);
        pages.addView(sc);
    	setContentView (pages);
    	return c;
    }
    
    class MyGestureDetector extends SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
                    return false;
                // right to left swipe
                if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                	Toast.makeText(main.this, "Left Swipe", Toast.LENGTH_SHORT).show();

                }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                	Toast.makeText(main.this, "Right Swipe", Toast.LENGTH_SHORT).show();

                }
            } catch (Exception e) {
                // nothing
            }
            return false;
        }
    }

}