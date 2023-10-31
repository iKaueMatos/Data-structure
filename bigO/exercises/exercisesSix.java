package bigO.exercises;

import java.util.Random;
import java.util.stream.IntStream;

/*
 * Remoção de Duplicatas:
   Dado um array, remova todas as duplicatas e retorne o array sem duplicatas.
 */

public class exercisesSix {
    public static void main(String[] args) {
        System.out.println("Removendo elementos duplicados de um array usando um loop!");

        Random random = new Random();
        int arraySize = 25;

        int[] vetor = IntStream.generate(() -> random.nextInt(arraySize))
            .limit(arraySize)
            .toArray();

        int[] arrayWithoutDuplicates = new int[vetor.length];
        int size = 0;

        for (int i = 0; i < vetor.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (vetor[i] == arrayWithoutDuplicates[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                arrayWithoutDuplicates[size] = vetor[i];
                size++;
            }
        }

        int[] result = new int[size];
        System.arraycopy(arrayWithoutDuplicates, 0, result, 0, size);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
