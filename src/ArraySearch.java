import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySearch {

    public  static void main (String[] args) {

        boolean bInArray=false;
        Scanner in = new Scanner (System.in);
        System.out.println("Input array size");
        int a = in.nextInt(); //тут можно сделать доп. проверку на то, валидное ли было введено значение
        //например, 0, -1, 'qwer' и т.д
        //пример решения:
//        int range;
//        String stringInput = "";
//        while (true) {
//         
//            try {
//                stringInput = in.next();
//                range = Integer.valueOf(stringInput);
//                break;
//            } catch (NumberFormatException ex) {
//                System.out.println(String.format("Cannot parse to Integer %s value.\nPlease repeat input", stringInput));
//            }
//        }
//      также можно проверить, инт это или нет используя in.hasNextInt()
        int[] array = new int[a];
        System.out.println("Input a number of search in the array");
        int b = in.nextInt();

       // int[] array = new int[a];

        for (int i=0; i<a; i++)
        {
            array[i]=(int)( Math.random()*100); //тут можно использовать класс Random
            //пример
//            Random random = new Random();
//            random.nextInt(5); //тут 5 - граница. Само число 5 не включается, т.е значения будут от 0 до 4
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
