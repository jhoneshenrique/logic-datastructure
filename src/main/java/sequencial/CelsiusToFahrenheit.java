package sequencial;

import java.util.Scanner;

//In this program the person provide a temperature in Celcius and the software converts it to Fahrenheit

public class CelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int celcius = 0;
        int fahrenheit = 0;

        System.out.println("Enter the temperature in Celcius: ");
        celcius = input.nextInt();
        fahrenheit = (9*celcius + 160)/5;
        System.out.println("The temperature is: "+fahrenheit);
    }
}
