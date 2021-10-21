package recursion;

import java.util.Scanner;

public class SummatoryRecursive {

    public static void main(String[] args) {
        System.out.println(sumValue(0,1));
    }

    public static int sumValue(int sum, int control){
        Scanner input = new Scanner(System.in);

        if(control>5){
            return sum;
        }else{
            System.out.println("Enter the value to sum up :");
            sum += input.nextInt();
            control++;
            return sumValue(sum,control);
        }
    }
}
