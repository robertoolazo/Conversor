package conversor_de_monedas;
public class Dolar extends Moneda {

	public Dolar(double cantidadACambiar, double valorDeCambio) {
		super(cantidadACambiar, valorDeCambio);
		
	}

	@Override
	public double Cambiar() {
		setValorDecambioTotal(this.getCantidadACambiar() * this.getValorDeCambio());
		return getValorDecambioTotal();
	}

	

	
}
