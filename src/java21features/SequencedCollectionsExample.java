package java21features;

import java.util.*;

public class SequencedCollectionsExample {
    public static void main(String[] args) {
        SequencedCollection<String> seq = new ArrayList<>(List.of("E","A", "B", "C","F"));
        SequencedMap<String,String> myMap = new LinkedHashMap<>();

        System.out.println("Get First : " + seq.getFirst());
        System.out.println("Get Last : " + seq.getLast());
        System.out.println("Reversed : " + seq.reversed());

        System.out.println("----------  After Remove -----------");

        seq.removeFirst();
        seq.removeLast();
        System.out.println("Get First : " + seq.getFirst());
        System.out.println("Get Last : " + seq.getLast());
        System.out.println("Reversed : " + seq.reversed());

        System.out.println("----------  After Add -----------");

        seq.addFirst("R");
        seq.addLast("V");
        System.out.println("Get First : " + seq.getFirst());
        System.out.println("Get Last : " + seq.getLast());
        System.out.println("Reversed : " + seq.reversed());

    }
}
