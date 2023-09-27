import java.util.Scanner;  // Import the Scanner class

public class Pin extends Password {
    int pinLen, counter;
    String password;

    public Pin(int pinLen){
        super(
        this.pinLen = pinLen;
    }



    if(counter < pinLen){
        int i = (int)Math.floor(Math.random() * (0 - 9 + 1) + 0);
        password = password + i;
        counter++;
    }

    return password;

}
