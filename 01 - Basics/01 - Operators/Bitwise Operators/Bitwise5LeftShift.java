class Bitwise5LeftShift{
    public static void main(String[] args){
        int a = 3;

        var res =  a << 3; // << -> BLSO will shift every bit towards left side.. It is equivalent of mul the num with 2;
    
        System.out.println(res); // 24
        
        a = 27;
        res = a << 3;
        System.out.println(res); // 216

        a = 7;
        res = a << 2;
        System.out.println(res); // 28

        a = 10;
        res =  a << 2;
        System.out.println(res); // 40
    }
}