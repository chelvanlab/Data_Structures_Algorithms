package Math;

import java.util.Scanner;

public class StrongCheck {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int temp = num;

        int tot = 0;

        while(num>0){

            int digit = num%10;
            tot = tot+fact(digit);
            num = num/10;

        }

        if(tot==temp){

            System.out.println("Strong number");
        }
        else{

            System.out.println("Not strong number");
        }


    }

    static int fact(int n){

        if(n==1){

            return 1;
        }
        else{

            return n*fact(n-1);
        }
    }
}
