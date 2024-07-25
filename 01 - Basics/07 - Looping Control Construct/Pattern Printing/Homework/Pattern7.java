/**
 * Pattern7
 * -----*****
 * -----****
 * -----***
 * -----**
 * -----*
 */
public class Pattern7 {

    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= num; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= num - i + 1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}