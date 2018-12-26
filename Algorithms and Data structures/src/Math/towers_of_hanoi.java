package Math;

public class towers_of_hanoi {

    public static void main(String args[]){

        towerHanoi(3,"A","B","C");
    }

    static void towerHanoi(int height, String from, String to, String with){
        if(height>=1){

            towerHanoi(height-1,from,with,to);
            System.out.println("moving disk "+from+" to "+to);
            towerHanoi(height-1,with,to,from);

        }
    }


}
