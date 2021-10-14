package sequencial;

//Read two numbers and show the result of the four operations

import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        System.out.println("Enter the first number :");
        firstNumber = input.nextInt();

        System.out.println("Enter the second number :");
        secondNumber = input.nextInt();

        System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
        System.out.println(firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
        System.out.println(firstNumber+" x "+secondNumber+" = "+(firstNumber*secondNumber));
        System.out.println(firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber));
    }
}
