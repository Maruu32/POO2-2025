package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
		
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
    public ProductoPrimeraNecesidad(String nombre, double precioBase, double descuento) {
        super(nombre, precioBase); 
        this.descuento = descuento;
    }
    @Override
    public double getPrecio() {
    	double precio = super.getPrecio();
    	return precio * (1 - this.descuento);
    }
    
    public double getDescuentoPorcentaje() {
        return descuento;
    }
}
