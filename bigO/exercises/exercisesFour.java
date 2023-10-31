package bigO.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 
    Reversão de Array:
    Inverta a ordem dos elementos em um array.
 * 
 */

public class exercisesFour {

    public static void main(String[] args) {
        Random numberAleatory = new Random();
        int arraySize = 25;
        
        int[] vetor = IntStream.generate(() -> numberAleatory.nextInt(arraySize))
        .limit(arraySize)
        .toArray();

        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }

        for (int i : vetor) {
            System.out.println(i + ", ");
        }

        //reverse do array de outra forma -> solução numero two
        Integer[] vetorTwo = IntStream.generate(() -> numberAleatory.nextInt(arraySize))
        .limit(arraySize)
        .boxed()
        .toArray(Integer[]::new);
        
        List<Integer> list = Arrays.asList(vetorTwo);
        Collections.reverse(list);
       
        Integer[] reversedArray = list.toArray(new Integer[0]);

        for (int j : reversedArray) {
            System.out.println(j + " ");
        }
    }
}
