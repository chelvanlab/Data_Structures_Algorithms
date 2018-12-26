package Collection;

import java.util.Stack;

public class stack {

    public static void main(String args[]){

        Stack<String> person = new Stack<>();

        person.push("Suthan");
        person.push("Jack");
        person.push("Kumar");
        person.push("Ravi");

        System.out.println(person);

        person.pop();

        System.out.println(person);

        person.push("siva");

        System.out.println(person);

        person.pop();

        System.out.println(person);

    }
}
