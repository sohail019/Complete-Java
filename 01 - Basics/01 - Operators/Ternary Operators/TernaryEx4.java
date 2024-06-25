class TernaryEx4{
    // WAP to print Eligible to vote if age is greater than equal to 18, otherwise print Not eligible if age is less than 18
    public static void main(String[] args){
        int age1 = 20;
        int age2 = 5;

        System.out.println(age1 >= 18 ? "Eligible to Vote" : "Not Eligible"); // Eligible to Vote
        System.out.println(age2 >= 18 ? "Eligible to Vote" : "Not Eligible"); // Not Eligible
    }
}