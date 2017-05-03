package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.factories.FigureFactory;

public class SelectTestFigureOptionListener implements ActionListener
{
	private String nameOfFigure;
	
	public SelectTestFigureOptionListener(String figure) {
		this.nameOfFigure = figure;
	}
	
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(nameOfFigure.equals("Figure Joe 1")) {
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    	else if(nameOfFigure.equals("Figure Joe 2")) {
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    	else if(nameOfFigure.equals("Rhombus")) {
    		ComplexCommand command = FigureFactory.drawRhombus(30, 30, 100);
    		command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    	else if(nameOfFigure.equals("Rectangle")) {
    		ComplexCommand command = FigureFactory.drawRectangle(30, 30, 50, 100);
    		command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    }
}
