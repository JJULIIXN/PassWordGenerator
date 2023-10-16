import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("What type of password do you want to generate: Random password(PASS) or Random pin(PIN)?");
        String input = choice.nextLine();

        //if the user choses to make a PIN...
        if ("PIN".equals(input)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How long do you want your pin to be?");
            //creates a variable to set how long the pin will be
            int len = scanner.nextInt();
            String pin = randPin.generatePin(len);
            System.out.println("Your PIN is: " + pin);
        } 

       //if the user choses to make a password...
        else if ("PASS".equals(input)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How long do you want your password to be?");
           //creates a variable to set how long the  will be
            int length = scanner.nextInt();
            String pass = randPass.generatePassword(length);
            System.out.println("Your password is: " + pass);
        } 
    
        //if the user has an invalid input...
        else {
            System.out.println("Invalid answer, please retry");
        }
    }
}