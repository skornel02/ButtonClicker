package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;
import me.studio.manager.vasarlas;

public class Neni extends Manager {


	
	@Override
	public void Click() {
		
		
		Main.kuki = Main.kuki + (vasarlas.arak.Nagyi.darab() * vasarlas.arak.Nagyi.hozam);
		
	}
	
	

}
