package edu.iis.powp.factories;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.IPlotterCommand;

public class FigureFactory {
	
	public static ComplexCommand drawRhombus(int startX, int startY, int width) {
		
		List<IPlotterCommand> listOfCommands = new ArrayList<>();
		listOfCommands.add(new CommandSetPosition(startX, startY));
		listOfCommands.add(new CommandDrawLineToPosition(startX+width, startY));
		listOfCommands.add(new CommandDrawLineToPosition(startX+width+width, startY+width));
		listOfCommands.add(new CommandDrawLineToPosition(startX+width, startY+width));
		listOfCommands.add(new CommandDrawLineToPosition(startX, startY));
		
		return new ComplexCommand(listOfCommands);
	}
	
	public static ComplexCommand drawRectangle(int startX, int startY, int width, int height) {
		
		List<IPlotterCommand> listOfCommands = new ArrayList<>();
		listOfCommands.add(new CommandSetPosition(startX, startY));
		listOfCommands.add(new CommandDrawLineToPosition(startX+width, startY));
		listOfCommands.add(new CommandDrawLineToPosition(startX+width, startY+height));
		listOfCommands.add(new CommandDrawLineToPosition(startX, startY+height));
		listOfCommands.add(new CommandDrawLineToPosition(startX, startY));
		
		return new ComplexCommand(listOfCommands);
	}
}
