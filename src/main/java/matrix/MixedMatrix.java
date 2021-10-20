package matrix;

import java.util.Scanner;

public class MixedMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[][] = new int[5][3];

        int fat = 0;
        int count = 0;

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for matrix A index "+i+" :");
            matrixA[i] = input.nextInt();
        }

        //First column of matrix B containing the elements of A multiplied by 5
        for(int i=0; i<=4; i++){
            matrixB[i][0] = matrixA[i] * 5;
        }

        //Second column of matrix B containing the fatorial of each element of matrix A
        for(int i=0; i<=4; i++){
            fat = 1;
            count = 1;

            while(count <= matrixA[i]){
                fat *= count;
                count++;
            }

            matrixB[i][1] = fat;
        }

        //Third column of matrix B containing the square of the elements of A
        for(int i=0; i<=4; i++){
            matrixB[i][2] = matrixA[i] * matrixA[i];
        }

        //Presenting matrix B
        for(int i=0; i<=4; i++){
            for(int j=0; j<=2; j++){
                System.out.print(" - "+ matrixB[i][j]);
            }
            System.out.println(" ");
        }
    }
}
