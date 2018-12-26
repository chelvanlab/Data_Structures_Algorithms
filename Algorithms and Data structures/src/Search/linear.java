package Search;

public class linear {

    public static void main(String args[]){

        int[] array = {1,3,2,8,10,12};

        int key = 3;

        for(int i=0;i<array.length;i++){

            if(array[i]==key){

                System.out.println("it is in the array");
                break;
            }

            if(i==array.length-1){

                System.out.println("it is not in the array");
            }


        }
    }
}
