package DataStructure.Stack;

public class main {

    public static void main(String args[]){

        stack s = new stack(5);

        s.push(5);
        s.push(4);
        s.push(8);
        s.push(4);
        s.push(8);

        s.pop();
        s.pop();
        s.pop();

        s.push(78);
        s.display();


    }
}

class stack{
    int[] array;
    int pos=0;

    stack(int size){
        array = new int[size+1];
    }

    //push data
    void push(int value){
        if(pos<array.length-1){

            for(int i=pos;i>=0;i--){
                array[i+1] = array[i];
            }

            array[0] = value;
            pos = pos+1;
        }
        else{
            System.out.println("stack overflow "+value);
        }

    }

    //pop data
    void pop(){
        if(pos>0) {
            for (int i = 1; i < pos + 1; i++) {

                array[i - 1] = array[i];
            }
            array[pos] = 0;
            pos--;
        }
        else{
            System.out.println("stack is empty");
        }
    }

    //display data
    void display(){
        for(int i=0;i<pos;i++){
            System.out.println(array[i]);
        }
    }

    //find data
    void find(int value){

        for(int i=0;i<pos;i++){

            if(array[i]==value){
                System.out.println("it is in the array");
                return;
            }
        }

        System.out.println("it is not in the array");
    }

    //get value
    void get(int j){

        if(j<pos){

            System.out.println(array[j]);
        }

        else{
            System.out.println("out of range");
        }
    }
}
