package me.studio.kiegeszitok;

import java.util.ArrayList;
import java.util.HashMap;

import me.studio.main.Main;
import me.studio.manager.Manager;

public class APM extends Manager {


	
	@Override
	public void Click() {
		Main.apm = Main.apm + 1;
	}
	
	private static int aktiv = 0;


	@Override
	public void TickMS() {
		if( Main.apm > 10){
			Main.kaphat = false;
		}else{
			Main.kaphat = true;
		}
	}

	@Override
	public void TickS() {
		
		if(aktiv == 2){
			aktiv = 0;
		}else{
			aktiv = aktiv + 1;
		}
		
		apmend(Main.apm);
		
		Main.apm = 0;

		
	}
	
	private static HashMap<Integer , Double> map = new HashMap<>();
	
	public void apmend(double x){
		
		map.put(aktiv, x);
		
		double u = 0;
		
		for(double z : map.values()){
			u = u + z;
		}
		Main.apmend = u / 3;
		
	}
	
	

}
