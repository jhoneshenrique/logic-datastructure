package arrays_bubblesort;

import java.util.Scanner;

public class NameSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        String x = "";

        for(int i=0; i<=4; i++){
            System.out.println("Enter the name for the position "+i+" :");
            names[i] = input.next();
        }

        for (String name: names) {
            System.out.println(name);
        }

        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                if(names[i].compareTo(names[j])>0){
                    x = names[i];
                    names[i] = names[j];
                    names[j] = x;
                }
            }
        }

        for (String name: names) {
            System.out.println(name);
        }
    }
}
