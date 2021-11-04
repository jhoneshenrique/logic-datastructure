package arrays_binary_sequencial_search;

import java.util.Scanner;

public class NamesBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        String pesq;
        int start = 0;
        int end = 4;
        int middle = 0;
        boolean found = false;
        String x;

        for(int i=0; i<=4; i++){
            System.out.println("Enter the name for the position "+i+" :");
            names[i] = input.next();
        }

        System.out.println("Enter the name to be found");
        pesq = input.next();

        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                if(names[i].compareTo(names[j])>0){
                    x = names[i];
                    names[i] = names[j];
                    names[j] = x;
                }
            }
        }


        while(start<=end && found==false){
            middle = (start+end)/2;
            if(pesq.compareTo(names[middle])==0){
                found = true;
            }else{
                if(pesq.compareTo(names[middle])<0){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }

        if(found==true){
            System.out.println("The name "+names[middle]+" was found in he position "+middle);
        }else{
            System.out.println("The name couldn't be found");
        }
    }
}
