// 

import java.util.Scanner;
public class SwitchPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Gender");
        char gender = scan.next().charAt(0);


        System.out.println("Enter the Marks");
        int marks = scan.nextInt();

        int cgpa = marks / 10;

        scan.close();
        printMarks(gender, cgpa);

    }

    public static void printMarks(int gender, int cgpa){
        if(gender == 'M' || gender == 'm'){
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
    
        } else if(gender == 'F' || gender == 'f'){
            switch (cgpa) {
                case 10:
                case 9:
                case 8:
                case 7:
                    System.out.println("Excellent");
                break;
                
                case 6:
                case 5: System.out.println("Very Good");
                break;
    
                case 4: 
                case 3: System.out.println("Good");
                break;
    
                case 2: System.out.println("Ok");
                break;
    
                case 1:
                case 0: System.out.println("Poor");
                break;
                default: System.out.println("Invalid");
                    break;
            }
    
        } else {
            System.out.println("Invalid Gender");
        }
    }
}
