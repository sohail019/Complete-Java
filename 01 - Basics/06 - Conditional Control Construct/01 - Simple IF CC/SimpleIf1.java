import java.util.Scanner;

/**
 * CC1SimpleIf - WAP to take marks as user input and if marks is greater than equal to 35 then print msg "Students is passed". 
 */
public class SimpleIf1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks::");
        int marks = scan.nextInt();

        scan.close();

        if (marks >= 35) {
            System.out.println("Student is passed!!");
        }

    }
}