package java21features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaVirtualThreadsExample_2 {

    public static void main(String[] args) {
        int thread_counter = 1_000_000;
        AtomicInteger counter = new AtomicInteger();

        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            CompletableFuture<?>[] futures = new CompletableFuture[thread_counter];

            for (int i = 0; i < thread_counter; i++) {
                futures[i] = CompletableFuture.runAsync(()->{
                    counter.getAndAdd(1);
                } , executor);
            }

            CompletableFuture.allOf(futures).join();

            System.out.println("All virtual threads are completed! counter :" + counter);

        }
    }
}
