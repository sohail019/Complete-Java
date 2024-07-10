import java.util.Scanner;

public class HorizontalStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        scan.close();
    }
}
