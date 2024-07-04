
/*  WAP to take a user input as marks and find the cgpa using the formula marks/10, according to the calculated CGPA.. Print remarks for Students
For CGPA,8  9 and 10 print "Excellent"
For CGPA 6, 7 print "Good"
For CGPA 5, "OK"
For CGPA 4 3 2 "Poor"
For CGPA 1 0 "Get Lost"
Any other value "Invalid"
*/

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = scan.nextInt();
        int cgpa = marks / 10;

        printRemarks(cgpa);
        scan.close();
    }

    public static void printRemarks(int cgpa){

        switch (cgpa) {
            case 10:
            case 9:
            case 8:
                System.out.println("Excellent");
            break;
            
            case 7:
            case 6: System.out.println("Good");
            break;

            case 5: System.out.println("Ok");
            break;

            case 4:
            case 3:
            case 2: System.out.println("Poor");
            break;

            case 1:
            case 0: System.out.println("Get Lost");
            break;
            default: System.out.println("Invalid");
                break;
        }
    }
}
