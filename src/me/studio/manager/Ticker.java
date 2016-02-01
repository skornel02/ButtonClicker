package me.studio.manager;

public class Ticker {
	
	public static boolean running = false;
	
	public Ticker() {
		
		int s1 = 0;
		int s2 = 0;
		
		while(running){
			if(s1 == 10){
				s1 = 0;
				if(s2 == 10){
					s2 = 0;
					stick();
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
	
	public static void stick(){
		System.out.println("1s tick");
	}

}
