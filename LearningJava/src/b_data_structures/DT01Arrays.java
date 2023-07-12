package b_data_structures;

import java.util.Arrays;

public class DT01Arrays {
    public static void main(String[] args) {

        // ARRAYS:
        // - Fixed in size
        // - Fast for data retrivals
        // - Compact memory usage if size is known
        // - Delete operation is very hard

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        
        // print array using Arrays.toString()
        System.out.println(Arrays.toString(colors));
        System.out.println("-------------");

        String[] names = new String[3];
        names[0] = "Luffy";
        names[1] = "Goku";
        names[2] = "Hinata";

        //for loop with arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-------------");
        
        // other form of array declaration
        int[] ages = {1, 2, 3, 4, 5}; //same as int ages = new int[]{1, 2, 3, 4, 5};

        //foreach loop with arrays
        for (int age: ages) {
            System.out.println(age);
        }

        // other way to foreach loop
        Arrays.stream(ages).forEach(System.out::println);

        /* DEFAULT INITIALIZATION VALUES:
        byte, short, double, float, long, int = 0
        char = '\u0000' (empty)
        boolean = false
        String = null
         */
    }
}
