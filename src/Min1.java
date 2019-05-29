public class Min1 {


    public static int getMin1 (int a, int b)
    {
        if (a<b){
            return a;
        } else {
            return b;
        }
    }

    public static int getMin2 (int a, int b, int c)
    {
        b= getMin1(b,c);

        if (a<b){
            return a;
        } else {
            return b;
        }

    }


    public static int getMinimum (int a, int b, int c, int d)
    {

        b= getMin2(b, c, d);
        if (a<b){
            System.out.println("Minimum = " + a);
            return a;
        } else {
            System.out.println("Minimum = " + b);
            return b;
        }

    }

}
