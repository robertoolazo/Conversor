package conversor_de_monedas;

public abstract class Temperatura extends Conversor implements Cambio {
	private int Formula;
	
	public Temperatura(double cantidadACambiar ,int Formula) {
		this.setCantidadACambiar(cantidadACambiar);
		this.Formula = Formula;
	}
	

	public int getFormula() {
		return Formula;
	}
	
	
	public abstract double Cambiar();



	
}
