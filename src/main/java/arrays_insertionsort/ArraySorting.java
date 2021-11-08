package arrays_insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i=0; i <= numbers.length-1;i++){
            System.out.println("Enter the value for the position "+i+" :");
            numbers[i] = input.nextInt();
        }

        for(int i=1; i <=numbers.length-1; i++){
            //Get the value of the next position
            int key = numbers[i];
            //J will reference the pevious position
            int j = i-1;
            while(j>=0 && numbers[j]>key){
                //Exchange the previous with the next
                numbers[j+1] = numbers[j];
                j--;
            }
            //The previous position receives the value from the next
            numbers[j+1] = key;
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
