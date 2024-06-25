class Bitwise1AND{
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        var res = a & b; // &-> AND Operator check if both bits are 1 result is 1, otherwise 0;
        
        System.out.println(res); // 1
        
        a = 7;
        b = 9;
        res = a & b;
        System.out.println(res); // 1

        a = 7;
        b = 6;
        res = a & b;
        System.out.println(res); // 6

        a = 10;
        b = 9;
        res = a & b;
        System.out.println(res); // 8
    }
}