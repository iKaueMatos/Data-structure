package bigO.exercises;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
    Pesquisa em um Array:
    Escreva um programa que verifica se um elemento específico está presente em um array.
 * 
 */


public class exercisesFive {
    public static void main(String[] args) {

        Random numberAleatory = new Random();
        int arraySize = 25;

        int[] vetor = IntStream.generate(() -> numberAleatory.nextInt(arraySize))
        .limit(arraySize)
        .toArray();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o numero que você deseja buscar!: ");
        int number = input.nextInt();

        System.out.println("vetor gerado aleatoriamente");
        for (int i : vetor) {
            System.out.println(i + " ");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == number) {
                System.out.println("o numero existe no array!");
            } else {
                System.out.println("O numero não existe no array!");
            }
        }
    }
}
