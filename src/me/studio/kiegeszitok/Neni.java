package me.studio.kiegeszitok;

import me.studio.adatok.Hozamok;
import me.studio.main.Main;
import me.studio.manager.Manager;

public class Neni extends Manager {


	
	@Override
	public void Click() {
		
		Main.kuki = Main.kuki + (Hozamok.nenidarab * Hozamok.nenihozam);
		
	}
	
	

}
