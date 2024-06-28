import java.util.Scanner;

class UserInput2RealNo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take User Input as float
        System.out.println("Enter Your Percentage: ");
        float percentage = scan.nextFloat();

        // Take User Input as Double
        System.out.println("Enter PI value: ");
        double pi = scan.nextDouble();

        // Take User Input as Boolean
        System.out.println("Are you Married: ");
        boolean isMarried = scan.nextBoolean();

        scan.close();
        
        // Printing
        System.out.println("Percentage is: " + percentage);
        System.out.println("PI value is: " + pi);
        System.out.println("Are You married? : " + isMarried);
    }
}