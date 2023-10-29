package bigO.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

// Média de Elementos:
// Escreva um programa que calcule a média dos elementos em um array de números de ponto flutuante.

public class exercisesTwo {
    public static void main(String[] args) {
        Random random = new Random();
        double[] generateNumber = DoubleStream.generate(random::nextDouble).limit(23).toArray();

         // Calcula a média dos elementos
         double average = Arrays.stream(generateNumber).average().orElse(0.0);

         System.out.println("Média dos elementos: " + average);
    }
}
