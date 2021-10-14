package conditionals;

import java.util.Scanner;

//Read three values and check if they represent a triangle
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sideA, sideB, sideC;
        System.out.println("Enter the value to side A: ");
        sideA = input.nextInt();

        System.out.println("Enter the value to side B: ");
        sideB = input.nextInt();

        System.out.println("Enter the value to side C: ");
        sideC = input.nextInt();

        if((sideA<sideB+sideC)&&(sideB<sideA+sideC)&&(sideC<sideA+sideB)){
            if(sideA==sideB && sideB==sideC){
                System.out.println("Equilateral Triangle");
            }else{
                if(sideA==sideB || sideA==sideC || sideB==sideC){
                    System.out.println("Isoceles Triangle");
                }else{
                    System.out.println("Scalene Triange");
                }
            }
        }else{
            System.out.println("Not a triangle");
        }
    }

}
