import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public  static void main (String[] args) {

        boolean bInArray=false;
        Scanner in = new Scanner (System.in);
        System.out.println("Input array size");
        int a = in.nextInt();
        System.out.println("Input a number of search in the array");
        int b = in.nextInt();

        int[] array = new int[a];

        for (int i=0; i<a; i++)
        {
            array[i]=(int)( Math.random()*100);
            if (array[i]==b){
                 bInArray=true;
            }else {
                 bInArray=false;
            }
        }

        if (bInArray==true) {
            System.out.println("True");
        }else {
            System.out.println("false");
        }

        System.out.println("Длинна массива = " + array.length);
        System.out.println(Arrays.toString(array));
    }
}
