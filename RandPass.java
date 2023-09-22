import java.util.Random;

public class RandPass extends Password {
    // password needs to be comprised of lowercase/uppercase/numbers/specialcase
    Random random = new Random();

    public Character randomPass(){
        char c=(char)(random.nextInt(26) + 'A');
        return c;
    }
}
