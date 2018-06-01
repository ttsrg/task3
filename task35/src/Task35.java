import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {
        int array[] = {5, 0, -1, 100, 99, 348, 14, -3, 555, 0};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("\nchangedArray:");
        System.out.print(Arrays.toString(array));
    }
}