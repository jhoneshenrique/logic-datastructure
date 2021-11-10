package arrays_quicksort;

import java.util.Arrays;

public class ArrayBSorting {



    public static void main(String[] args) {
        int[] numbers = {12,3,2,9,5,32};

        quickSort(numbers,0,numbers.length-1);

        Arrays.stream(numbers).forEach(System.out::println);
    }

    //This method finds the pivot
    public static int partition(int numbers[], int begin, int end){
        int ref, up, down, temp;

        ref = numbers[begin];
        down = begin;
        up = end;

        //While the references don't cross each other
        while (down < up) {
            //finds a number bigger than the pivot
            while(numbers[down] <= ref && down < end){
                down++; //Down goes step forward in order to find a greater value
            }
            //finds a value smaller than the ref
            while(numbers[up] > ref){
                up--;
            }
            //If the references cross themselves
            if(down < up){
                temp = numbers[down];
                numbers[down] = numbers[up];
                numbers[up] = temp;
            }
        }
        //change the first element with the element within the index up
        numbers[begin] = numbers[up];
        numbers[up] = ref;

        return up; //Up position defines what is the pivot
    }

    public static void quickSort(int numbers[], int begin, int end){
        int pivot;
        if(begin > end){
            return;
        }
        //finds the pivot
        pivot = partition(numbers,begin,end);
        //quicksort to the left
        quickSort(numbers, begin, pivot-1);
        //quicksort to the right
        quickSort(numbers, pivot+1,end);
    }

}
