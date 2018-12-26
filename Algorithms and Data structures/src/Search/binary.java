package Search;

import java.util.Arrays;

public class binary {

    public static void main(String args[]){

        int[] array = {2,3,5,7,8,9,10};
        binary(array,10);

    }

    static void binary(int[] array,int key){

        int mid = array.length/2;

        if(mid>0){

            if(array[mid]>key){

                int[] temp = new int[mid];

                for(int i=0;i<mid;i++){

                    temp[i] = array[i];
                }

                System.out.println(Arrays.toString(temp));
                binary(temp,key);
            }

            else{

                int[] temp = new int[array.length-mid];
                int x = 0;

                for(int i=mid;i<array.length;i++){

                    temp[x] = array[i];
                    x++;
                }

                System.out.println(Arrays.toString(temp));
                binary(temp,key);
            }
        }
        else{

            if(array[0]==key){
                System.out.println("it is in the array");
            }
            else{
                System.out.println("it is not in the array");
            }
        }
    }
}