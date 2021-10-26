package lists;

import com.sun.security.jgss.GSSUtil;

public class List {
    private Node start;

    //Creates the list which points to nowhere
    public List(){
        this.start = null;
    }

    public void insert(int element){
        //Create a new element
        Node newNode = new Node();
        newNode.setElement(element);
        newNode.setNext(null);

        //Case the list is empty, starts it with the new node
        if(start==null){
            start = newNode;
        }else{
            //Creates an auxiliary variable, so we don't lose the reference of the beginning
            Node aux;
            aux = start;
            //This is in order to get to the end of the list
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            //insert the new node in the end
            aux.setNext(newNode);
        }
    }

    //In this implementation is removes only from the beginning.
    public int remove(){
        Node aux = start;
        //Get the element which will be excluded to return to the user
        int element = aux.getElement();
        //The start points to next node.
        start = aux.getNext();
        return element;
    }

    public void list(){
        if(start==null){
            System.out.println("Empty List");
        }else{
            Node aux = start;
            while(aux!=null){
                System.out.println("Element :"+aux.getElement());
                aux = aux.getNext();
            }
        }
    }

    public boolean isEmpty(){
        return this.start == null;
    }
}
