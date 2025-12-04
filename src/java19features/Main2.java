package java19features;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(3000);
            System.out.println("Task 1 completed!");
            return new Random().nextInt();
        });
        Future<Integer> future2 = executor.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Task 2 completed!");
            return new Random().nextInt();
        });
        System.out.println("Task submitted!");
        while (!future.isDone() && !future2.isDone()){
            Thread.sleep(500);
            System.out.println("Still waiting.....");
        }

        int result  = future.get();
        int result2  = future2.get();

        System.out.println("Result task 1 is : " + result);
        System.out.println("Result task 2 is : " + result2);

        executor.shutdown();
    }
}