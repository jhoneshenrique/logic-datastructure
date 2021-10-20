package matrix;

import java.util.Scanner;

public class MatrixPresenting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[4][5];

        for(int i=0; i<=3; i++){
            for(int j=0; j<=4; j++){
                System.out.println("Enter the value for matrixA - line "+i+" column "+j+" :");
                matrix[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<=3; i++){
            for(int j=0; j<=4; j++){
                System.out.print(" - "+ matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
