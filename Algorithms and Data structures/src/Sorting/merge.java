package Sorting;

import java.util.Arrays;

public class merge {

    public static void main(String args[]){

        merge(new int[]{2,3,2,3,4,3,1});
    }

    static void merge(int[] array){

        int mid = array.length/2;

        if(mid>0){

            int[] left = new int[mid];
            int[] right = new int[array.length-mid];

            //copy values to left array
            for(int i=0;i<mid;i++){

                left[i] = array[i];
            }

            //copy values to right array
            int x=0;
            for(int i=mid;i<array.length;i++){

                right[x] = array[i];
                x++;
            }

            merge(left);
            merge(right);

            //sort arrays
            int i = 0;
            int j = 0;
            int k = 0;

            while (i<left.length && j<right.length){

                if(left[i] < right[j]){

                    array[k] = left[i];
                    i = i+1;
                }

                else{
                    array[k] = right[j];
                    j = j+1;
                }

                k = k+1;
            }


            while(i<left.length){

                array[k] = left[i];
                i = i+1;
                k = k+1;
            }

            while(j<right.length) {

                array[k] = right[j];
                j = j + 1;
                k = k + 1;
            }

        }

        System.out.println("merging "+Arrays.toString(array));
    }


}
