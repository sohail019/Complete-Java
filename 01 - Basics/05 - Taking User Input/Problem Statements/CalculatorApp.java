import java.util.Scanner;

class CalculatorApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        add();

        System.out.println("Enter Num 1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter Num 2: ");
        int num2 = scan.nextInt();

        sub(num1, num2);

        System.out.println("Product = " + multiply(num1, num2) );
        
        System.out.println("Quotient = " + divide());

        scan.close();
    }

    // Addition
    public static void add(){
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter Num 2: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        scan.close();
    }


    // Subtraction
    public static void sub(int num1, int num2){
        int diff = num1 - num2;
        System.out.println("Difference= " + diff);
    }


    // Multiply
    public static int multiply(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }

    // Division
    public static int divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter Num 2: ");
        int num2 = scan.nextInt();
        int quotient = num1 / num2;

        scan.close();

        return quotient;
    }
}