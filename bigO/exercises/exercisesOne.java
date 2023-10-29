package bigO.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// Soma de Elementos:
// Escreva um programa que calcule a soma de todos os elementos em um array de inteiros.

public class exercisesOne {
    
    /**
     * The function generates an array of random numbers, squares each number, and then prints the squared numbers.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] generateNumber = IntStream.generate(() -> random.nextInt(25)).limit(25).toArray();
        IntStream original = Arrays.stream(generateNumber).map(i -> i * i);

        original.forEach(System.out::println);
    }
}
