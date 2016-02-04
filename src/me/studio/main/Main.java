package me.studio.main;

import java.util.ArrayList;

import me.studio.kiegeszitok.*;
import me.studio.manager.*;

public class Main {
	
	public static gui gui;
	
	public static double kuki;
	public static int apm;
	public static double apmend;
	
	public static boolean cheat = false;
	
	public static ArrayList<Manager> clickevent;
	public static ArrayList<Manager> tickevent;
	
	public static boolean kaphat;
	
	public static void main(String[] args) {
		
		Ticker.running = true;
		
		kaphat = true;
		
		apm = 0;
		apmend = 0;
		kuki = 0;
		
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
		
		//V�glegesit�s
		tickevent.add(new FrameUpdater());
		clickevent.add(new FrameUpdater());
		
		tickevent.add(new Cheat());
		
		//MIBEAE import
		tickevent.add(new MIBEAE());
		clickevent.add(new MIBEAE());
		
	}
	
	public static void FrameUpdater(){
		
		
		gui gui = Main.gui;
		gui.label.setText(new String("Gombok: " + Main.kuki).replace(".0", ""));
		
		gui.katapultF.setText(vasarlas.arak.Nagyi.darab() + "");
		gui.katapult.setToolTipText("�ra: " + vasarlas.arak.Nagyi.ar()  + ", Bev�tel: 1k/c");
		
		gui.Csig�k.setToolTipText("�ra: " + vasarlas.arak.Csig�k.ar()  + ", Bev�tel: 5k/c");
		gui.Csig�kF.setText(vasarlas.arak.Csig�k.darab() + "");
		
		gui.Hidraulika.setToolTipText("�ra: " + vasarlas.arak.Hidraulika.ar()  + ", Bev�tel: 50k/c");
		gui.HidraulikaF.setText(vasarlas.arak.Hidraulika.darab() + "");
		
		gui.APM.setText("CPS: " + new Integer((int) apmend));
		
	}
	
}
