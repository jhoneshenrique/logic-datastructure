package arrays_binary_sequencial_search;

import java.util.Scanner;

public class BinarySeachMatrixB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixA[] = new int[5];
        int matrixB[] = new int[5];
        int x;
        int search = 0;
        int start = 0;
        int end = 4;
        int middle = 0;
        boolean found = false;

        //Read the elemnts matrix A
        for(int i=0; i<=4; i++){
            System.out.println("Enter the value for the index "+i+" :");
            matrixA[i] = input.nextInt();
        }

        //Populate the second matrix with the elements of A multiplied by 5
        for(int i=0; i<=4; i++){
            matrixB[i] = matrixA[i] * 5;
        }

        //Sort matrix B
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                if(matrixB[i]>matrixB[j]){
                    x = matrixB[i];
                    matrixB[i] = matrixB[j];
                    matrixB[j] = x;
                }
            }
        }

        System.out.println("Enter the value to be searched :");
        search = input.nextInt();

        while(start<=end && found==false){
            middle = (start+end)/2;
            if(search==middle){
                found=true;
            }else{
                if(search>middle){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }
        }

        if(found==true){
            System.out.println("Element "+search+" found on index "+middle);
        }else{
            System.out.println("Element not found");
        }
    }
}
