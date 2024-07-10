import java.util.Scanner;

/**
 * AsPerUserChoice
 */
public class AsPerUserChoice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // creating object of Scanner class

        System.out.println("How Many Rows You Want To Print??"); // asking user for number of rows
        int rows = scan.nextInt(); // storing number of rows in variable

        System.out.println("How Many Columns You Want To Print??"); // asking user for number of column
        int columns = scan.nextInt(); // storing number of column in variable

        System.out.println("Enter a character to print"); // asking user to input character as per their choice
        char character = scan.next().charAt(0);

        for(int i = 1; i <= rows; i++){ // loop for row

            for(int j = 1; j <= columns; j++){ // loop for printing character in each row
                System.out.print(character); // printing character
            }
            System.out.println(); // sending cursor to next line
        }

        scan.close();
    }
}