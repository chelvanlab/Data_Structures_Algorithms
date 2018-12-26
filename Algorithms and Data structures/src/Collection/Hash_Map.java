package Collection;

import java.util.HashMap;

public class Hash_Map {

    public static void main(String args[]){

        HashMap<String,String> hm = new HashMap<>();

        hm.put("name","suthan");
        hm.put("age","21");
        hm.put("city","jaffna");
        hm.put("job","teacher");

        System.out.println(hm);

        System.out.println(hm.get("name"));

        System.out.println(hm.values());

        System.out.println(hm.keySet());
    }
}
