package conditionals;

import java.util.Scanner;

//Read a number from 1 to 12 and show its respective month

public class ShowTheMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter the value of the number");
        number = input.nextInt();

        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Algust");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a month");
        }
    }
}
