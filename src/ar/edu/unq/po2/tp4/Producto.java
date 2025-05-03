package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
    /**
     * Constructor para crear un nuevo Producto.
     *
     * @param nombre El nombre del producto.
     * @param precioBase El precio base del producto antes de descuentos.
     * @param esPrecioCuidado Indica si el producto es parte del programa Precios Cuidados.
     */
	public Producto(String nombre, double precioBase, boolean esPrecioCuidado){
		this.nombre = nombre;
		this.precio = precioBase;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	 /**
     * Constructor alternativo que asume que el producto NO es parte de Precios Cuidados
     * por defecto.
     *
     * @param nombre El nombre del producto.
     * @param precio El precio inicial del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = false; // Por defecto, no es Precio Cuidado
    }

	
	public String getNombre() {
		return nombre; 
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}
}
