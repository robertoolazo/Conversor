package conversor_de_monedas;
public abstract class Moneda extends Conversor implements Cambio {
	private double valorDeCambio;
	
	
	public Moneda(double cantidadACambiar , double valorDeCambio) {
		this.valorDeCambio = valorDeCambio;
		this.setCantidadACambiar(cantidadACambiar);
	}
	


	public double getValorDeCambio() {
		return valorDeCambio;
	}

	
	public void setValorDeCambio(double valorDeCambio) {
		this.valorDeCambio = valorDeCambio;
	}
	
	public abstract double Cambiar();

	
}
 