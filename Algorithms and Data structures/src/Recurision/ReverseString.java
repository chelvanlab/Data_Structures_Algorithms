package Recurision;


public class ReverseString {

    public static void main(String args[]){

        System.out.println(reverse("apple"));

    }

    static String reverse(String str){

        if(str.isEmpty()){
            return str;
        }

        else {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
}
