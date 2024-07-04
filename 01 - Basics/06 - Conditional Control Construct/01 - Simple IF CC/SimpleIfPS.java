import java.util.Scanner;

/* ​You are building a simple temperature monitoring system. The system should check if the current temperature exceeds a certain threshold and display a warning message if it does.​
Task: Check Temperature and Display Warning

Declare an integer variable currentTemperature and assign it the value 85.

Declare an integer variable thresholdTemperature and assign it the value 80.

Use a simple if statement to check if currentTemperature exceeds thresholdTemperature.

If the condition is true, print the warning message: "Warning: Temperature exceeds threshold!".
 */

public class SimpleIfPS {
    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Temperature");
        int currentTemperature = scan.nextInt();
        int thresholdTemperature = 90;

        scan.close();
        if(currentTemperature > thresholdTemperature){
            System.out.println("Warning: Temperature exceeds threshold!");
        }
    }
}