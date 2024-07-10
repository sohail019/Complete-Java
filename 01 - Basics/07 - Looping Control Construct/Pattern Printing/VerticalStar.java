import java.util.Scanner;

/**
 * VerticalStar
 */
public class VerticalStar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println("*");
        }

        scan.close();
    }
}