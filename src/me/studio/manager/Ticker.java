package me.studio.manager;

import me.studio.main.Main;

public class Ticker {
	
	public static boolean running = false;
	
	public Ticker() {
		
		int s1 = 0;
		int s2 = 0;
		
		while(running){
			if(s1 == 9){
				s1 = 0;
				stickms();
				if(s2 == 9){
					s2 = 0;
					sticks();
				}else{
					s2++;
				}
				
			}else{
			s1++;
			}
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				running = false;
				System.exit(0);
			}
		}
	}
	
	public static void sticks(){
		for(Manager a :Main.tickevent){
			a.TickS();
		}
	}
	
	public static void stickms(){
		for(Manager a :Main.tickevent){
			a.TickMS();
		}
	}
}
