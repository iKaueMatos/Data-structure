package BubbleSort;

import java.util.Random;
import java.util.stream.IntStream;

public class BubbleSortTwo {
    public static void main(String[] args) {
        int size = 5;
        int[] vetor = IntStream.generate(() -> new Random().nextInt(size))
        .limit(size)
        .toArray();

        for (int i : vetor) {
            System.out.println(vetor[i]);
        }

        for (int i = vetor.length -1; i > 0; i--) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    System.out.println("valor do vetor atual: " + vetor[j]);
                    int temp = vetor[j];
                    System.out.println("Valor do vetor após ser armazenado na variavel temporaria " + temp);
                    vetor[j] = vetor[j + 1];
                    System.out.println("Valor do vetor após se armazena e incremendata com + 1 para capturar o proximo valor " + vetor.toString());
                    vetor[j + 1] = temp;
                    System.out.println("valor da variavel final apos a troca e etc. " + vetor);
                }
            }
        }

        for (int i : vetor) {
            System.out.println("Vetor ordenado!");
            System.out.println(vetor[i]);
        }
    }
}
