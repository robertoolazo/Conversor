package conversor_de_monedas;

public class SeleccionDeMoneda extends Conversor{
	int seleccionDeUnidadBase;
	int seleccionDeUnidadDeConversion;
	double total;
	
	public SeleccionDeMoneda(int seleccionDeunidadBase , int seleccionDeUnidadAConvertir , double cantidadACambiar  ) {
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
				case 0: // MXN a USD
					Moneda monedaM1 = new PesoMexicano(this.getCantidadACambiar(), 0.053);
					monedaM1.Cambiar();
					total =  monedaM1.getValorDecambioTotal();
					break;
				case 1: // MXN a EUR
					Moneda monedaM2 = new PesoMexicano(this.getCantidadACambiar(), 0.050);
					monedaM2.Cambiar();
					total =  monedaM2.getValorDecambioTotal();
					break;
				case 2: // MXN a GBP
					Moneda monedaM3 = new PesoMexicano(this.getCantidadACambiar(), 0.043);
					monedaM3.Cambiar();
					total =  monedaM3.getValorDecambioTotal();
					break;
				case 3: // MXN a JPY
					Moneda monedaM4 = new PesoMexicano(this.getCantidadACambiar(), 6.97);
					monedaM4.Cambiar();
					total =  monedaM4.getValorDecambioTotal();
					break;
				case 4: // MXN a KRW
					Moneda monedaM5 = new PesoMexicano(this.getCantidadACambiar(), 69.22);
					monedaM5.Cambiar();
					total =  monedaM5.getValorDecambioTotal();
					break;
				case 5:
					
				break;
			}
			break;
			
		case 1:
			switch(seleccionDeUnidadDeConversion) {
			case 0:
				break;
			case 1: // USD a EUR
				Moneda monedaD1 = new Dolar(this.getCantidadACambiar(), 0.94);
				monedaD1.Cambiar();
				total =  monedaD1.getValorDecambioTotal();
				break;
			case 2: // USD a GBP
				Moneda monedaD2 = new Dolar(this.getCantidadACambiar(), 0.82);
				monedaD2.Cambiar();
				total =  monedaD2.getValorDecambioTotal();
				break;
			case 3: // USD a JPY
				Moneda monedaD3 = new Dolar(this.getCantidadACambiar(), 131.84);
				monedaD3.Cambiar();
				total =  monedaD3.getValorDecambioTotal();
				break;
			case 4: // USD a KRW
				Moneda monedaD4 = new Dolar(this.getCantidadACambiar(), 1308.95);
				monedaD4.Cambiar();
				total =  monedaD4.getValorDecambioTotal();
				break;
			case 5: // USD a MXN
				Moneda monedaD5 = new Dolar(this.getCantidadACambiar(), 18.91);
				monedaD5.Cambiar();
				total =  monedaD5.getValorDecambioTotal();
				break;
			}
			break;
		case 2: 
			switch(seleccionDeUnidadDeConversion) {
			case 0: // //  EUR a USD 
				Moneda monedaE1 = new Euro(this.getCantidadACambiar(), 1.07);
				monedaE1.Cambiar();
				total =  monedaE1.getValorDecambioTotal();
				break;
			case 1: 
				break;
			case 2: // EUR a GBP
				Moneda monedaE2 = new Euro(this.getCantidadACambiar(), 0.88);
				monedaE2.Cambiar();
				total =  monedaE2.getValorDecambioTotal();
				break;
			case 3: // EUR a JPY
				Moneda monedaE3 = new Euro(this.getCantidadACambiar(), 140.96);
				monedaE3.Cambiar();
				total =  monedaE3.getValorDecambioTotal();
				break;
			case 4: // EUR a KRW
				Moneda monedaE4 = new Euro(this.getCantidadACambiar(), 1399.29);
				monedaE4.Cambiar();
				total =  monedaE4.getValorDecambioTotal();
				break;
			case 5: // EUR a MXN
				Moneda monedaE5 = new Euro(this.getCantidadACambiar(), 20.22);
				monedaE5.Cambiar();
				total =  monedaE5.getValorDecambioTotal();
				break;
			}
			break;
			
