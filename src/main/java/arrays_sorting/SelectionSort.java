package arrays_sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int numbers[] = {12,33,5,7,50};

        int it;
        int i;
        int minorPosInitial;
        int minorPosition;
        int temp;

        for(it=0; it<numbers.length-1; it++){
            //Stars considering the first position as the minor
            minorPosInitial = it;
            minorPosition = it+1;
            for(i= minorPosInitial+1; i < numbers.length; i++){
                if(numbers[i] < numbers[minorPosition]){
                    minorPosition = i;
                }
            }
            if(numbers[minorPosition] < numbers[minorPosInitial]){
                temp = numbers[minorPosInitial];
                numbers[minorPosInitial] = numbers[minorPosition];
                numbers[minorPosition] = temp;
            }
        }

        for(int j=0; j<=4; j++){
            System.out.println(numbers[j]);
        }
    }


}
