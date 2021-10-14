package arrays;

import java.util.Scanner;

public class MatrixFatorial {
    public static void main(String[] args) {
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        Scanner input = new Scanner(System.in);
        int count = 0;
        int fat = 0;

        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for the index :"+i);
            matrixA[i] = input.nextInt();
        }

        for(int i=0; i<=4; i++){
            fat = 1;
            count= 1;

            while(count<=matrixA[i]){
                fat *= count;
                count++;
            }

            matrixB[i] = fat;
        }

        for(int i=0; i<=4; i++){
            System.out.println("Fatorial of "+matrixA[i]+" is "+matrixB[i]);
        }
    }
}
