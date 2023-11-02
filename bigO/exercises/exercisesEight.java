package bigO.exercises;

import java.util.Random;
import java.util.stream.IntStream;

/* Contagem de ocorrências:
Escreva uma função que conte o número de vezes que um elemento específico aparece em um array. */

public class exercisesEight {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 25;
        int[] vetor = IntStream.generate(() -> random.nextInt(arraySize))
        .limit(arraySize)
        .toArray();

        for (int i : vetor) {
            System.out.println("array gerado aleatoriamente: " + vetor[i]);
        }
        
        int target = random.nextInt(arraySize);
        int count = countOccurrences(vetor, target);
        System.out.println("O numero " + target + " aparece " + count + " vezes no array.");
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;

        for (int num : array) {
            if(num == target) {
                count ++;
            }
        }
        return count;
    }
}
