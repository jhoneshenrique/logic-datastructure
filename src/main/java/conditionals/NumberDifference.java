package conditionals;

import java.util.Scanner;

//Read two numbers and present the difference from the larger to the smaller
public class NumberDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Enter the first number");
        firstNumber = input.nextInt();

        System.out.println("Enter the second Number");
        secondNumber = input.nextInt();

        if(firstNumber==secondNumber) {
            System.out.println("There is no difference");
        }else if(firstNumber>secondNumber){
            System.out.println(firstNumber-secondNumber);
        }else{
            System.out.println(secondNumber-firstNumber);
        }

    }
}
