import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating Object of Scanner class

        System.out.println("Enter a Number"); // Printing prompt statement in console for user
        int num = scan.nextInt(); // storing user input in num variable

        int mul = 1; // initializing mul variable for further process
        for(int i = 1; i <= 10; i++){ // loop initializing with i = 1 and then loop should run until i reaches to 10.
            mul = num * i; // calculate multiplication, suppose num = 5 and i = 1 -> it will calculate result  5.
            System.out.println(num + " x " + i + " = " + mul); // printing to user whole table
        }

        scan.close(); // close the scanner object
    }    
}
