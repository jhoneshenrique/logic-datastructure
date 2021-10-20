package matrix;

import java.util.Scanner;

public class SumElementsMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[][] = new int[5][3];
        int matrixB[][] = new int[5][3];
        int matrixC[][] = new int[5][3];

        for(int i=0; i<=4; i++){
            for(int j=0; j<=2; j++){
                System.out.println("Enter the value for matrixA - line "+i+" column "+j+" :");
                matrixA[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<=4; i++){
            for(int j=0; j<=2; j++){
                System.out.println("Enter the value for matrixB - line "+i+" column "+j+" :");
                matrixB[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<=4; i++){
            for(int j=0; j<=2; j++){
                matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }

        for(int i=0; i<=4; i++){
            for(int j=0; j<=2; j++){
                System.out.println("The value for matrixC - line "+i+" column "+j+" is :"+matrixC[i][j]);
            }
        }
    }
}
