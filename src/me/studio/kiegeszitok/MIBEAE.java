package me.studio.kiegeszitok;

import me.studio.manager.Manager;

public class MIBEAE extends Manager {


	/*
	 * 
	 * M ennyi
	 * I dõt
	 * B *sztál
  	 * E l
	 * A az
	 * E 'letedbõl
	 * 
	 * 
	 */
	
	public static int aoclick = 0;
	public static int aoeido = 0;
	
	@Override
	public void Click() {
		aoclick = aoclick + 1;
		System.out.println("clickek: " + aoclick);
	}


	@Override
	public void TickMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TickS() {
		aoeido = aoeido + 1;
		System.out.println("ido: " + aoeido);
		
	}
	
	

}
