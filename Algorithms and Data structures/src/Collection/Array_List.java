package Collection;

import java.util.ArrayList;

public class Array_List {

    public static void main(String args[]){

        ArrayList<String> names = new ArrayList<>();

        names.add("suthan");
        names.add("kumar");
        names.add("ravi");

        System.out.println(names);

        names.remove("suthan");

        System.out.println(names);
    }
}
