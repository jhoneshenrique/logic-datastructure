package arrays;

import java.util.Scanner;

public class MatrixCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[8];
        int matrixB[] = new int[8];

        for(int i=0; i<=7; i++){
            System.out.println("Enter the value for the element :"+i);
            matrixA[i] = input.nextInt();
        }

        for(int i=0; i<=7; i++){
            matrixB[i] = matrixA[i];
        }

        for(int element : matrixB){
            System.out.println(element);
        }
    }
}
