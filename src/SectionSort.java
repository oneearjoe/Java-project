import java.util.Arrays;
import java.util.Scanner;

public class SectionSort {
    public static void sectionSort() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size"); //проверка на инпут
        int a = in.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 100); //рандом
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(array));
    }
}
