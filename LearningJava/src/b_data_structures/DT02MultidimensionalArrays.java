package b_data_structures;

import java.util.Arrays;

public class DT02MultidimensionalArrays {

    public static void main(String[] args) {
        int[][] days = new int[2][2];
        days[0][0] = 31;
        days[0][1] = 28;
        days[1][0] = 31;
        days[1][1] = 30;

        //using for
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.print(days[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        //using foreach
        for (int[] baseArray: days) {
            for (int day: baseArray) {
                System.out.print(day + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        // other way to print 2d arrays, with Arrays.deepToString()
        System.out.println(Arrays.deepToString(days));
    }
}
