package ar.edu.unq.po2.tp3; 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

    private Counter counter;

    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     * @throws Exception
     */
    @BeforeEach
    public void setup() throws Exception {
        //Se crea el contador
        counter = new Counter();


        counter.addNumber(2); // Par
        counter.addNumber(4); // Par
        counter.addNumber(6); // Par
        counter.addNumber(8); // Par
        counter.addNumber(10); // Par
        counter.addNumber(12); // Par
        counter.addNumber(14); // Par
        counter.addNumber(16); // Par
        counter.addNumber(1);  // Impar
        counter.addNumber(18); // Par
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOccurrences();

        // I check the amount is the expected one
        assertEquals(9, amount); // Esperamos 9 pares según el assert del PDF
    }

    @Test
    public void testOddNumbers() {
        // Verifica la cantidad de impares
        int amount = counter.getOddOccurrences();
        assertEquals(1, amount); // Debería haber 1 impar en la lista que definí
    }

     @Test
    public void testMultiplesOccurrences() {
        // Verifica la cantidad de múltiplos de 2
        int amountOfMultiplesOf2 = counter.getMultiplesOccurrences(2);
        assertEquals(9, amountOfMultiplesOf2); // Los números pares son múltiplos de 2

        // Verifica la cantidad de múltiplos de 3
        int amountOfMultiplesOf3 = counter.getMultiplesOccurrences(3);
        assertEquals(0, amountOfMultiplesOf3); // No agregué múltiplos de 3 en el setup

        // Verifica la cantidad de múltiplos de 1
        int amountOfMultiplesOf1 = counter.getMultiplesOccurrences(1);
        assertEquals(10, amountOfMultiplesOf1); // Todos los números son múltiplos de 1

         // Verifica la cantidad de múltiplos de 0
        int amountOfMultiplesOf0 = counter.getMultiplesOccurrences(0);
        assertEquals(0, amountOfMultiplesOf0); // No hay 0 en la lista, ningún otro número es múltiplo de 0

        // Agregamos un 0 para probar el caso de múltiplo de 0
        counter.addNumber(0);
        int amountOfMultiplesOf0WithZero = counter.getMultiplesOccurrences(0);
        assertEquals(1, amountOfMultiplesOf0WithZero); // Ahora hay un 0 en la lista
    }
}