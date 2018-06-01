
import java.util.Arrays;

public class Task32 {

    public static void main(String[] args) {

        int array[] = {5, 0, -1, 5, 99, -1, 14, 5, 5, 0};
        int repeat = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int same = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = same;
                }
            }
        }
        System.out.print(Arrays.toString(array));

        int[][] repeatArray = new int[array.length][2];
        int[] rep = new int[array.length];
        int busy = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                //if (busy == j)                 // {
                //     j++;
                // }
                if (array[i] == array[j]) {
                    count++;
                    repeat = array[i];
                    rep[j] = count;

                } else i++;


            }
            repeatArray[busy][0] = repeat;
            repeatArray[busy][1] = count;
            busy++;
            //System.out.print(i + "" + count + "\n");

        }
        System.out.println();
        // System.out.print(Arrays.toString(array));
        for (int i = 0; i < repeatArray[busy].length; i++) {
            for (int j = 0; j < repeatArray[busy].length; j++) {
                System.out.print(repeatArray[i][j] + "\t");
            }
            System.out.println();
        }
    }


}



