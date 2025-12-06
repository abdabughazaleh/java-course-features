package java21features;

import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaVirtualThreadsExample_4 {
    public static void main(String[] args) throws Exception{
        int thread_counter = 1_000_000;
        AtomicInteger counter = new AtomicInteger();

        try (StructuredTaskScope scope = new StructuredTaskScope.ShutdownOnFailure()) {
            for (int i = 0; i < thread_counter; i++) {
                scope.fork(()->{
                    counter.addAndGet(1);
                    return null;
                });
                scope.join();
            }
        }

        System.out.println("All virtual threads are completed! counter :" + counter);
    }
}
