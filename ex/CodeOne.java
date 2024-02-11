package ex;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Crie uma função que recebe uma lista de números e retorna uma nova lista contendo apenas os números ímpares.
public class CodeOne {

    public String evenNumber(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return "A lista de números está vazia. Por favor, tente novamente.";
        }

        Predicate<Integer> isEven = number -> number.intValue() % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(isEven.negate()).collect(Collectors.toList());

        if (!evenNumbers.isEmpty() && !oddNumbers.isEmpty()) {
            String evenNumbersStr = String.join(", ", evenNumbers.stream().map(Object::toString).collect(Collectors.toList()));
            String oddNumbersStr = String.join(", ", oddNumbers.stream().map(Object::toString).collect(Collectors.toList()));

            return String.format("Números pares: [%s]\n Números ímpares: [%s]", evenNumbersStr, oddNumbersStr);
        } else if (!evenNumbers.isEmpty()) {
            return "Todos os números são pares: " + evenNumbers.toString();
        } else {
            return "Todos os números são ímpares: " + oddNumbers.toString();
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(212, 32, 435, 20, 212, 5435);
        String codeOne = new CodeOne().evenNumber(list);
        System.out.println(codeOne);
    }
}