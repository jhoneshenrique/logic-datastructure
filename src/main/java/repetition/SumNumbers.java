package repetition;

public class SumNumbers {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number<=200){
            sum += number;
            number++;
        }
        System.out.println(sum);

    }
}
