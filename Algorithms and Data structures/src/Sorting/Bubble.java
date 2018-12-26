package Sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String args[]){


        int[] array = {2,4,3,2,5,4};

        //sort
        for(int i=0;i<array.length;i++){

            for(int j=0;j<array.length-i-1;j++){

                if(array[j]>array[j+1]){

                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //print array
        System.out.println(Arrays.toString(array));
    }

}
