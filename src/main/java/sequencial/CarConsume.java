package sequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

/*This program will calculate the gas consume of a vehicle during a trip. The user will  provide the trip duration (in hours), the average speed and
the car average consume. It will show the gas consume and the distance ran during the trip
**/
public class CarConsume {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double timeSpent = 0;
        double averageSpeed = 0;
        double distance = 0;
        double litersSpent = 0;
        int carConsumePerLiter;

        System.out.println("Enter the trip duration in hours: ");
        timeSpent = input.nextDouble();
        System.out.println("Enter the average speed of the vehicle: ");
        averageSpeed = input.nextDouble();
        System.out.println("Enter the car consume per liter: ");
        carConsumePerLiter = input.nextInt();

        distance = timeSpent * averageSpeed;
        litersSpent = distance/carConsumePerLiter;

        System.out.println("The car ran "+distance+" km and it spent "+litersSpent+" liters of gas");
    }
}
