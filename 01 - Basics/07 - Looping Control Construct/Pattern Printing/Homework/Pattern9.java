/**
 * Pattern9
 * -----*
 * ----***
 * ---*****
 * --*******
 * -*********
 */

 public class Pattern9 {
 
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= num - i + 1; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++){ // 2 * 1 - 1;
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
 }