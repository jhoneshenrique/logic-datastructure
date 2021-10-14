package arrays;

import java.util.Scanner;
//Create a Matrix B with the elements of Matrix A inverted
public class MatrixReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for Matrix A position :"+i);
            matrixA[i] = input.nextInt();
        }

        int j = 4;
        for(int i=0; i<=4; i++){
           matrixB[j] = matrixA[i];
           j--;
        }

        for(int i=0; i<=4; i++){
            System.out.println(matrixA[i]);
        }

        for(int i=0; i<=4; i++){
            System.out.println(matrixB[i]);
        }
    }
}
