import java.util.Scanner;
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Num 1");
        int num1 = scan.nextInt();

        System.out.println("Enter Num 2");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            int product = 1;

            for(int i = num1; i <= num2; i++){
                product *= i;
            }
            System.out.println(product);
        } else{
            System.out.println("Invalid Numbers");
        }


        scan.close();
    }
}
