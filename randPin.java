import java.security.SecureRandom;

public class randPin extends Driver{

    public static String generatePin(int length){
        //sets all the posible digits
        String digits = "0123456789";

        //random and StringBuilder declaration
        SecureRandom rand = new SecureRandom();
        StringBuilder pin = new StringBuilder();

        //for as long as i is less than the desired pin length...
        for(int i = 0; i < length; i++){
            //chooses a random index from digits
            int randomIndex = rand.nextInt(digits.length());
            //appens the digit to the string pin
            pin.append(digits.charAt(randomIndex));
        }
        return pin.toString();
    }
}
