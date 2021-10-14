package sequencial;

import java.util.Scanner;

//In this program the person provide a temperature in Fahrenheit and the software converts it to Celcius

public class FahrenheitToCelcius {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double fahrenhet = 0;
        double celcius = 0;

        System.out.println("Enter the temperature in Fahrenheit");
        fahrenhet = input.nextDouble();

        celcius = (fahrenhet-32)*(0.555555556);
        System.out.println("The temperature in Celcius is: "+celcius);
    }

}
