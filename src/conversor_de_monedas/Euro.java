package conversor_de_monedas;
public class Euro extends Moneda {
	 
	

	public Euro(double cantidadACambiar, double valorDeCambio) {
		super(cantidadACambiar, valorDeCambio);
	
	}

	@Override
	public double Cambiar() {
		setValorDecambioTotal(this.getCantidadACambiar() * this.getValorDeCambio());
		return getValorDecambioTotal();
	}

	

	@Override
	public String toString() {
		return "el valor de cambio es " + getValorDecambioTotal() ;
	}

}
