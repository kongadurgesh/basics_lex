package entity;

import java.util.Arrays;
import java.util.List;

public class UnmodifiableList {
    public void testList() {
        List<String> configSettings = List.of("S1", "S2");

        try {
            configSettings.add("S3");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot Modify");
        }
    }

    public void testList2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> unmodifiableNames = List.copyOf(names);

        names.set(1, "Shawn");
        System.out.println(names);
        try {
            unmodifiableNames.add("Sarah");
        } catch (UnsupportedOperationException e) {
            System.out.println("cannot modify");
            System.out.println(unmodifiableNames);
        }
    }
}
