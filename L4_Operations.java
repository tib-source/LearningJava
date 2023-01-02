import java.util.Scanner;
public class L4_Operations {
    public static void main ( String[] args){ 
        Scanner scanner = new Scanner(System.in);
        // days to seconds 
        System.out.println("how many days do you want to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
        

        // sum of two numbers 
        System.out.println("first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("second number: ");
        int second = scanner.nextInt();
        System.out.println("Result is " + (first + second));


        // type casting to solve division error 
        int one = 3;
        int two = 2; 
        double result = one / two ; // result would be 1.0 because int only stores whole numbers. 
            // answer would only be in decimal if atleast one of the variables is a double or floating point decimal 
            // could be solved using type casting. i.e including (double) before atleast one of the divends 
        result = (double) one / two; // returns 1.5
        result = one / (double) two; // returns 1.5
        result = (double) (one / two); // returns 1.0 - expretion is evaluated before type conversion due to parentheses 
        System.out.println(result);

        scanner.close();
    }
}
