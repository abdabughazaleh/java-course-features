package java21features;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class JavaVirtualThreadsExample_3 {
    public static void main(String[] args) {
        int thread_counter = 1_000_000;
        AtomicInteger counter = new AtomicInteger();

        IntStream.range(0, thread_counter).forEach(i -> Thread.startVirtualThread(() -> {
            counter.addAndGet(1);
        }));

        System.out.println("All virtual threads are completed! counter :" + counter);
    }
}
