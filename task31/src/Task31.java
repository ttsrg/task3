import java.util.Arrays;

public class Task31 {
    public static void main(String[] args) {


        int array[] = {5, 0, -1, -1, 99, 348, 14, 555, 555, 0};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min value=" + min);
        System.out.println("max value=" + max);


        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = 99;
            }
        }
        System.out.println("\nchangedArray:");
        System.out.print(Arrays.toString(array));

    }
}


/*1. Создайте массив с 10-ю переменными целочисленного типа. Используя оператор "for", найдите и выведите на экран наименьшее и наибольшее значение в массиве.
            min value =  "значение которое у вас получилось".
            max value =  "значение которое у вас получилось".
    Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
            [23, 0, 34, 99, 43534].*/


