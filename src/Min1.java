public class Min1 {


    public static int getMin1 (int a, int b)
    {
        if (a<b){ //можно записать в виде тринарного оператора: 
            //return a < b ? a : b;
            return a;
        } else {
            return b;
        }
    }

    public static int getMin2 (int a, int b, int c)
    {
        b= getMin1(b, c); //лучше между переменными ставить пробелы. Это не ошибка, но так тебе самому будет проще читать код

        if (a < b){ //тут тоже можно было использовать getMin1(a, b)
            return a;
        } else {
            return b;
        }

    }


    public static int getMinimum (int a, int b, int c, int d)
    {

        b= getMin2(b, c, d);  
        if (a<b){ //тут аналогично, getMin1(a, b)
            System.out.println("Minimum = " + a); //обе строки повторяют одно и то же действие. Лучше не повторять код и выносить его в другое место
            return a;
        } else {
            System.out.println("Minimum = " + b); //обе строки повторяют одно и то же действие. Лучше не повторять код и выносить его в другое место
            return b;
        }
        //например
        /**
         * int min = a < b? a : b;
         *  System.out.println("Minimum = " + min);
         *  return min;
         */

    }

}
