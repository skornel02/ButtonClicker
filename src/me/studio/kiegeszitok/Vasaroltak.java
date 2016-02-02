package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;
import me.studio.manager.vasarlas;

public class Vasaroltak extends Manager {


	
	@Override
	public void Click() {
		
		
		if(Main.kaphat){
			for(vasarlas.arak a : vasarlas.arak.values()){
				Main.kuki = Main.kuki + (a.darab() * a.hozam);
			}
		}
	}
	
	@Override
	public void TickMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TickS() {
		// TODO Auto-generated method stub
		
	}
	
	

}
