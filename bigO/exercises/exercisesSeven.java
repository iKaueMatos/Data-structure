package bigO.exercises;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Filtragem de números pares:
Escreva uma função que recebe um array de números e retorna um novo array contendo apenas os números pares. */

public class exercisesSeven {
    public static void main(String[] args) { 
        List<Integer> evanNumebers = filteringEvenNumbers();
        System.out.println(evanNumebers);
    }

    public static List<Integer> filteringEvenNumbers() {
        Random random = new Random();
        int arraySize = 25;
        
        List<Integer> listNumbers =  IntStream.generate(() -> random.nextInt(arraySize))
        .limit(arraySize).filter((num) -> num % 2 == 0)
        .boxed()
        .collect(Collectors.toList());

        return listNumbers;
    }
}
