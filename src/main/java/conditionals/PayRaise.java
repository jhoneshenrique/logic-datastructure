package conditionals;

import java.util.Scanner;

//Raad the salary from an employee and calculate the pay raise. If the salary is less than 500, the raise will be 15%; if the salary is bigger or equals to 500, but it
//is smaller or equals 100, the raise will be 10% and if it is bigger than 1000, the raise will be 5
public class PayRaise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;

        System.out.println("Enter the value of the salary");
        salary = input.nextDouble();

        if(salary<=500){
            System.out.println(salary*1.15);
        }else{
            if(salary<=1000){
                System.out.println(salary*1.10);
            }else {
                System.out.println(salary*1.05);
            }
        }
    }

}
