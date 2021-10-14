package repetition;

public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        while (count<=500){
            if(count%2==0){
                sum += count;
            }
            count++;
        }

        System.out.println(sum);
    }
}
