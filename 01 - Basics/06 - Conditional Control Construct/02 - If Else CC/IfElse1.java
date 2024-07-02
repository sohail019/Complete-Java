import java.util.Scanner;

/**
 * IfElse1 - WAP to take Age as user input and if age is greater than equal to 18 then print msg "Adult" else print "Not Adult" 
 */
public class IfElse1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Age::");

        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are Adult, Your Age is: " + age );
        } else {
            System.out.println("You are not Adult, Your Age is: " + age );
        }
    }
    
}