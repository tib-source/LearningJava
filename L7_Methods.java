import java.util.Scanner;
public class L7_Methods {
    public static void main(String[] args){
        // this is the main method
        Scanner scanner = new Scanner(System.in);
        System.out.println(args);

        fromParameterToOne(10);
    }

    public static String greet(){
        System.out.println("Hello");
        return "Hello";
    }

    public static void fromParameterToOne(int userInput){
         int i = userInput;
        while( i != 0 ){ 
            if ( i > 1 ){ 
                System.out.println(i);
                i--;
                continue;
            } else if (1 > i){ 
                System.out.println(i);
                i++;
                continue;
            }
            System.out.println(i);
            break;
        }
    }
}
