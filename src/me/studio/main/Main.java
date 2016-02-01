package me.studio.main;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import me.studio.kiegeszitok.*;
import me.studio.manager.Manager;
import me.studio.manager.Ticker;
import me.studio.manager.vasarlas;

public class Main {
	
	public static gui gui;
	
	public static double kuki;
	
	public static ArrayList<Manager> manager;
	
	public static void main(String[] args) {
		
		Ticker.running = true;
		
		kuki = 0;
		
		gui = new gui();
		gui.setVisible(true);

		manager = new ArrayList<>();
		
		new vasarlas();
		
		moduleloader();   
		
		
		FrameUpdater();
		
		new Ticker();
		
	}
	
	public static void click(){
		
		for(Manager a : manager){
			a.Click();
		}
		
	}
	
	private static void moduleloader(){
		
		//Alapmanager
		manager.add(new Basic());
				
		//Neni
		manager.add(new Vasaroltak());
				
				
				
				
				
		//Véglegesités
		manager.add(new FrameUpdater());
				
	}
	
	public static void FrameUpdater(){
		
		System.out.println("Gombok: " + Main.kuki);
		
		gui gui = Main.gui;
		gui.label.setText(new String("Gombok: " + Main.kuki).replace(".0", ""));
		
		gui.katapultF.setText(vasarlas.arak.Nagyi.darab() + "");
		gui.katapult.setToolTipText("Ára: " + vasarlas.arak.Nagyi.ar()  + ", Bevétel: 1k/c");
		
		gui.Csigák.setToolTipText("Ára: " + vasarlas.arak.Csigák.ar()  + ", Bevétel: 5k/c");
		gui.CsigákF.setText(vasarlas.arak.Csigák.darab() + "");
		
		
	}
	
}
