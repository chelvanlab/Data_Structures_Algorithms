package Recurision;

public class ArrayMaximum {

    public static  void main(String args[]){

        int maximum = max(new int[]{2,12,3,2},0,12);
        System.out.println(maximum);
    }

    static int max(int[] array,int n,int max){

        if(n==array.length){

            return 0;
        }

        else{

            if(array[n]>max){

                max = array[n];
            }

            max(array,n+1,max);

            return max;
        }

    }
}
