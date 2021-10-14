package arrays;

import java.util.Scanner;
//Read Matrix A and B and create a Matrix C contacting the elements of both

public class MatrixConcat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        int matrixC[] = new int[10];

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for Matrix A position :"+i);
            matrixA[i] = input.nextInt();
            matrixC[i] = matrixA[i];
        }

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for Matrix B position :"+i);
            matrixB[i] = input.nextInt();
            matrixC[i+5] = matrixB[i];
        }

        for(int i=0; i<=9; i++){
            System.out.println(matrixC[i]);
        }

    }
}
