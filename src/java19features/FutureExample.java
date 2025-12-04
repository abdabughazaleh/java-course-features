package java19features;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a long-running task
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(3000); // simulate long task
            return 42;
        });

        System.out.println("Task submitted... doing other work...");

        // Check if finished
        while(!future.isDone()) {
            System.out.println("Still working...");
            Thread.sleep(500);
        }

        // Get the result
        Integer result = future.get();
        System.out.println("Result = " + result);

        executor.shutdown();
    }
}
