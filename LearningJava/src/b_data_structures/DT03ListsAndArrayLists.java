package b_data_structures;

import java.util.ArrayList;
import java.util.List;

public class DT03ListsAndArrayLists {
    public static void main(String[] args) {
        // LISTS:
        // - An ordered collection aka sequence
        // - Allow duplicates
        // - Not fixed in size like arrays
        // - Fast for data retrivals
        // - Various implementations
        //      - ArrayList
        //      - Stack
        //      - Vector
        //      - Others...

        List<String> colors = new ArrayList<>(); // ArrayList is a implementation of List

        // Immutable List
        List<String> colorsImmutable = List.of(
            "blue",
            "yellow",
            "red"
        );

        colors.add("blue");
        colors.add("purple");
        colors.add("red");
        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("blues"));
        System.out.println(colors.size());

        System.out.println("--------------------");

        // for loop on lists
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("--------------------");

        // foreach loop on lists
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("--------------------");

        // other way to print lists
        colors.forEach(System.out::println);
    }
}
