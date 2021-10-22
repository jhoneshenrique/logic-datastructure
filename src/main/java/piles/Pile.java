package piles;

//A Pile is an abstract type which we can interact only with the element on the top.
// LIFO - Last in, First out
//Static Pile
public class Pile {
    //We are going to use an array to create the pile
    private int values[];
    private int top;

    //creates the pile and the top starts with -1
    public Pile(){
        values = new int[10];
        top = -1;
    }

    //Add element to the top of the pile
    public void push(int element){
        top++;
        values[top] = element;
    }

    //Withdraw element from the top
    public int pop(){
        int element = values[top];
        top--;
        return element;
    }

    //Check if the pile is Empty
    public boolean isEmpty(){
        return (top== -1);
    }

    //Check is the pile is full
    public boolean isFull(){
        return (top==9);
    }
}
