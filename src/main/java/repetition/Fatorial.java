package repetition;

public class Fatorial {
    public static void main(String[] args) {
        int fat = 1;
        int i = 1;

        while(i<=5){
            fat *= i;
            i++;
        }

        System.out.println(fat);
    }
}
