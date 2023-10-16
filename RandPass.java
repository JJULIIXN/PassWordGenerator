import java.security.SecureRandom;

public class randPass extends Driver {
    
        public static String generatePassword(int length){
        //setting all possible characters in a password
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        //adding all of the characters into one string
        String allCharacters = uppercase + lowercase + digits;

        //random and StringBuilder declaration
        SecureRandom rand = new SecureRandom();
        StringBuilder pass = new StringBuilder();

        //for as long as i is less than the desired password length..
        for(int i = 0; i < length; i++){
            //chooses a random index from allCharacters
            int randomIndex = rand.nextInt(allCharacters.length());
            //appens the character to string pass
            pass.append(allCharacters.charAt(randomIndex));
        }
        return pass.toString();
    }
}
