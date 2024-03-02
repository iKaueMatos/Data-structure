package ex;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Escreva uma função que recebe uma lista de strings e retorna outra lista contendo apenas as strings que começam com a letra "A".
public class CodeTwo {
    public List<String> stringsStartingWithA(List<String> listLetter) {
        Predicate<String> startLetter = letter -> letter.startsWith("A");
        List<String> filteredListLetter = listLetter.stream().filter(startLetter).collect(Collectors.toList());

        return filteredListLetter;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Nova Software", "Banco de dados", "Apple vision pro", "Tesla");
        List<String> codeTwo = new CodeTwo().stringsStartingWithA(list);
        codeTwo.forEach(System.out::println);
    }
}
