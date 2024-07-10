import java.util.Scanner;

/**
 * PrintingNumbers2
 */
public class PrintingNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scan.nextInt();
    
        for(int i = 1;  i<=num; i++){
            for(int j = 1; j<=num; j++){
                             
                System.out.print(j);
            }
            System.out.println();
        }

        scan.close();
    }
}
/* OUTPUT
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 */