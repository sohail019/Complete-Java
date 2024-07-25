/**
 * Pattern5
 *  111111
    2222212
    33333123
    444441234
    5555512345
 */
public class Pattern5 {

    public static void main(String[] args) {
        
        int num = 5;

        for(int i =1; i <= num; i++){

            // Loop for square
            for(int j = 1; j <= num; j++){
                System.out.print(i);
            }

            // loop for right angled triangle
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }

            System.out.println();
        }
    }    
}