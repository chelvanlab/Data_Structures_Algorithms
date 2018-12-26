package Recurision;

public class ArrayTotal {

    public static void main(String args[]){

        int tot = arrayTotal(new int[]{12, 2, 3},0);
        System.out.println(tot);
    }

    static int arrayTotal(int [] array,int n){

        if(n==array.length){

            return 0;
        }

        else{

            return array[n]+arrayTotal(array,n+1);
        }
    }
}
