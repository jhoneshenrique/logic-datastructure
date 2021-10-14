package arrays;

import java.util.Scanner;

public class MatrixNegativeElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for matrix A "+i);
            matrixA[i] = input.nextInt();
        }

        for(int i=0; i<=4; i++){
            matrixB[i] = matrixA[i]*(-1);
        }

        for(int i=0; i<=4; i++){
            System.out.println(matrixA[i]);
        }

        for(int i=0; i<=4; i++){
            System.out.println(matrixB[i]);
        }
    }
}
