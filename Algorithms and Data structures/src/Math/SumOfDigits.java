package Math;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        int tot = 0;

        while(num>0){

           tot = tot+num%10;
           num = num/10;
        }

        System.out.println(tot);
    }
}
