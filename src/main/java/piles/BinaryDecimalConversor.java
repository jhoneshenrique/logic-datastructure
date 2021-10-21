package piles;

//This program uses the pile as data structure
public class BinaryDecimalConversor {
    public static void main(String[] args) {
        int value = 50;
        Pile pile = new Pile();
        int rest = 0;

        while(value!=0){
            rest = value%2;
            pile.push(rest);
            value = value/2;
        }

        while(!pile.isEmpty()){
            rest = pile.pop();
            System.out.println(rest);
        }
    }
}
