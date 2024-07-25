/**
 * Pattern10
 * -*********
 * --*******
 * ---*****
 * ----***
 * -----*
 */

 public class Pattern10 {
 
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= num; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 11 - 2 * i; k++){ // 11 - 2 * i;
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }