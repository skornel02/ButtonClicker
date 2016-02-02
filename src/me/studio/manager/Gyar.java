package me.studio.manager;

import me.studio.main.Main;

public class Gyar extends Manager {

	/*
	 *	1. Szint: ár: 1M: bevétel 1000
	 *	-Háttérbe futás
	 *	-
	 * 
	 * 
	 *
	 */
	
	private static int szint;
	private static int ear = 1000 * 1000;
	
	@Override
	public void Click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TickMS() {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean fejlesztes(){
		
		if(szint == 0){
			if(Main.kuki == ear || Main.kuki > ear){
				Main.kuki = Main.kuki - ear;
				szint = 1;
				return true;
			}
		}
		return false;
	}

	@Override
	public void TickS() {
		
		
		if(szint == 1)
			Main.kuki = Main.kuki + 1000;
		
		
	}

	
	
	
}
