import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size");
        int a = in.nextInt();
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



