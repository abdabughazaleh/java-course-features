package java22features;

import java.util.List;
import java.util.stream.Gatherers;
public class GatherersDemo {
    record Item(String name, String price) {
    }

    public static class DatabaseManager {
        public List<Item> items() {
            return List.of(
                    new Item("iPhone", "$1500"),
                    new Item("Airpods 4", "$130"),
                    new Item("Airpods 4 pro", "$160"),
                    new Item("Nokia 779", "$250"),
                    new Item("Sony 200", "$300"),
                    new Item("Husmnx", "$456"),
                    new Item("Yazmxo", "$600"),
                    new Item("Yazmxo pro", "$689")
            );
        }

        public void insert(Item item) {
            try {
                Thread.sleep(500);
                System.out.println("insert into users " + item);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    static void main() {
        DatabaseManager db = new DatabaseManager();
        db.items().stream()
                .gather(Gatherers.windowFixed(4))
                .forEach(batch->{
                    System.out.println(batch);
                });
    }
}
