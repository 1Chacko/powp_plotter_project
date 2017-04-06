package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

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
    	else if(nameOfFigure.equals("Figure Joe 2")){
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    }
}
