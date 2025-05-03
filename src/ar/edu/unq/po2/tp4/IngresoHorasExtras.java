package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso{
	
	private int cantHorasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, double montoPercibido, int cantHorasExtras) {
		super(mes, concepto, montoPercibido);
		this.cantHorasExtras = cantHorasExtras;
	}
	
    // Getter específico para horas extras
    public int getCantidadHorasExtras() {
        return cantHorasExtras;
    }

    /**
     * Sobreescribe el método getMontoImponible de la clase padre.
     * Para los ingresos por horas extras, el monto imponible es siempre 0.
     *
     * @return Siempre 0.0.
     */
    @Override // Indica que este método sobreescribe uno de la superclase
    public double getMontoImponible() {
        return 0.0;
    }
}
