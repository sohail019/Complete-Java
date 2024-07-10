import java.util.Scanner;

/**
 * PrintingNumbers1
 */
public class PrintingNumbers1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scan.nextInt();

    
        for(int i = 1;  i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print(i);             
            }
            System.out.println();
        }
        scan.close();
    }
}
/* OUTPUT
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */