import java.util.Scanner;

/**
 * SimpleIf2 - WAP to take Age as user input and if age is greater than equal to 18 then print msg "Adult"
 */
public class SimpleIf2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Age::");
        int age =  scan.nextInt();

        scan.close();
        if (age >= 18) {
            System.out.println("Your Age is " + age + " So, You are Adult!");
        }


    }
}