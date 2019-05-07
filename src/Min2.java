public class Min2 {

   int lowestNumb ()
    {

        Min1 min = new Min1();
        int a = (int)( Math.random()*10);
        int b=min.lowestNumb();

        if (a<b){
            System.out.println("Minimum in the second iteration " + a);
            return a;
        } else {
            System.out.println("Minimum in the second iteration " + b);
            return b;
        }

    }

}
