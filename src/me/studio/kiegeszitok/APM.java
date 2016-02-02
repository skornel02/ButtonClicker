package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.manager.Manager;

public class APM extends Manager {


	
	@Override
	public void Click() {
		Main.apm = Main.apm - 1;
		
		
		
	}


	@Override
	public void TickMS() {
		if(Main.apm == 0 || Main.apm < 0){
			Main.kaphat = false;
		}else{
			Main.kaphat = true;
		}
		Main.apm = Main.apm + 1;
	}

	@Override
	public void TickS() {
		System.out.println(Main.apm);
		Main.apm = 1;
		
	}
	
	

}
