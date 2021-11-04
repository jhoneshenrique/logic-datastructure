package arrays_binary_sequencial_search;

import java.util.Scanner;

public class NamesSequencialSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        String pesq;
        boolean found = false;

        for(int i=0; i<=4; i++){
            System.out.println("Enter the name for the position "+i+" :");
            names[i] = input.next();
        }

        System.out.println("Enter the name to be found");
        pesq = input.next();

        int i = 0;
        while(i<=4 && found==false){
            if(pesq.compareTo(names[i])==0){
                found = true;
            }else{
                i++;
            }
        }

        if(found==true){
            System.out.println("The name "+names[i]+" was found in he position "+i);
        }else{
            System.out.println("The name couldn't be found");
        }
    }
}
