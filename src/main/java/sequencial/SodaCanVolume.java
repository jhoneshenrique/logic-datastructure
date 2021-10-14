package sequencial;

import java.util.Scanner;

//In this program the computer will calculate the volume of a soda can. It reads the radious and the height of the can and calculate the volume.

public class SodaCanVolume {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double height = 0;
        double volume = 0;
        System.out.println("Enter the radious: ");
        radius = input.nextDouble();
        System.out.println("Enter the height: ");
        height = input.nextDouble();

        volume = 3.14 * (Math.pow(radius,2)) * height;

        System.out.println("The volume of the can is: "+volume);
    }
}
