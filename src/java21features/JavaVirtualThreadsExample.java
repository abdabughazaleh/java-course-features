package java21features;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaVirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        int thread_counter = 1_000_000;
        AtomicInteger counter = new AtomicInteger();
        Thread[] threads = new Thread[thread_counter];
        for (int i = 0; i < thread_counter; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                counter.addAndGet(1);
            });
        }

        for (Thread t :threads){
            t.join();
        }

        System.out.println("All virtual threads are completed! counter :" + counter);
    }
}
