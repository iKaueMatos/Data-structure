package lambda;

/**
 * trainneOne
 */
public class TrainneOne {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda

        // () -> {}
        Runnable runnableLambda = () -> {
            System.out.println("Insidde Runnable 2");
        };

        new Thread(runnableLambda).start();

        // optional treen
        Runnable runnableLambda3 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda3).start();

        // optional four
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}