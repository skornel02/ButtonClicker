package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;
import me.studio.manager.vasarlas;

public class Vasaroltak extends Manager {


	
	@Override
	public void Click() {
		
		
		Main.kuki = Main.kuki + (vasarlas.arak.Nagyi.darab() * vasarlas.arak.Nagyi.hozam);
		Main.kuki = Main.kuki + (vasarlas.arak.Csig�k.darab() * vasarlas.arak.Csig�k.hozam);
		
	}

	@Override
	public void Tick() {
		// TODO Auto-generated method stub
		
	}
	
	

}
