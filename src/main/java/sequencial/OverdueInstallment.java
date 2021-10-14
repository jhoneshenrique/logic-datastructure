package sequencial;

import java.util.Scanner;

//Calculate the value to be paid off of an installment
public class OverdueInstallment {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double installment;
        double value;
        double tax;
        int period;

        System.out.println("Enter the initial value: ");
        value = input.nextDouble();

        System.out.println("Enter the tax");
        tax = input.nextDouble();

        System.out.println("Enter the period overdue in months");
        period = input.nextInt();

        installment = value+ (value*(tax/100)*period);

        System.out.println("The overdue amount is :"+installment);
    }

}
