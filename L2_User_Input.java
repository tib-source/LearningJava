import java.util.Scanner;
public class L2_User_Input {
    public static void main(String[] args){
        /*Example setup 
        // // Setup scanner to read user input 
        // Scanner scanner = new Scanner(System.in);


        // // Prompt user to give input 
        // System.out.println("What is your name? ");

        // // read user input
        // String message = scanner.nextLine();


        // // Print user input back to them 
        // System.out.println("Hello '" + message + "'!");
        // scanner.close();
        */
        // Practice 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings, How are you?");

        // saving response to a string
        String response = scanner.nextLine();

        System.out.println("Thats amazing, Tell me more about your day? :)");

        String second_response = scanner.nextLine();
        
        System.out.println("Well, Thank you for the lovely conversation!");
        
        System.out.println("your responses were:");
        System.out.println(response);
        System.out.println(second_response);
        scanner.close();


        
    }
}
