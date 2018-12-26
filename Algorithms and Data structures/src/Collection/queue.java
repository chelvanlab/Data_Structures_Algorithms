package Collection;

import java.util.PriorityQueue;

public class queue {

    public static void main(String args[]){

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("suthan");
        queue.add("kumar");
        queue.add("ravi");

        System.out.println(queue.element());
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue.element());
    }
}
