package conversor_de_monedas;

import javax.swing.JOptionPane;

public class cliente {
 public static void main(String[] args) {
	
	SeleccionDeTemperatura t = new  SeleccionDeTemperatura(2, 0,1);
	t.Validar();
	System.out.println(t);
	JOptionPane.showMessageDialog(null, t);
	
	
	
 }
}


/**switch(getFormula()) {
case 1:
	System.out.println("entro a formula de F");
	setValorDecambioTotal(1 * (this.getCantidadACambiar()- 0) + 0);
	break;
	
case 2:
	System.out.println("entro a formula de c");
	setValorDecambioTotal(this.getCantidadACambiar() -  273.15);
	break;
}
/**if(getFormula() == 1) {
	System.out.println("entro a formula de F");
	setValorDecambioTotal(1 * (this.getCantidadACambiar()- 0) + 0);
}

else {
	System.out.println("entro a formula de c");
	setValorDecambioTotal(this.getCantidadACambiar() -  273.15);
}*/