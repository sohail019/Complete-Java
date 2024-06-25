class Bitwise2OR{
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        var res = a | b; // |-> OR Operator check if any bit is 1 result is 1, otherwise 0;
        
        System.out.println(res); // 7
        
        a = 7;
        b = 9;
        res = a | b;
        System.out.println(res); // 15

        a = 7;
        b = 6;
        res = a | b;
        System.out.println(res); // 7

        a = 10;
        b = 9;
        res = a | b;
        System.out.println(res); // 11
    }
}