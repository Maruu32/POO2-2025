package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
    /**
     * Retorna el monto total percibido por el trabajador sumando todos sus ingresos.
     * Llama a getMontoPercibido() en cada ingreso.
     *
     * @return El monto total percibido.
     */
    public double getTotalPercibido() {
        double total = 0.0;
        for (Ingreso ingreso : this.ingresos) {
            total += ingreso.getMontoPercibido(); // Llama al método de cada objeto Ingreso
        }
        return total;
    }
    
    /**
     * Retorna el monto total imponible al impuesto al trabajador.
     * Suma el monto imponible de cada ingreso (considerando la sobreescritura
     * en IngresoPorHorasExtras).
     *
     * @return El monto total imponible.
     */
    public double getMontoImponible() {
        double totalImponible = 0.0;
        for (Ingreso ingreso : this.ingresos) {
            totalImponible += ingreso.getMontoImponible(); // Llama al método de cada objeto Ingreso (polimorfismo)
        }
        return totalImponible;
    }
    
    /**
     * Retorna el monto a pagar por el trabajador, calculado como el 2% del monto imponible.
     * El 2% se representa como 0.02.
     *
     * @return El monto del impuesto a pagar.
     */
    public double getImpuestoAPagar() {
        double montoImponible = this.getMontoImponible();
        return montoImponible * 0.02; // Calcula el 2%
    }
}
