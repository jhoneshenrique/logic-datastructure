package conditionals;
import java.util.Scanner;

//Read a number (positive or negative) and show it as positive
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter the number: ");
        number = input.nextInt();

        System.out.println((number<0)?number*-1:number);
    }
}
