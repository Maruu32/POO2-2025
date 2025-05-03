package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTest {

	private IngresoHorasExtras horasExtraEnero;
	private IngresoHorasExtras horasExtraFebrero;
	
	@BeforeEach
	public void setUp() {
		horasExtraEnero = new IngresoHorasExtras("Enero", "A", 5000, 10);
		horasExtraFebrero = new IngresoHorasExtras("Febrero", "B", 7500,15);
		
	}
	
	@Test
	public void testGetMontoPercibido() {
		assertEquals(5000, horasExtraEnero.getMontoPercibido(), 0.001);
        assertEquals(7500.0, horasExtraFebrero.getMontoPercibido(), 0.001);
	}
	
    @Test
    public void testGetMontoImponibleParaHorasExtras() {
        // Para ingresos por horas extras, el monto imponible siempre es 0
        assertEquals(0.0, horasExtraEnero.getMontoImponible(), 0.001); // Usar delta
        assertEquals(0.0, horasExtraFebrero.getMontoImponible(), 0.001);
    }

    @Test
    public void testGetCantidadHorasExtras() {
        assertEquals(10, horasExtraEnero.getCantidadHorasExtras());
        assertEquals(15, horasExtraFebrero.getCantidadHorasExtras());
    }

     @Test
    public void testGetMesYConcepto() {
        assertEquals("Enero", horasExtraEnero.getMes());
        assertEquals("A", horasExtraEnero.getConcepto());
        assertEquals("Febrero", horasExtraFebrero.getMes());
        assertEquals("B", horasExtraFebrero.getConcepto());
    }

}
