import java.util.Scanner;

/**
 * NestedIfElse2 -  WAP to take a number as user input and check whether the number is positive or negative or 0.
 */
public class NestedIfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scan.nextInt();

        scan.close();

        if(num > 0){

            System.out.println("Positive");
        } else if(num < 0) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }
    
}