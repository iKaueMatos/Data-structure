package bigO;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 25;

        int[] vetor = IntStream
                .generate(() -> random.nextInt(arraySize))
                .limit(arraySize)
                .toArray();

        System.out.println("Original Array:");
        printArray(vetor);

        // Bubble Sort
        for (int lastIndex = vetor.length - 1; lastIndex > 0; lastIndex--) {
            for (int processingVariable = 0; processingVariable < lastIndex; processingVariable++) {
                if (vetor[processingVariable] > vetor[processingVariable + 1]) {
                    int temp = vetor[processingVariable];
                    vetor[processingVariable] = vetor[processingVariable + 1];
                    vetor[processingVariable + 1] = temp;
                }
            }
        }
        
        System.out.println("\nSorted Array:");
        printArray(vetor);
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
