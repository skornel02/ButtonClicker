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
		
		map.put("csigakar", 200);
		map.put("csigakdarab", 0);
		map.put("csigakhozam", 5);
		
		map.put("hidraulikaar", 10000);
		map.put("hidraulikadarab", 0);
		map.put("hidraulikahozam", 50);
		
	}
	
	public static boolean vasarlas(arak fajta){
		
		if(fajta.ar() == Main.kuki  || fajta.ar() < Main.kuki){
			
			System.out.println("Vasárlás");
			
			Main.kuki = Main.kuki - fajta.ar();
			
			float a = 20;
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
		
		Nagyi("neni" ),
		Csigák("csigak" ),
		Hidraulika("hidraulika");
		
		public String neve;
		 
		arak(String neve) {
			this.neve = neve;
		}
		
		public int ar(){
			return vasarlas.map.get(neve + "ar");
		}
		
		public int darab(){
			return vasarlas.map.get(neve + "darab");
		}
		public int bevetel(){
			return vasarlas.map.get(neve + "hozam");
		}
		public void setdarab(int x ){
			vasarlas.map.put(neve + "darab", x);
		}
			
	}
		

	
	
	
	
}
