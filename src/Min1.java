public class Min1 {


    int lowestNumb ()
    {
        int a= (int)( Math.random()*10);
        int b= (int)( Math.random()*10);
        if (a<b){
            System.out.println("Minimum in the first iteration is " + a);
            return a;
        } else {
            System.out.println("Minimum in the first iteration is " + b);
            return b;
        }

    }

}
