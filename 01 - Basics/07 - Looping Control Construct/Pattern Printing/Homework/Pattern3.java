/**
 * SquareStar
 */
public class Pattern3 {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){ //  loop for rows
            
            for(int j = 1; j <= 5; j++){ //  loop for printing stars in each row 
                
                System.out.print("*");
            }
            
            System.out.println(); // sending cursor to next line
        }

    }
}