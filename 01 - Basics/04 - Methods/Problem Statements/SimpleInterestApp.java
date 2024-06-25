class SimpleInterestApp{
    public static void main(String[] args){
        double p = 1000.54;
        double r = 2.5;
        int t = 3;

        double res = calcSI(p, r, t);

        System.out.println("Simple Interest is " + res);
    }

    public static double calcSI(double p, double r, int t){
        double si = (p * r * t) / 100;

        return si;
    }
}