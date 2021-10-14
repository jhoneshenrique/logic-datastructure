package sequencial;

import java.util.Scanner;

//Calculate the volume of a box
public class BoxVolume {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int volume = 0;
        int lenght = 0;
        int width = 0;
        int height = 0;

        System.out.println("Enter the box lenght :");
        lenght = input.nextInt();

        System.out.println("Enter the box width :");
        width = input.nextInt();

        System.out.println("Enter the box height :");
        height = input.nextInt();

        volume = lenght*width*height;

        System.out.println("The volume of the box is :"+volume);

    }

}
