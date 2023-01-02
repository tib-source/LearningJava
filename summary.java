import java.util.Scanner;

public class summary {
    public static void main(String[] args){ 
        // printing
        System.out.println("This is a string to be printed");
        System.out.println("This was written using the shortcut - sout");
        
        // getting input 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String message = scanner.nextLine();
        
        // string concatenation
        System.out.println("Hello " + message + "!");
        
        // different types of variables
        int age = 23; 
        boolean tall = false ;
        double height = 5.10;
        char meow = 'm'; 
        
        // interatction between strings and other variables 
        String combination = "You are " + message + " "+  age +" "+ tall +" "+ height +" "+ meow ;
        System.out.println(combination);
        scanner.close();

        // variable names standard - camelCase
        String carName = "Honda";
        int personAge = 23;
        System.out.println(carName + personAge);

        //Operations
        int num1 = 1; 
        int num2 = 2; 
        int result = num1 / num2 + (num1 * num2) % num2;
        double floatResult = (double) num1 / num2; 
        System.out.println( result + " , float: " + floatResult);

        //Conditional Java 
        if (num1 > num2){
            System.out.println("My head is very foogy");
        }else if ( num2 < num1) {
            System.out.println("Maybe i need a release");
        }else{ 
            System.out.println("Nah I will wait 25 minutes");
        }

        //Conditionals Operation
        if (carName == "Honda" && personAge < 35){
            System.out.println("RICH PERSON");
        } else if (num1 == 2 || num2 == 2 ){ 
            System.out.println("Meow");
        }else{ 
            System.out.println("How did u get here?");
        }

        //custom methods
        holaAmigo();
    }

    // custom methods 
    public static String holaAmigo( ){ 
        System.out.println("Hola Amigo");
        System.out.println("Como estas?");
        return "Hola";
    }

}
