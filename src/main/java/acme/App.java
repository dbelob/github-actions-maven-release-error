package acme;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Use List::of (since Java 9)
        List<String> strings1 = List.of("one", "two", "three");
        System.out.printf("strings1: %s%n", strings1);

        // Use List::copyOf (since Java 10)
        List<String> strings2 = List.copyOf(Arrays.asList("one", "two", "three", "four"));
        System.out.printf("strings2: %s%n", strings2);

        System.out.println("Hello World!");
    }
}
