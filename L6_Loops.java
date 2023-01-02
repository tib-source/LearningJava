import java.util.Scanner;
public class L6_Loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Input a number");
            int input = Integer.valueOf(scanner.nextLine());
            if(input > 0){
                System.out.println(input * input);
            }else if (input < 0){ 
                System.out.println("Unsuitable Number");
                continue;
            }else{ 
                break;
            }
        }

        int sum = 0 ;
        int numbers = 0;
        // sum of numbers 
        while(true){
            System.out.println("Give a number (0 exits)");
            int input = scanner.nextInt();
            if (input != 0 ){ 
                numbers++;
                sum += input;
            }else{
                break;
            }
        }
        System.out.println("total sum is " + sum);
        System.out.println("Number of numbers is " + numbers);
        System.out.println("Average of numbers is " + (double)sum/numbers);
    
        // Count to 100
        System.out.println("Number to count to 100 from: ");
        int userInput = scanner.nextInt();
        for (int i = userInput; i <= 100; i++){
            if (userInput > 100){
                System.out.println("Number given was higher than limit");
                break;
            }
            System.out.println(i);
        }

        //Range
        System.out.println("Where to:");
        int finish = scanner.nextInt();
        System.out.println("Where from:");
        int start = scanner.nextInt();

        for(int i = start; i <= finish; i++){
            System.out.println(i);
        }

        //factorial 
        System.out.println("Factorial number: ");
        int factorial = scanner.nextInt();
        int factorialResult = 1;
        for(int i = 1; i <= factorial; i++){
            factorialResult *= i;
        }
        System.out.println("Factorial of "+ factorial + " is " + factorialResult);
    }
}
