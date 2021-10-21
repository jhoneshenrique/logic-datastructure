package recursion;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(calculateFibonacci(0,1,1));
    }

    public static int calculateFibonacci(int prev, int next, int count){
        if(prev==0){
            System.out.println(1);
        }
        if(count==10){
            return prev + next;
        }
        else{
            int result = prev + next;
            System.out.println(result);
            return calculateFibonacci(prev=next,next=result,count+1);
        }
    }
}
