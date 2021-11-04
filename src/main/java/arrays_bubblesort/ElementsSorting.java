package arrays_bubblesort;

import java.util.Scanner;

public class ElementsSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elements[] = new int[10];
        int x;

        for(int i=0; i<=9; i++){
            System.out.println("Enter the value for the index "+i+" :");
            elements[i] = input.nextInt();
        }

        for(int i=0; i<=8; i++){
            for(int j=i+1; j<=9; j++){
                if(elements[i]>elements[j]){
                    x = elements[i];
                    elements[i] = elements[j];
                    elements[j] = x;
                }
            }
        }

        for (int element: elements) {
            System.out.println(element);
        }
    }
}
