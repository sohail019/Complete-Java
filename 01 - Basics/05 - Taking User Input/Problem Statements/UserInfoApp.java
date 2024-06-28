import java.util.Scanner;

class UserInfoApp{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // User ID (byte)
        System.out.println("Enter Your User ID (byte): ");
        byte userID = scan.nextByte();

        // Age (short)
        System.out.println("Enter Your Age (short): ");
        short age = scan.nextShort();

        // Phone Number (int);
        System.out.println("Enter Your Phone Number (int): ");
        int phoneNumber = scan.nextInt();

        // National ID (long);
        System.out.println("Enter Your National ID (long): ");
        long nationalID = scan.nextLong();

        // Height (float);
        System.out.println("Enter Your Height (float): ");
        float height = scan.nextFloat();

        // Weight (double);
        System.out.println("Enter Your Weight (double)");
        double weight = scan.nextDouble();

        // Gender (char);
        System.out.println("Enter Your Gender (char)");
        char gender = scan.next().charAt(0);

        // isMarried (boolean)
        System.out.println("Are You Married? (boolean): ");
        boolean isMarried = scan.nextBoolean();

        // nextLine add
        scan.nextLine();

        // Name (string)
        System.out.println("Enter Your Name (String): ");
        String name = scan.nextLine();

        scan.close();

        // Printing all :
        System.out.println("User ID is: " + userID );
        System.out.println("User Age is: " + age );
        System.out.println("User Phone Number is: " + phoneNumber );
        System.out.println("User National ID is: " + nationalID );
        System.out.println("User Height is: " + height );
        System.out.println("User Weight is: " + weight );
        System.out.println("User Gender is: " + gender );
        System.out.println("Is User Married?: " + isMarried );
        System.out.println("User Name is: " + name );
    }
}