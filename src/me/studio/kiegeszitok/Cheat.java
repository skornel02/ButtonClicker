package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;

public class Cheat extends Manager {


	
	@Override
	public void Click() {
		
	}


	@Override
	public void TickMS() {
		if(Main.cheat)
			Main.click();
	}

	@Override
	public void TickS() {
		// TODO Auto-generated method stub
		
	}
	
	

}
