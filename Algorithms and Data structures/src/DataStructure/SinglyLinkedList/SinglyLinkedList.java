package DataStructure.SinglyLinkedList;

public class SinglyLinkedList {
    public static void main(String args[]){

        LinkedList my_list = new LinkedList();
        my_list.append("elephat");
        my_list.append("tiger");
        my_list.append("lion");

        my_list.display();

        System.out.println(my_list.get(3));

        my_list.delete(1);
        my_list.display();

        System.out.println(my_list.length());

    }
}

class Node{

    String data;
    Node next;

    Node(String data){

        this.data = data;
        next = null;
    }

}


class LinkedList{
    Node head;

    LinkedList(){
        this.head = new Node(null);
    }

    //append
    void append(String data){

        Node new_node = new Node(data);
        Node current = head;

        while(current.next!=null){
            current = current.next;
        }
        current.next = new_node;
    }

    //display
    void display(){

        Node current_node = head;

        while(current_node.next!=null){

            current_node = current_node.next;
            System.out.println(current_node.data);
        }

    }

    //find the length
    int length(){
        Node current = head;
        int tot = 0;
        while(current.next!=null){
            tot = tot+1;
            current = current.next;
        }
        return tot;
    }

    //search the value of the node at index
    String get(int index){

        if(index>=length() || index<0){
            return "Index out of range";
        }
        int current_index = 0;
        Node current_node = head;

        while(true){
            current_node = current_node.next;
            if(current_index==index){
                return current_node.data;
            }
            current_index = current_index+1;
        }

    }

    //delete the element
    void delete(int index){
        if(index>=length() || index<0){
            System.out.println("Index out of range");
            return;
        }

        int current_index = 0;
        Node current_node = head;
        while (true){
            Node last_node = current_node;
            current_node = current_node.next;
            if(current_index==index){
                last_node.next = current_node.next;
                return;
            }

            current_index = current_index+1;
        }
    }

}
