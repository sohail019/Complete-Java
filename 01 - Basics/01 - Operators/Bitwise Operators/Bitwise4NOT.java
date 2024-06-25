class Bitwise4NOT{
    public static void main(String[] args){
        int a = 5;

        var res = ~ a; // ~ -> NOT Operator inverts all the bits of the operand, Each 0 bit becomes 1 and each 1 bit becomes 0;
    
        System.out.println(res); // -6
        
        a = 7;
        res = ~ a;
        System.out.println(res); // -8

        a = 7;
        res = ~ a;
        System.out.println(res); // -8

        a = 10;
        res = ~ a;
        System.out.println(res); // -11
    }
}