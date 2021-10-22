package queue;

public class Queue {
    private int values[];
    private int start;
    private int end;
    private int total;

    public Queue(){
        values = new int[10];
        start = 0;
        end = 0;
        total = 0;//total of element we have in the queue
    }

    public void insert(int element){
        values[end] = element;
        end = (end+1)%10;
//        if(end==10){
//            end =0;
//        }
        total++;
    }

    public int remove(){
        int element = values[start];
        start = (start+1)%10;
        total--;
        return element;
    }

    public boolean isEmpty(){
        return (total==0);
    }

    public boolean isFull(){
        return (total==10);
    }
}
