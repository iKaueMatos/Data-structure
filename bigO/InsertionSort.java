package bigO;

import java.util.Random;
import java.util.stream.IntStream;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 25;
        
        int[] vetor = IntStream.generate(() -> random.nextInt(arraySize))
        .limit(arraySize)
        .toArray();

        for (int firstUnSortedIndex = 1; firstUnSortedIndex < vetor.length; firstUnSortedIndex++) {
            int newElement = vetor[firstUnSortedIndex];

            int i;
            for (i = firstUnSortedIndex; i > 0 && vetor[i - 1] > newElement; i--) {
                vetor[i] = vetor[i - 1];
            }

            vetor[i] = newElement;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
