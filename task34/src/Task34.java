import java.util.Arrays;
import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {

        System.out.println("Enter the number ,please:");
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();
        //int number = 123456;
        //int number = 1346;
        //int number = 12546;
        int lenghtArray = Integer.toString(number).length();
        System.out.println("lenghtArray =  " + lenghtArray);


        int[] array = new int[lenghtArray];
        for (int i = lenghtArray - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
        }
        System.out.print(Arrays.toString(array));

        String result = "\n\nIt's an increasing sequence";
        int min = array[0];
        for (int i = 0; i < lenghtArray - 1; i++) {
            if (min < array[i + 1]) {
                min = array[i + 1];
            } else {
                result = "\n\nNO.It's NOT an increasing sequence";
            }
        }
        System.out.println(result);
    }
}