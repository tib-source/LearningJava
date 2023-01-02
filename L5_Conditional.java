import java.util.Scanner;
public class L5_Conditional {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        //positivity 
        int number = 4; 
        if (number >= 0){ 
            System.out.println("Your number is positive!");
        } else{
            System.out.println("Your number is negative!");
        }
        // greater than
        System.out.println("First number: ");
        int first = scanner.nextInt();
        System.out.println("Second number: ");
        int second = scanner.nextInt();

        if (first > second){
            System.out.println(first + " is greater");
        }else if(second > first){
            System.out.println(second + " is greater");
        }else { 
            System.out.println("They are equal");
        }
        

        // Password
        System.out.println("What is the password");
        String userInput = scanner.nextLine();
        String password = "Caput Draconis";

        if (password.equals(userInput)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    
        // Checking the age 
        System.out.println("How old are you: ");
        int userAge = scanner.nextInt();

        if (userAge >= 0 &&  userAge <= 120){
            System.out.println("OK!");
        }else {
            System.out.println("IMPOSSIBLE!");
        }


        // FizzBuzz
        System.out.println("Enter a number");
        int toCheck = scanner.nextInt();
        if (toCheck % 3 == 0 && toCheck % 5 == 0 ){
            System.out.println("FizzBuzz");
        }else if( (toCheck % 5) == 0){
            System.out.println("Buzz");
        }else if ( toCheck % 3 == 0){
            System.out.println("Fizz");
        }else { 
            System.out.println(toCheck);
        }
        scanner.close();
    }
}
