import java.util.Scanner;

/**
 * SquareStar
 */
public class SquareStar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){ //  loop for rows
            for(int j = 1; j <=num; j++){ //  loop for printing stars in each row 
                System.out.print("*");
            }
            System.out.println(); // sending cursor to next line
        }

        

        scan.close();
    }
}