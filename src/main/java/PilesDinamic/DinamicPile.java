package PilesDinamic;

public class DinamicPile {
    private Node top;

    public DinamicPile(){
        top = null; //Top points to nowhere
    }

    public void push(int element){
        Node node = new Node();
        node.setElement(element);
        node.setNext(top);
        top = node;
    }

    public int pop(){
        int element = top.getElement();
        top = top.getNext();
        return  element;
    }

    public boolean isEmpty(){
        return (top==null);
    }

}
