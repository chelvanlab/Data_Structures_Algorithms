package Sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String args[]) {

        int[] array = {26,54,93,17,77,31,44,55,20};

        //sort
        for(int i=0;i<array.length;i++){

            int pos=i;

            for(int j=i;j<array.length;j++){

                if(array[pos]>array[j]){

                    pos = j;
                }
            }

            //swap
            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;

            System.out.println(Arrays.toString(array));
        }



    }
}
