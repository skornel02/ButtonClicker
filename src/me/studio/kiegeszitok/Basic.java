package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;

public class Basic extends Manager {

	public final int alapkuki = 1;
	
	@Override
	public void Click() {
		
		if(Main.kaphat){
		Main.kuki = Main.kuki + alapkuki;
		}
		
	}

	@Override
	public void TickMS() {
	}

	@Override
	public void TickS() {
		
	}
	
	
	
	
}
