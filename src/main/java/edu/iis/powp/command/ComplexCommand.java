package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements IPlotterCommand
{
	private List<IPlotterCommand> lista;
	
	public List<IPlotterCommand> getLista() {
		return lista;
	}

	public void setLista(List<IPlotterCommand> lista) {
		this.lista = lista;
	}

	public ComplexCommand(List<IPlotterCommand> lista) {
		super();
		this.lista = lista;
	}
	
	@Override
	public void execute(IPlotter driver) {
		for(Object element : lista) {
			((IPlotterCommand)element).execute(driver);
		}
		
	}
	
	//W hierarchii poleceń występuje wzorzec Composite.
}
