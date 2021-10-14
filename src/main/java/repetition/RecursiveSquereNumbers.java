package repetition;

public class RecursiveSquereNumbers {
    public static void main(String[] args) {
        System.out.println(squareNumbers(15,200));
    }

    public static int squareNumbers(int number, int limit){
        if(number==limit){
           return number*number;
        }else{
            System.out.println(number * number);
            return squareNumbers(number+1,limit);
        }
    }
}
