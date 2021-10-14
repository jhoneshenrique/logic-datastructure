package arrays;

import java.util.Scanner;

public class ReadElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elements[] = new int[10];

        for(int i=0; i<=9; i++){
            System.out.println("Enter the value for the position "+i);
            elements[i] = input.nextInt();
        }

        for (Integer element: elements) {
            System.out.println(element);
        }


    }
}
