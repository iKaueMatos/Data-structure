package bigO.lambda;

import java.util.Random;
import java.util.stream.IntStream;

public class BubbleSort {
    
    public static void main(String[] args) {
        Random numberAleatory = new Random();
        int upperbound = 25;
        int arraySize = 25;

        int[] vetor = IntStream.generate(() -> numberAleatory.nextInt(upperbound))
        .limit(arraySize)
        .toArray();

        System.out.println("Numeros desordenados!");
        IntStream.of(vetor).forEach(value -> System.out.println(value));

        blister(vetor);

        IntStream.of(vetor).forEach(value -> System.out.println("numeros ordenados:" + value));
    }

    /**
     * The function "blister" implements the bubble sort algorithm to sort an array of integers in ascending order.
     * 
     * @param vetor The parameter "vetor" is an array of integers.
     */
    private static void blister(int[] vetor) {
        for (int last = vetor.length - 1; last > 0; last --) {
            for (int processingVariable = 0; processingVariable < last; processingVariable++) {
                if(vetor[processingVariable] > vetor[processingVariable + 1]) {
                    swapTheElements(vetor, processingVariable,processingVariable + 1);
                }
            }
        }
    }

    /**
     * The function swaps two elements in an integer array.
     * 
     * @param vetor The parameter "vetor" is an array of integers.
     * @param processingVariable The index of the first element to be swapped.
     * @param processingVariableSub The parameter "processingVariableSub" is an integer that represents the index of the element in the array that you want to swap with the element at the index specified by "processingVariable".
     */
    public static void swapTheElements(int[] vetor, int processingVariable, int processingVariableSub) {
        int auxiliary = vetor[processingVariable];
        vetor[processingVariable] = vetor[processingVariableSub];
        vetor[processingVariableSub] = auxiliary;
    }
}
