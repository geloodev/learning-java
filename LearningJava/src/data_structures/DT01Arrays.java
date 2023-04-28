package data_structures;

public class DT01Arrays {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Luffy";
        names[1] = "Goku";
        names[2] = "Hinata";
        //for loop with arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-------------");
        
        int[] ages = {1, 2, 3, 4, 5}; //same as int ages = new int[]{1, 2, 3, 4, 5};
        //foreach loop with arrays
        for (int age: ages) {
            System.out.println(age);
        }

        /* DEFAULT INITIALIZATION VALUES:
        byte, short, double, float, long, int = 0
        char = '\u0000' (empty)
        boolean = false
        String = null
         */
    }
}
