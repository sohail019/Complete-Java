import java.util.Scanner;

/**
 * IfElse2 - WAP to take Gender as user input if value of Gender is M then print "Male" otherwise print "Female"
 */
public class IfElse2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Gender");
        char gender = scan.next().charAt(0);

        scan.close();
        if (gender == 'M') {
            System.out.println("Male");
        } else{
            System.out.println("Female");
        }
    }
    
}