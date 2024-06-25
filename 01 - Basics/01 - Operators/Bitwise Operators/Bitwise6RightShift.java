class Bitwise6RightShift{
    public static void main(String[] args){
        int a = 8;

        var res =  a >> 2; // >> -> BRSO will shift every bit towards right side.. It is equivalent of dividing the num by 2;
    
        System.out.println(res); // 2
        
        a = 10;
        res = a >> 2;
        System.out.println(res); // 2

        a = 24;
        res = a >> 3;
        System.out.println(res); // 3

        a = 100;
        res =  a >> 5;
        System.out.println(res); // 3
    }
}