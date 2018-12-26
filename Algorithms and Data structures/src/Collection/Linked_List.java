package Collection;

import java.util.LinkedList;

public class Linked_List {


    public static void main(String agrs[]){

        LinkedList<String> animal = new LinkedList<String>();

        animal.add("Elephant");
        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Wolf");

        System.out.println(animal);

        animal.remove("Wolf");

        System.out.println(animal);

    }
}
