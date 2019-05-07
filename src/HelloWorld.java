public class HelloWorld {
    public static void main (String[] args) {

        int a= (int)( Math.random()*10);
        int b= (int)( Math.random()*10);

        /*Scanner in = new Scanner(System.in);
        System.out.println("Input the first number");
        a =in.nextInt();
        System.out.println("Input the second number");
        b =in.nextInt();*/
        System.out.println("a = " + a + "\nb = " + b);


        if (a==b){
            System.out.println("Numbers are equal");
        }


        if (a<b){
            System.out.println("The lowest number is " + a);

        } else {
            System.out.println("The lowest number is " + b);

        }

    }

}
