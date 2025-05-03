package ar.edu.unq.po2.tp3; // Ajusta el paquete según la estructura de tu proyecto

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List<Integer> numbers;

    public Counter() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int getEvenOccurrences() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getOddOccurrences() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int getMultiplesOccurrences(int multiple) {
        int count = 0;
        for (int number : numbers) {
            if (number != 0 && multiple != 0 && number % multiple == 0) {
                count++;
            } else if (number == 0 && multiple == 0) {
                 // Consider 0 a multiple of 0 based on common interpretations, adjust if needed
                 count++;
            } else if (number != 0 && multiple == 0) {
                 // No non-zero number is a multiple of 0
                 // count remains 0
            } else if (number == 0 && multiple != 0) {
                 // 0 is a multiple of any non-zero number
                 count++;
            }

        }
        return count;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}