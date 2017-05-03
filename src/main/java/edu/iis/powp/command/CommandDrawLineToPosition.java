package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements IPlotterCommand
{
	private int x;
	private int y;
	
	public CommandDrawLineToPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter driver) {
		driver.drawTo(this.x, this.y);
		
	}

}
