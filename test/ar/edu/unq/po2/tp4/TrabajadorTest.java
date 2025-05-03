package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TrabajadorTest {

    private Trabajador trabajador;
    private Ingreso ingresoSueldoEnero;
    private Ingreso ingresoComisionFebrero;
    private IngresoHorasExtras horasExtrasMarzo;
    private IngresoHorasExtras horasExtrasAbril;
    private Ingreso ingresoSueldoMayo;


    @BeforeEach
    public void setUp() {
        trabajador = new Trabajador(); // Crea un nuevo trabajador

        // Creamos diferentes tipos de ingresos
        ingresoSueldoEnero = new Ingreso("Enero", "Sueldo", 60000.0);
        ingresoComisionFebrero = new Ingreso("Febrero", "Comision", 15000.0);
        horasExtrasMarzo = new IngresoHorasExtras("Marzo", "HE", 8000.0, 20);
        horasExtrasAbril = new IngresoHorasExtras("Abril", "Adicional HE", 5000.0, 10);
        ingresoSueldoMayo = new Ingreso("Mayo", "Sueldo", 65000.0);

        // Agregamos algunos al trabajador para el test mixto
        trabajador.agregarIngreso(ingresoSueldoEnero);
        trabajador.agregarIngreso(horasExtrasMarzo);
        trabajador.agregarIngreso(ingresoSueldoMayo);
    }

    @Test
    public void testTrabajadorSinIngresos() {
        Trabajador trabajadorNuevo = new Trabajador(); // Otro trabajador sin ingresos

        assertEquals(0.0, trabajadorNuevo.getTotalPercibido(), 0.001);
        assertEquals(0.0, trabajadorNuevo.getMontoImponible(), 0.001);
        assertEquals(0.0, trabajadorNuevo.getImpuestoAPagar(), 0.001);
    }

    @Test
    public void testTrabajadorConIngresosHabituales() {
        Trabajador trabajadorSoloHabitual = new Trabajador();
        trabajadorSoloHabitual.agregarIngreso(ingresoSueldoEnero);
        trabajadorSoloHabitual.agregarIngreso(ingresoComisionFebrero);
        trabajadorSoloHabitual.agregarIngreso(ingresoSueldoMayo);

        // Total Percibido: 60000 + 15000 + 65000 = 140000
        assertEquals(140000.0, trabajadorSoloHabitual.getTotalPercibido(), 0.001);

        // Monto Imponible: Igual al total percibido para solo ingresos habituales
        assertEquals(140000.0, trabajadorSoloHabitual.getMontoImponible(), 0.001);

        // Impuesto a Pagar: 2% de 140000 = 2800
        assertEquals(2800.0, trabajadorSoloHabitual.getImpuestoAPagar(), 0.001);
    }

    @Test
    public void testTrabajadorConIngresosPorHorasExtras() {
        Trabajador trabajadorSoloHE = new Trabajador();
        trabajadorSoloHE.agregarIngreso(horasExtrasMarzo);
        trabajadorSoloHE.agregarIngreso(horasExtrasAbril);

        // Total Percibido: 8000 + 5000 = 13000
        assertEquals(13000.0, trabajadorSoloHE.getTotalPercibido(), 0.001);

        // Monto Imponible: 0 para ingresos por horas extras
        assertEquals(0.0, trabajadorSoloHE.getMontoImponible(), 0.001);

        // Impuesto a Pagar: 2% de 0 = 0
        assertEquals(0.0, trabajadorSoloHE.getImpuestoAPagar(), 0.001);
    }

    @Test
    public void testTrabajadorConIngresosMixtos() {
        // En setUp ya agregamos ingresoSueldoEnero, horasExtrasMarzo, ingresoSueldoMayo
        // Faltaría agregar ingresoComisionFebrero y horasExtrasAbril si queremos testear más mixtura
         trabajador.agregarIngreso(ingresoComisionFebrero);
         trabajador.agregarIngreso(horasExtrasAbril);

        // Total Percibido: Suma de TODOS (60k + 8k + 65k + 15k + 5k) = 153000
        assertEquals(153000.0, trabajador.getTotalPercibido(), 0.001);

        // Monto Imponible: Suma SOLO de Habituales (60k + 15k + 65k) = 140000
        assertEquals(140000.0, trabajador.getMontoImponible(), 0.001);

        // Impuesto a Pagar: 2% de 140000 = 2800
        assertEquals(2800.0, trabajador.getImpuestoAPagar(), 0.001);
    }
}