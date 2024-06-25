class CalculatorApp{
    public static void main(String[] args){
        add();

        sub(20, 10);

        int mul = multiply();
        System.out.println("Multiplication of Two number is " + mul);

        int a = 20; int b = 10;
        int divRes = divide(a, b);
        System.out.println("Division of Two Number is " + divRes);
    }

    // Addition
    public static void add(){
        int a = 10;
        int b = 20;

        int mulRes = a + b;

        System.out.println("Addition of Two Numbers is " + mulRes);
    }

    // Subtraction
    public static void sub(int a, int b){
        int res = a - b;
        System.out.println("Subtraction of Two Numbers is " + res);
    }

    // Multiplication
    public static int multiply(){
        int a = 10;
        int b = 2;

        int res =  a * b;
        return res;
    }

    // Division
    public static int divide(int a, int b){
        int res = a / b;
        return res;
    }
}