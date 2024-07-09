public class Break1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 8; i++){
            if (i == 5) {
                System.out.println("Found Item: 5. Stopping Search");
                break;
            } 
            System.out.println("Checking Item:" + i);
        }
    }
}
