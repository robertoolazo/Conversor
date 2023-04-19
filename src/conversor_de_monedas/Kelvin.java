package conversor_de_monedas;

public class Kelvin extends Temperatura {
	
	
	public Kelvin(double cantidadACambiar,int Formula) {
		super(cantidadACambiar, Formula);
		
		
	}

	@Override
	public double Cambiar() {
		if(getFormula() == 1) {
			
			setValorDecambioTotal(((this.getCantidadACambiar() - 273.15) * 9/5) + 32);
		}

		else {
			
			setValorDecambioTotal(this.getCantidadACambiar() -  273.15);
		}
		return getValorDecambioTotal();
	}
	
	
}
