package recursion;

public class RecursiveEvenNumberSum {
    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(1,500,0));
    }

    public static int sumEvenNumbers(int count, int limit, int sum){
        if(count>limit){
            return sum;
        }else{
            if(count%2==0){
                return sumEvenNumbers(count+1,limit,sum+=count);
            }else{
                return sumEvenNumbers(count+1,limit,sum);
            }
        }
    }
}
