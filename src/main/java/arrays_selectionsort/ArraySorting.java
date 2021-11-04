package arrays_selectionsort;

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int numbers[] = new int[12];
        Scanner input = new Scanner(System.in);
        int x = 0;

        for(int i=0; i<=11; i++){
            System.out.println("Enter the value for the position "+i);
            numbers[i] = input.nextInt();
        }

        for(int i=0; i<=10; i++){
            //The minor will be the first position of the array
            int minElementIndex = i;
            //We are going to find which element is the minor
            for(int j=i+1; j<=11;j++){
                if(numbers[minElementIndex]>numbers[j]){
                    minElementIndex = j;
                }
            }
            //If the position o the minor found in the loop is different from the one set in the beginning, they are changed
            if(minElementIndex != i){
                x = numbers[minElementIndex];
                numbers[minElementIndex] = numbers[i];
                numbers[i] = x;
            }
        }

        for(int i=0; i<=11; i++){
            System.out.println(numbers[i]);
        }
    }
}
