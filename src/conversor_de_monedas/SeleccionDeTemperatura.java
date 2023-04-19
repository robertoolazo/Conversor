package conversor_de_monedas;

public class SeleccionDeTemperatura extends Conversor{
	int seleccionDeUnidadBase;
	int seleccionDeUnidadDeConversion;
	double total;
	
	public SeleccionDeTemperatura(int seleccionDeunidadBase , int seleccionDeUnidadAConvertir , double cantidadACambiar  ) {
		this.seleccionDeUnidadBase = seleccionDeunidadBase;
		this.seleccionDeUnidadDeConversion = seleccionDeUnidadAConvertir;
		this.setCantidadACambiar(cantidadACambiar); 
		}

	public int getSeleccionDeUnidadBase() {
		return seleccionDeUnidadBase;
	}

	public void setSeleccionDeUnidadBase(int seleccionDeUnidadBase) {
		this.seleccionDeUnidadBase = seleccionDeUnidadBase;
	}

	public int getSeleccionDeUnidadAConvertir() {
		return seleccionDeUnidadDeConversion;
	}

	public void setSeleccionDeUnidadAConvertir(int seleccionDeUnidadAConvertir) {
		this.seleccionDeUnidadDeConversion = seleccionDeUnidadAConvertir;
	}
	
	
	public void  Validar() {
		switch(seleccionDeUnidadBase) {
		case 0:
			switch(seleccionDeUnidadDeConversion) {
			// Celsius a  Fahrenheit
			case 0:
				Temperatura tempC1 = new Celsius(this.getCantidadACambiar(),1);
				tempC1.Cambiar();
				total = tempC1.getValorDecambioTotal();
				break;
			// Celsius a Kelvin
			case 1:
				Temperatura tempC2 = new Celsius(this.getCantidadACambiar(),2);
				tempC2.Cambiar();
				total = tempC2.getValorDecambioTotal();
				break;
			// Celsius a
			case 2:
				break;
			}
			break;
		case 1:
			switch(seleccionDeUnidadDeConversion) {
			// Fahrenheit a 
			case 0: 
				break;
			// Fahrenheit a Kelvin
			case 1:
				Temperatura tempF1 = new Fahrenheit(this.getCantidadACambiar(),1);
				tempF1.Cambiar();
				total = tempF1.getValorDecambioTotal();
				break;
			// Fahrenheit a Celsius
			case 2:
				Temperatura tempF2 = new Fahrenheit(this.getCantidadACambiar(),2);
				tempF2.Cambiar();
				total = tempF2.getValorDecambioTotal();
				break;
			}
			break;
		case 2:
			switch(seleccionDeUnidadDeConversion) {
			//Kelvin a Fahrenheit
			case 0: 
				Temperatura tempK1 = new Kelvin(this.getCantidadACambiar(),1);
				tempK1.Cambiar();
				total = tempK1.getValorDecambioTotal();
				break;
			//Kelvin a
			case 1:
				break;
			//Kelvin a celsius
			case 2:
				Temperatura tempK2 = new Kelvin(this.getCantidadACambiar(),2);
				tempK2.Cambiar();
				total = tempK2.getValorDecambioTotal();
				break;
			}
			break;
		}
	}
	
	@Override
	public String toString() {
		return "el valor de cambio es " + total;
	}
}
