package bigO.lambda;

import java.util.Random;
import java.util.stream.IntStream;

public class InsertionSort {
    
    /**
     * The main function generates an array of 100 random integers between 0 and 100 and then calls the insertionSort function to sort the array.
     */
    public static void main(String[] args) {
        Random random = new Random();

        int []vetor = IntStream.generate(() -> random.nextInt(100))
        .limit(100)
        .toArray();

        insertionSort(vetor);

        for (int i : vetor) {
            System.out.println(i + "");
        }
    }

    /**
     * The insertionSort function sorts an array of integers in ascending order using the insertion sort algorithm.
     * 
     * @param vetor The parameter "vetor" is an array of integers that needs to be sorted using the insertion sort algorithm.
     */
    public static void insertionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int x = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > x) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = x;
        }
    }

}
