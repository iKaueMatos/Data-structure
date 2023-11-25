package bigO;

public class Recursivition {
    
    public static void main(String[] args) {
        iterativeFactorial(6);
    }

    public static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }

    public static int iterativeFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        // 1! = 0!
        // 2! = 2 * 1
        // 3! = 3 * 2 * 1
        int factorial = 1;
        for (int i = 0; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
