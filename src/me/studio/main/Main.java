package me.studio.main;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import me.studio.kiegeszitok.*;
import me.studio.manager.Manager;
import me.studio.manager.vasarlas;

public class Main {
	
	public static gui gui;
	
	public static double kuki;
	
	public static ArrayList<Manager> manager;
	
	public static void main(String[] args) {
		
		kuki = 0;
		
		gui = new gui();
		gui.setVisible(true);

		manager = new ArrayList<>();
		
		new vasarlas();
		
		moduleloader();   
		
		
		FrameUpdater();
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
		manager.add(new Neni());
				
				
				
				
				
		//Véglegesités
		manager.add(new FrameUpdater());
				
	}
	
	public static void FrameUpdater(){
		
		System.out.println("Kukik: " + Main.kuki);
		
		gui gui = Main.gui;
		gui.label.setText(new String("Sütik: " + Main.kuki).replace(".0", ""));
		gui.neniField.setText(vasarlas.arak.Nagyi.darab() + "");
		
		
	}
	
}
