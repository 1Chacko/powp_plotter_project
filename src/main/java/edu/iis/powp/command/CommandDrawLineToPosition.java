package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements IPlotterCommand
{
	private int x;
	private int y;
	
	@Override
	public void execute(IPlotter driver) {
		driver.drawTo(x, y);
		
	}

}