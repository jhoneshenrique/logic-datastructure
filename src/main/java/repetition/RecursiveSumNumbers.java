package repetition;

public class RecursiveSumNumbers {
    public static void main(String[] args) {
        System.out.println(sum(0,1));
    }

    public static int sum(int sum, int number){
        if(number==200){
            return sum+number;
        }else{
            return sum(sum+number,number+1);
        }
    }
}
