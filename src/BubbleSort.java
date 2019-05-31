import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public  static void bubbleSort () {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size"); // Тут тоже будет хорошо проверять на инпут, как ты делал в других заданиях
        int a = in.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 100); //и тут поменять на new Random()...
        }
        System.out.println(Arrays.toString(array));

        for (int k = 0; k < a; k++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }


        }
        System.out.println(Arrays.toString(array));
    }

}

