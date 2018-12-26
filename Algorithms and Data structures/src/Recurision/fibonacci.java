package Recurision;

public class fibonacci {

    public static void main(String args[]){

        int fibonacci = fib(6);
        System.out.println(fibonacci);
    }

    static int fib(int n){

        if(n<=1){

            return n;
        }

        else{

            return fib(n-1)+fib(n-2);
        }

    }
}
