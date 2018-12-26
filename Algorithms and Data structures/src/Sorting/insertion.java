package Sorting;

import java.util.Arrays;

public class insertion {

    public static void main(String args[]){

        int[] array = {4,3,2,10,12,1,5,6};

        for(int i=1;i<array.length;i++){

            for(int j=i;j>0;j--){

                if(array[j]<array[j-1]){

                    //swap
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(array));

        }


    }
}
