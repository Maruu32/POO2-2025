package ar.edu.unq.po2.tp5;

public class ProductoTradicional extends Producto {
	
	public ProductoTradicional(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	@Override
	public double calcularPrecioFinal() {
		return getPrecio();
	}
}
