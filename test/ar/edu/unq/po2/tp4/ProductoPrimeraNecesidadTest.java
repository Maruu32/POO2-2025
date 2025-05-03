package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8, false, 0.10);
		arroz = new ProductoPrimeraNecesidad("Arroz gallo", 20d, true, 0.08);
	}
	
	@Test
	public void testCalcularPrecioConDescuentoEspecifico() {
		// Precio de la leche: 8 * (1 - 0.10) = 7.2
		assertEquals(7.2, leche.getPrecio(), 0.001); 
		// Precio del arroz: 20 * (1 - 0.08) = 18.4
		assertEquals(18.4, arroz.getPrecio(), 0.001);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
}
