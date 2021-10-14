package arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MatrixSquare {
    public static void main(String[] args) {
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for the index :"+i);
            matrixA[i] = input.nextInt();
        }

        for(int i=0; i<=4; i++){
            matrixB[i] = matrixA[i] * matrixA[i];
        }

        for (Integer element: matrixB) {
            System.out.println(element);
        }

    }
}
