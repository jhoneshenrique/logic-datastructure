package sequencial;

import java.util.Scanner;

public class ConvertRealToDollar {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double real = 0;
        double dollar = 0;
        double cotation = 0;

        System.out.println("Enter the amount of reais  :");
        real = input.nextDouble();

        System.out.println("Enter the dollar cotation :");
        cotation = input.nextDouble();

        dollar = real / cotation;

        System.out.println("The amount in dollar is :"+dollar);
    }
}
