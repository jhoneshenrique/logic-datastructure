package repetition;

public class OddNumberVerificatorRecursive {
    public static void main(String[] args) {
        System.out.println(verifyOddNumber(0));
    }

    public static int verifyOddNumber(int count){
        if(count==19){
           return 19;
        }else{
            if(count%2!=0){
                System.out.println(count);
            }
            return verifyOddNumber(count+1);
        }
    }
}
