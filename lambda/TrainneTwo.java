package lambda;

import java.util.function.Consumer;

public class TrainneTwo {
    public static void main(String[] args) {
        Consumer<String> consumerOne = (s) -> System.out.println(s.toUpperCase());
        consumerOne.accept("java8");
    }
}
