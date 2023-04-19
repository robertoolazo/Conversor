package conversor_de_monedas;
public class Conversor {
	private double cantidadACambiar;
	private double ValorDecambioTotal;
	
	
	
	public double getCantidadACambiar() {
		return cantidadACambiar;
	}
	
	public void setCantidadACambiar(double cantidadACambiar) {
		this.cantidadACambiar = cantidadACambiar;
	}
	
	public double getValorDecambioTotal() {
		return ValorDecambioTotal;
	}
	
	public void setValorDecambioTotal(double valorDecambioTotal) {
		ValorDecambioTotal = valorDecambioTotal;
	}
	
	public String toString() {
		return "el valor de cambio es " + ValorDecambioTotal ;
	}

	
	
	
	
}
