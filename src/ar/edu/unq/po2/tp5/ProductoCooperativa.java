package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
    private static final double descuentoCooperativa = 0.10; // 10%

	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre,precio, stock);
	}
	
	public double calcularPrecioFinal() {
		return getPrecio() * (1  - descuentoCooperativa);
	}

}
