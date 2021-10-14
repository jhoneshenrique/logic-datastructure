package conditionals;

import java.util.Scanner;

//Read two numbers, sum them up and show only if them sum is bigger than 10
public class NumberValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Enter the first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter the second number: ");
        secondNumber = input.nextInt();
        result = firstNumber+secondNumber;

        if(result>10)
            System.out.println(result);

    }
}
