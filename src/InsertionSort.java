import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size");
        //аналогичная проверка на валидность инпута (как в ArraySearch)
        //int a = in.nextInt();
        int a;
        do {
            System.out.println("Please enter a positive number between 1 and 256");
            while (!in.hasNextInt()){
                System.out.println(String.format("Cannot parse to Integer value.\nPlease repeat input"));
                in.next();
            }
            a=in.nextInt();
        }while (a <= 0 || a > 256);
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1] > value)) {
                array[j] = array[j - 1];
                j = j - 1;
                array[j] = value;
            }


        }
        System.out.println(Arrays.toString(array));
    }
}



