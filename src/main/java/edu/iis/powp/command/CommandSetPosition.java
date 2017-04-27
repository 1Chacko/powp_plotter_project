package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements IPlotterCommand
{
	private int x;
	private int y;
	
	@Override
	public void execute(IPlotter driver) {
		driver.setPosition(x, y);
		
	}

}
