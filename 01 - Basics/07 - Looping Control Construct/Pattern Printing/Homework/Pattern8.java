/**
 * Pattern8
 * -----*
 * -----**
 * -----***
 * -----****
 * -----*****
 * -----****
 * -----***
 * -----**
 * -----*
 */

 public class Pattern8 {
 
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= num; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x = 2;  x<=num; x++){

            for(int y = 1; y <=num; y++){
                System.out.print(" ");
            }

            for(int z = 1; z<=num - x + 1; z++){
                System.out.print("*");           
            }
            System.out.println();
        }
    }
 }