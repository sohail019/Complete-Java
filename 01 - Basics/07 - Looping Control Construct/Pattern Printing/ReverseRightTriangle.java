import java.util.Scanner;

/**
 * RightAngle
 */
public class ReverseRightTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scan.nextInt();

        for(int i = 1;  i<=num; i++){
            for(int j = 1; j<= num - i + 1; j++){
                System.out.print("* ");           
            }
            System.out.println();
        }
        scan.close();
    }
}
/* OUTPUT
* * * * *
* * * * 
* * *
* * 
* 
 */