import java.util.Scanner;

class UserInput3CharString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Accept char
        System.out.println("Enter Your Gender: ");
        char gender = scan.next().charAt(0);

        // Take user input as First Name
        System.out.println("Enter Your First Name: ");
        String firstName = scan.next();

        scan.nextLine();
        // Take user Input as Full Name
        System.out.println("Enter Full Name: ");
        String fullName = scan.nextLine();

        scan.close();

        // Printing
        System.out.println("Gender is: " + gender);
        System.out.println("First Name is: " + firstName);
        System.out.println("Full Name is: " + fullName);
    }
}