package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre; 
	private String direccion; 
	private List<Producto> stockProductos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.stockProductos = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void agregarProducto(Producto producto) {
		this.stockProductos.add(producto);
		System.out.println("Producto " + producto.getNombre() + " agregado al stock");
	}
	
	public int getCantidadDeProductos(){
		return this.stockProductos.size();
	}
	
	public double getPrecioTotal() {
		double sumaTotal = 0.0;
		for (Producto producto : this.stockProductos) {
			sumaTotal += producto.getPrecio();
		}
		return sumaTotal;
	}
	
	
}
