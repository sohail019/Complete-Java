import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Num to find Factorial");
        int num = scan.nextInt();

        int fact = 1;

        // --------- For Loop - Approach 1 -  Best Approach-------------
        for(int i = num; i >=1 ; i--){
           fact *= i; 
        }

        //  --------- For Loop - Approach 2 ------------
        // for(int i = 1; i <= num; i++ ){
        //     fact *= i;
        // }

        // -------- While Loop - Approach 1 --------------
        // int i = num;
        // while (i >= 1) {
        //     fact *= i;
        //     i--;
        // }

        // ---------- While Loop - Approach 2 --------------
        // int i = 1;
        // while (i <= num) {
        //     fact *= i;
        //     i++;
        // }
        System.out.println("Factorial of " + num + " is " + fact);

        scan.close();
    }    
}
