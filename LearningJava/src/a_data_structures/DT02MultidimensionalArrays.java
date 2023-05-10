package a_data_structures;

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
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------");

        //using foreach
        for (int[] baseArray: days) {
            for (int day: baseArray) {
                System.out.println(day);
            }
        }
    }
}
