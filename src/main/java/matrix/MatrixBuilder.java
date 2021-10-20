package matrix;

import java.util.Scanner;

public class MatrixBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[7];
        int matrixB[] = new int[7];
        int matrixC[][] = new int[7][2];

        for(int i=0; i<=6; i++){
            System.out.println("Enter the value for matrix A index "+i+" :");
            matrixA[i] = input.nextInt();
        }

        for(int i=0; i<=6; i++){
            System.out.println("Enter the value for matrix B index "+i+" :");
            matrixB[i] = input.nextInt();
        }

        for(int i=0; i<=6; i++){
            matrixC[i][0] = matrixA[i];
        }

        for(int i=0; i<=6; i++){
            matrixC[i][1] = matrixB[i];
        }

        for(int i=0; i<=6; i++){
            for(int j=0; j<=1; j++){
                System.out.println("The value for matrixC - line "+i+" column "+j+" is :"+matrixC[i][j]);
            }
        }
    }
}
