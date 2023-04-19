package conversor_de_monedas;

public class Fahrenheit extends Temperatura{
	
	public Fahrenheit(double cantidadACambiar,int Formula) {
		super(cantidadACambiar, Formula);
		
	}

	@Override
	public double Cambiar() {
		if(getFormula() == 1) {
			setValorDecambioTotal((this.getCantidadACambiar() - 32) * 5/9 + 273.15);
		}else {
			setValorDecambioTotal((this.getCantidadACambiar() - 32) * 5/9);
		}
		
		return getValorDecambioTotal();
	}
}
