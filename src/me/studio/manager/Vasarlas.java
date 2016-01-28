package me.studio.manager;

import java.util.HashMap;

import me.studio.main.Main;

public class vasarlas {

	public static int szazalekos = 10;
	
	public static HashMap<String, Integer> map;
	
	public vasarlas() {
		
		map = new HashMap<>();
		
		map.put("neniar", 10);
		map.put("nenidarab", 0);
		map.put("nenihozam", 1);
		
	}
	
	public static boolean vasarlas(arak fajta){
		
		if(fajta.ar() == Main.kuki  || fajta.ar() < Main.kuki){
			
			System.out.println("Vasárlás");
			
			Main.kuki = Main.kuki - fajta.ar();
			
			float a = 10;
			float b = 100;
			float c = fajta.ar();
			
			map.put(fajta.neve + "ar", (int) (fajta.ar() + (a / b * c)));

			
			map.put(fajta.neve + "darab", fajta.darab() + 1);
			Main.FrameUpdater();
			
			return true;
			
		}
		
		
		return false;
	}
	
	public static enum arak{
		
		Nagyi("neni", vasarlas.map.get("neniar") , vasarlas.map.get("nenidarab"), vasarlas.map.get("nenihozam"));
		
		private int ar;
		private int darab;
		public int hozam;
		public String neve;
		 
		arak(String neve, int ar, int darab, int hozam) {
			this.neve = neve;
			this.ar = ar;
			this.darab = darab;
			this.hozam = hozam;
		}
		
		public int ar(){
			return vasarlas.map.get(neve + "ar");
		}
		
		public int darab(){
			return vasarlas.map.get(neve + "darab");
		}
		
			
	}
		

	
	
	
	
}
