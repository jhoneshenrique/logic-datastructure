package arrays_sorting;

import java.util.Scanner;

public class FatorialMatrixElementSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        int fat = 0;
        int count = 0;
        int x;

        //Enter the values in matrix A
        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for the index "+i);
            matrixA[i] = input.nextInt();
        }

        //Calculate the factorial for each element of A
        for(int i=0; i<=4; i++){
            fat = 1;
            count = 1;

            while(count <= matrixA[i]){
                fat *= count;
                count++;
            }

            matrixB[i] = fat;
        }

        //Sort matrix B
        for(int i = 0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                if(matrixB[i]>matrixB[j]){
                    x = matrixB[i];
                    matrixB[i] = matrixB[j];
                    matrixB[j] = x;
                }
            }
        }

        //Show the matrix
        for(int i=0; i<=4; i++){
            System.out.println("The factorial of "+matrixA[i]+" is :"+matrixB[i]);
        }
    }
}
