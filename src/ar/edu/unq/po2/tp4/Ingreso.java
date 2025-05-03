package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mes, String concepto, double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
    // Getters
    public String getMes() {
        return mes;
    }

    public String getConcepto() {
        return concepto;
    }

    /**
     * Retorna el monto total percibido para este ingreso.
     * Para un Ingreso genérico, es simplemente el monto percibido.
     *
     * @return El monto percibido.
     */
    public double getMontoPercibido() {
        return montoPercibido;
    }

    /**
     * Retorna el monto de este ingreso que es imponible al impuesto.
     * Por defecto, para un Ingreso genérico, es igual al monto percibido.
     * Este método está diseñado para ser sobreescrito por subclases
     * que tengan reglas de imponibilidad diferentes.
     *
     * @return El monto imponible.
     */
    public double getMontoImponible() {
        return this.montoPercibido;
    }
}

