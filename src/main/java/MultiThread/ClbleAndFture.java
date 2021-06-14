package MultiThread;

import java.util.Random;
import java.util.concurrent.*;

public class ClbleAndFture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt();

            if (randomValue < 5)
                throw new Exception("Something happened =(");

            return random.nextInt(10);
        });

        executorService.shutdown();

        try {
            int result = (int) future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
