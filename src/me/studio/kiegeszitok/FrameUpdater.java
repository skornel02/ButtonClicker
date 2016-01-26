package me.studio.kiegeszitok;

import me.studio.adatok.Hozamok;
import me.studio.main.Main;
import me.studio.main.gui;
import me.studio.manager.Manager;

public class FrameUpdater extends Manager {


	
	@Override
	public void Click() {
		
		System.out.println("Kukik: " + Main.kuki);
		
		gui gui = Main.gui;
		gui.label.setText(new String("Sütik: " + Main.kuki).replace(".0", ""));
		gui.neniField.setText(Hozamok.nenidarab + "");
		
		
	}
	
	

}
