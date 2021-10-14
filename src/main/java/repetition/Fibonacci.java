package repetition;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        int result = 0;
        int count = 1;

        System.out.println(next);

        while(count <=10){
            result = prev + next;
            System.out.println(result);
            prev = next;
            next = result;
            count++;
        }
    }
}
