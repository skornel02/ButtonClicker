package me.studio.kiegeszitok;

import me.studio.main.Main;
import me.studio.main.gui;
import me.studio.manager.Manager;

public class FrameUpdater extends Manager {


	
	@Override
	public void Click() {
		Main.FrameUpdater();
	}

	@Override
	public void TickMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TickS() {
		Main.FrameUpdater();
		
	}


	

}
