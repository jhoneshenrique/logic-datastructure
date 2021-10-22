package queue;

public class Bank {
    public static void main(String[] args) {

        //Insert in the line
        Queue queue = new Queue();
        queue.insert(176);
        queue.insert(714);
        queue.insert(14);
        queue.insert(200);

        int i=1;
        while(!queue.isEmpty()){
            System.out.print("The "+i+" element to leave was :");
            System.out.println(queue.remove());
            i++;
        }
    }
}
