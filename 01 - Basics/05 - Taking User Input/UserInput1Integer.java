import java.util.Scanner;

// All the integer
class UserInput1Integer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); // Scanner object creating from Scanner class

		// Accepting byte
		System.out.println("Enter Your Age: ");
		byte age = scan.nextByte();

		// Accepting short
		System.out.println("Enter Your Year: ");
		short year = scan.nextShort();

		// Accepting int
		System.out.println("Enter Your Salary: ");
		int salary = scan.nextInt();

		// Accepting long
		System.out.println("Enter Your Phone Number: ");
		long phone = scan.nextLong();

		scan.close();
		// Print all of them
		System.out.println("Entered Age is : " + age);
		System.out.println("Entered Year is : " + year);
		System.out.println("Entered Salary is : " + salary);
		System.out.println("Entered Phone Number is : " + phone);
	}
}
