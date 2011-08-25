/**
 * 
 */
package com.nojco.ddchardroid;

import java.io.Serializable;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * @author halljj
 *
 */
public class character implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7784853863603466995L;
	public String playerName;
	public String characterName; 
	public Integer level;
	public classesEnum characterClass;
	public paragonEnum paragonPath;
	public epicEnum epicDestiny;
	public Integer totalXP;
	public racesEnum race;
	public String size;
	public Integer age;
	public String gender;
	public Integer height;
	public Integer weight;
	public alignEnum alignment;
	public deityEnum deity;
	public String group;
	
	public Integer initiative;
	public abilities abilities;
	public defenses defenses;
	public speed speed;
	public String specialMovement;
	public senses senses;
	public health health;
	public Integer actionPoints;
	public skills skills;
	public raceFeaturesEnum[] raceFeatures;
	public classPathDestEnum[] classPathDestinyFeatures;
	public featEnum[] feats;
	public languagesEnum[] languagesKnown;
	public String[] atWillPowers;
	public String[] encounterPowers;
	public String[] dailyPowers;
	public String[] magicItems;
	
	public String personalityTraits;
	public String mannerismsAppearance;
	public String background;
	public String companionsAllies;
	public String notes;
	
	public String[] equipment;
	public String[] rituals;
	public String[] coinsWealth;
	

    private char currentPage;
	
    private TextView abilityPage;
    private TextView defensesPage;
    private TextView healthPage;
    private TextView skillsPage;
    private TextView speedPage;
    private TextView sensesPage;
    
    public vertLayout pages;
    
	/**
	 * 
	 */
	public character(Context c) {
		// TODO Auto-generated constructor stub
//		playerName
//		characterName
//		level
//		characterClass
//		paragonPath
//		epicDestiny
//		totalXP
//		race
//		size
//		age
//		gender
//		height
//		weight
//		alignment
//		deity
//		group
//		
//		initiative
//		abilities
//		defenses
//		speed
//		specialMovement
//		passiveInsight
//		passivePerception
//		health
//		actionPoints
//		skills
//		raceFeatures
//		classPathDestinyFeatures
//		feats
//		languagesKnown
//		atWillPowers
//		encounterPowers
//		dailyPowers
//		magicItems
//		
//		personalityTraits
//		mannerismsAppearance
//		background
//		companionsAllies
//		notes
//		
//		equipment
//		rituals
//		coinsWealth
		pages = new vertLayout(c);
		
		abilities 	= new abilities(c);
		defenses 	= new defenses(c);
		health 		= new health(c);
		skills 		= new skills(c);
        speed 		= new speed(c);
        senses      = new senses(c);
        
        abilityPage  = newTV("ABILITY SCORES", 'a', c);
        defensesPage = newTV("DEFENSE SCORES", 'd', c);
        healthPage   = newTV("HEALTH INFO",    'h', c);
        skillsPage   = newTV("SKILLS",         's', c);
        speedPage    = newTV("MOVEMENT",       'w', c);
        sensesPage   = newTV("SENSES",         'p', c);
        pages.addView(abilityPage);
        pages.addView(defensesPage);
        pages.addView(healthPage);
        pages.addView(skillsPage);
        pages.addView(speedPage);
        pages.addView(sensesPage);
	}
	
	private TextView newTV(String label, final char page, Context c)
    {
    	TextView tmp = new TextView(c);
        LinearLayout.LayoutParams fillWrap = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        tmp.setLayoutParams(fillWrap);
        tmp.setText(label);
        tmp.setBackgroundColor(android.graphics.Color.DKGRAY);
        tmp.setOnClickListener(new OnClickListener (){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				setPage(page);
			}
        });
        
        return tmp;
    }
	
	private void setPage(char p)
    {
    	switch (p)
    	{
        	case 'a': 
        		if (currentPage == 'a')
    			{
        			pages.removeView(abilities); 
        			
        			currentPage='m';
    			}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(abilities); 
        			pages.addView(defensesPage);
        			pages.addView(healthPage); 
        			pages.addView(skillsPage);
        			pages.addView(speedPage);
        	        pages.addView(sensesPage);
        			
        			currentPage=p; 
    			}
        		break;
        	case 'd':  
        		if (currentPage == 'd')
    			{
        			pages.removeView(defenses); 
        			
        			currentPage='m';
    			}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(defensesPage);
        			pages.addView(defenses); 
        			pages.addView(healthPage); 
        			pages.addView(skillsPage);
        	        pages.addView(speedPage);
        	        pages.addView(sensesPage);
        			
        			currentPage=p; 
    			}
        		break;
        	case 'h':
        		if (currentPage == 'h')
        		{
        			pages.removeView(health); 
        			
        			currentPage='m';
        		}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(defensesPage);
        			pages.addView(healthPage); 
        			pages.addView(health); 
        			pages.addView(skillsPage);
        			pages.addView(speedPage);
        	        pages.addView(sensesPage);
        			
        			currentPage=p; 
        		}
        		break;
        	case 's':
        		if (currentPage == 's')
        		{
        			pages.removeView(skills); 
        			
        			currentPage='m';
        		}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(defensesPage);
        			pages.addView(healthPage); 
        			pages.addView(skillsPage);
        			pages.addView(skills); 
        			pages.addView(speedPage);
        	        pages.addView(sensesPage);
        			
        			currentPage=p; 
        		}
        		break;
        	case 'w':
        		if (currentPage == 'w')
        		{
        			pages.removeView(speed); 
        			
        			currentPage='m';
        		}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(defensesPage);
        			pages.addView(healthPage); 
        	        pages.addView(skillsPage);
        	        pages.addView(speedPage);
        	        pages.addView(speed); 
        	        pages.addView(sensesPage);
        			currentPage=p; 
        		}
        		break;
        	case 'p':
        		if (currentPage == 'p')
        		{
        			pages.removeView(speed); 
        			
        			currentPage='m';
        		}
        		else
        		{
        			pages.removeAllViews(); 
        			pages.addView(abilityPage);
        			pages.addView(defensesPage);
        			pages.addView(healthPage); 
        	        pages.addView(skillsPage);
        	        pages.addView(speedPage);
        	        pages.addView(sensesPage);
        	        pages.addView(senses); 
        			currentPage=p; 
        		}
        		break;
    	}
		
    }

}
