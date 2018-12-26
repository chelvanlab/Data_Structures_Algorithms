package Recurision;

public class multiplication {

    public static void main(String args[]){

        int ans = multi(5,7);
        System.out.println(ans);
    }

    static int multi(int n,int m){

        if(n==0){

            return 0;
        }
        else{

            return m+multi(n-1,m);
        }
    }
}
