package sequencial;

import java.util.Scanner;

//Enter to values and exchange the values between the variables
public class ExchangeVariablesValues {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int firstVariable = 0;
        int secondVariable =0;
        int helper = 0;

        System.out.println("Enter the first value :");
        firstVariable = input.nextInt();

        System.out.println("Enter the sencond value :");
        secondVariable = input.nextInt();

        helper = firstVariable;
        firstVariable = secondVariable;
        secondVariable = helper;

        System.out.println("The value of the first variable is : "+firstVariable);
        System.out.println("The value of the second variable is : "+secondVariable);

    }
}
