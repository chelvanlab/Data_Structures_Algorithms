package DataStructure.Queue;

public class main {

    public static void main(String args[]){

        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(4);
   

        q.dequeue();
        

        q.enqueue(78);
        q.display();

    }
}

class Queue{
    int[] array;
    int pos = 0;

    Queue(int size){

        array = new int[size+1];
    }

    //enqueue
    void enqueue(int value){
        if(pos<array.length-1){

            for(int i=pos;i>=0;i--){
                array[i+1] = array[i];
            }

            array[0] = value;
            pos = pos+1;
        }
        else{
            System.out.println("queue overflow "+value);
        }

    }

    //dequeue
    void dequeue(){

        pos = pos-1;
    }

    void display(){

        for(int i=0;i<pos;i++){
            System.out.println(array[i]);
        }
    }
}
