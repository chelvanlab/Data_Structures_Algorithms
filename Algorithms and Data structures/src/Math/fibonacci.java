package Math;

public class fibonacci {

    public static void main(String args[]){

        int n1 = 1;
        int n2 = 1;

        for(int i=1;i<10;i++){

            System.out.println(n1);
            System.out.println(n2);

            n1 = n1+n2;
            n2 = n1+n2;


        }
    }
}
