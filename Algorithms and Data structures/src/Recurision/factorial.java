package Recurision;

public class factorial {

    public static void main(String aegss[]){

        int factorial = fact(5);
        System.out.println(factorial);

    }

    static int fact(int n){

        if (n==1){

            return 1;
        }
        else{

            return n*fact(n-1);
        }
    }
}
