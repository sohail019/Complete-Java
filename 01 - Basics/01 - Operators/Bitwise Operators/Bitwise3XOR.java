class Bitwise3XOR{
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        var res = a ^ b; // ^-> XOR Operator check if both bits are same it result as 0, if both bits are different it results as 1;
        
        System.out.println(res); // 6
        
        a = 7;
        b = 9;
        res = a ^ b;
        System.out.println(res); // 14

        a = 7;
        b = 6;
        res = a ^ b;
        System.out.println(res); // 1

        a = 10;
        b = 9;
        res = a ^ b;
        System.out.println(res); // 3
    }
}