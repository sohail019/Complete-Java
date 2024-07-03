import java.util.Scanner;

/**
 * NestedIfElse1 - WAP to take marks as user input,. If marks is greater than 90 and lesser than equal to hundred then print Grade A, and marks is greater than 70 and lesser than equal to 90, then print B, if marks is greater than 50 and lesser than equal to 70 then print Grade C, if marks is greater than equal to 35 and lesser than 50 then print Grade D, if marks is greater than equal to 0 and lesser than 35 the print Fail, Otherwise print Invalid Marks
 */
public class NestedIfElse1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Marks");
        int marks = scan.nextInt();

        scan.close();

        if(marks > 90 && marks <= 100){
            System.out.println("Grade A");
        } else if(marks > 70 && marks <= 90){
            System.out.println("Grade B");
        } else if(marks > 50 && marks <= 70){
            System.out.println("Grade C");
        } else if(marks >= 35 && marks <= 50){
            System.out.println("Grade D");
        } else if(marks >= 0 && marks < 35){
            System.out.println("Fail");
        } else{
            System.out.println("Invalid Marks");
        }
    }
    
}