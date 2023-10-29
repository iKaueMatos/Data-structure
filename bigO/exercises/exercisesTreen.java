package bigO.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// Maior e Menor Valor:
// Escreva um programa que encontre o maior e o menor valor em um array de inteiros.

public class exercisesTreen {
    
    /**
     * This Java program generates an array of 25 random numbers between 0 and 24, and then finds the maximum and minimum numbers in the array.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] generateNumber = IntStream.generate(() -> random.nextInt(25)).limit(25).toArray();
        int numberMax = Arrays.stream(generateNumber).max().orElse(0);
        int numberMin = Arrays.stream(generateNumber).min().orElse(0);

        System.out.println("maior numero do array:" + numberMax);
        System.out.println("menor numero do array:" + numberMin);
    }
}
