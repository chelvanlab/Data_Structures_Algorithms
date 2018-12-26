package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

    public static void main(String args[]){

        TreeMap<Integer,String> map=new TreeMap<Integer,String>();

        map.put(1,"suthan");
        map.put(3,"ravi");
        map.put(4,"kumar");
        map.put(9,"siva");
        map.put(5,"mala");
        map.put(2,"sankar");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
