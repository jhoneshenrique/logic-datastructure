package sequencial;

import java.util.Scanner;

//Read an Integer and show its square

public class SquareOfANumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter the number :");
        number = input.nextInt();

        System.out.println("Its squere is :"+(number*number));
    }
}
