package Math;

public class prime {

    public static void main(String args[]){

        for(int i=1;i<100;i++){

            for(int x=1;x<i;x++){

                if(i%x==0 && x!=1){

                    break;
                }

                if(x==i-1){

                    System.out.println(i);
                }
            }
        }
    }
}
