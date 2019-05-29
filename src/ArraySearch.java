import com.sun.xml.internal.ws.util.StringUtils;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySearch {

    public  static void arraySearch () {

        boolean bInArray=false;
        Scanner in = new Scanner (System.in);
        int arrayLength;
    do {
        System.out.println("Please enter a positive number between 1 and 256");
        while (!in.hasNextInt()){
            System.out.println(String.format("Cannot parse to Integer value.\nPlease repeat input"));
            in.next();
        }
        arrayLength=in.nextInt();
    }while (arrayLength <= 0 || arrayLength > 256);


        int position;

        do {
            System.out.println("Input a number of search in the array");
            while (!in.hasNextInt()){
                System.out.println(String.format("Cannot parse to Integer value.\nPlease repeat input"));
                in.next();
            }
            position=in.nextInt();
        }while (position <= 0 || position > 256);


        while (position <= 0 || position > 256) {
            position = in.nextInt();
        }

        int[] array = new int[arrayLength];

        Random random = new Random();

        for (int i=0; i<arrayLength; i++)
        {
            //array[i]=(int)( Math.random()*100); //тут можно использовать класс Random
            //пример
//            Random random = new Random();
//            random.nextInt(5); //тут 5 - граница. Само число 5 не включается, т.е значения будут от 0 до 4
            array[i] = random.nextInt(100);
            if (array[i]==position){
                 bInArray=true;
            }else {
                 bInArray=false;
            }
        }

        if (bInArray==true) {
            System.out.println("Element exist in array");
        }else {
            System.out.println("Element does not exist in array");
        }

        System.out.println("Длинна массива = " + array.length);
        System.out.println(Arrays.toString(array));


    }
}
