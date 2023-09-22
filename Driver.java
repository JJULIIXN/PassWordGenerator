import java.util.Scanner;  // Import the Scanner class
public class Driver{
public static void main(String args[]){
        String Password;

        RandPass randPass = new RandPass();
        randPass.randomPass();

        // settings the floor and ceiling of the pass length
        int min = 8;
        int max = 12;
        //generates the password legnth from min to max
        int PassLen = (int)Math.floor(Math.random() * (max - min + 1) + min);

        //asks the user what type of password they want
        System.out.println("Do you want to make a pin, randpass or a mempass?[P | R | M]");
        Scanner type = new Scanner(String.in);
        String choice = type.nextLine();

        //if the user chooses a pin...
        if(choice.equals('P')){
            Scanner input = new Scanner(String.in); 
            System.out.println("Do you want your pin to be 4 or 6 characters long?");
            String pinLen = input.nextLine();
            System.out.println("A " + pinLen + " long password will be generated");
            
    }
}
}