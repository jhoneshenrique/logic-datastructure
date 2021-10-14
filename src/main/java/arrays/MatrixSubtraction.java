package arrays;

import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        int matrixC[] = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the value for the Matrix A position " + i + " :");
            matrixA[i] = input.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the value for the Matrix B position " + i + " :");
            matrixB[i] = input.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            matrixC[i] = matrixA[i] - matrixB[i];
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Matrix C position "+i+" value :"+matrixC[i]);
        }
    }
}