		case 3:
			switch(seleccionDeUnidadDeConversion) {
			case 0: //GBP a USD
				Moneda monedaL1 = new LibrasEsterlinas(this.getCantidadACambiar(), 1.22);
				monedaL1.Cambiar();
				total =  monedaL1.getValorDecambioTotal();
				break;
			case 1: // GBP a EUR
				Moneda monedaL2 = new LibrasEsterlinas(this.getCantidadACambiar(), 1.14);
				monedaL2.Cambiar();
				total =  monedaL2.getValorDecambioTotal();
				break;
			case 2: // GBP a GBP
				
				break;
			case 3: // GBP a JPY
				Moneda monedaL3 = new LibrasEsterlinas(this.getCantidadACambiar(), 160.57);
				monedaL3.Cambiar();
				total =  monedaL3.getValorDecambioTotal();
				break;
			case 4: // GBP a KRW
				Moneda monedaL4 = new LibrasEsterlinas(this.getCantidadACambiar(), 1594.37);
				monedaL4.Cambiar();
				total =  monedaL4.getValorDecambioTotal();
				break;
			case 5: // GBP a MXN
				Moneda monedaL5 = new LibrasEsterlinas(this.getCantidadACambiar(), 23.04);
				monedaL5.Cambiar();
				total =  monedaL5.getValorDecambioTotal();
				break;
			}
			break;
			
		case 4:
			switch(seleccionDeUnidadDeConversion) {
			case 0: // JPY a USD
				Moneda monedaJ1 = new YenJapones(this.getCantidadACambiar(), 0.0076);
				monedaJ1.Cambiar();
				total =  monedaJ1.getValorDecambioTotal();
				break;
			case 1: // JPY a EUR
				Moneda monedaJ2 = new YenJapones(this.getCantidadACambiar(), 0.0071);
				monedaJ2.Cambiar();
				total =  monedaJ2.getValorDecambioTotal();
				break;
			case 2: // JPY a GBP
				Moneda monedaJ3 = new YenJapones(this.getCantidadACambiar(), 0.0062);
				monedaJ3.Cambiar();
				total =  monedaJ3.getValorDecambioTotal();
				break;
			case 3: 
				
				break;
			case 4: // JPY a KRW
				Moneda monedaJ4 = new YenJapones(this.getCantidadACambiar(), 9.93);
				monedaJ4.Cambiar();
				total =  monedaJ4.getValorDecambioTotal();
				break;
			case 5: // JPY a MXN
				Moneda monedaJ5 = new YenJapones(this.getCantidadACambiar(), 0.14);
				monedaJ5.Cambiar();
				total =  monedaJ5.getValorDecambioTotal();
				break;
			}
			break;
			
		case 5:
			switch(seleccionDeUnidadDeConversion) {
			case 0: //KRW a USD
				Moneda monedaW1 = new WonSulCoreano(this.getCantidadACambiar(), 0.00076);
				monedaW1.Cambiar();
				total =  monedaW1.getValorDecambioTotal();
				break;
			case 1: // KRW a EUR
				Moneda monedaW2 = new WonSulCoreano(this.getCantidadACambiar(), 0.00071);
				monedaW2.Cambiar();
				total =  monedaW2.getValorDecambioTotal();
				break;
			case 2: // KRW a GBP
				Moneda monedaW3 = new WonSulCoreano(this.getCantidadACambiar(), 0.00063);
				monedaW3.Cambiar();
				total =  monedaW3.getValorDecambioTotal();
				break;
			case 3: // KRW a JPY
				Moneda monedaW4 = new WonSulCoreano(this.getCantidadACambiar(), 0.10);
				monedaW4.Cambiar();
				total =  monedaW4.getValorDecambioTotal();
				break;
			case 4: 
				
				break;
			case 5: // KRW a MXN
				Moneda monedaW5 = new WonSulCoreano(this.getCantidadACambiar(), 0.014);
				monedaW5.Cambiar();
				total =  monedaW5.getValorDecambioTotal();
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

