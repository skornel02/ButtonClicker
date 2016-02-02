package me.studio.main;

import java.util.ArrayList;

import me.studio.kiegeszitok.*;
import me.studio.manager.*;

public class Main {
	
	public static gui gui;
	
	public static double kuki;
	public static int apm;
	
	public static ArrayList<Manager> clickevent;
	public static ArrayList<Manager> tickevent;
	
	public static boolean kaphat;
	
	public static void main(String[] args) {
		
		Ticker.running = true;
		
		kaphat = true;
		
		apm = 0;
		kuki = 1000 * 1000;
		
		gui = new gui();
		gui.setVisible(true);

		clickevent = new ArrayList<>();
		tickevent = new ArrayList<>();
		
		
		
		new vasarlas();
		
		moduleloader();   
		
		
		FrameUpdater();
		
		new Ticker();
		
	}
	
	public static void click(){
		
		for(Manager a : clickevent){
			a.Click();
		}
		
	}
	
	private static void moduleloader(){
	
		//Anti cheat
		clickevent.add(new APM());
		tickevent.add(new APM());
		
		//Alapmanager
		clickevent.add(new Basic());
		
		tickevent.add(new Basic());
				
		//Vasaroltak
		clickevent.add(new Vasaroltak());
		tickevent.add(new Gyar());		
		
		//Véglegesités
		tickevent.add(new FrameUpdater());
				
	}
	
	public static void FrameUpdater(){
		
		
		gui gui = Main.gui;
		gui.label.setText(new String("Gombok: " + Main.kuki).replace(".0", ""));
		
		gui.katapultF.setText(vasarlas.arak.Nagyi.darab() + "");
		gui.katapult.setToolTipText("Ára: " + vasarlas.arak.Nagyi.ar()  + ", Bevétel: 1k/c");
		
		gui.Csigák.setToolTipText("Ára: " + vasarlas.arak.Csigák.ar()  + ", Bevétel: 5k/c");
		gui.CsigákF.setText(vasarlas.arak.Csigák.darab() + "");
		
		
	}
	
}
