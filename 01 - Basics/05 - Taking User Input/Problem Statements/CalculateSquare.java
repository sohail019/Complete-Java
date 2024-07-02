import java.util.Scanner;

/**
 * CalculateSquare
 */
public class CalculateSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number to Calculate Square::");
        int num =  scan.nextInt();

        scan.close();
        // Calculate the square
        int numSquare = num * num;

        // Printing the result
        System.out.println("Square of " + num + " is :: " + numSquare);
    }
}