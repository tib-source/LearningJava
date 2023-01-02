public class L3_variables {
    public static void main(String[] args){ 
        int meow = 23;
        String cat = "the dog";
        boolean age = true;
        double possy = 2.1234;

        String to_print = cat + " is about to turn " + meow + " but he might have cancer which is " + age + " with a radius of " + possy; 

        System.out.println(to_print);

        // converting variables to different types:
        
        //integers
        String rawInt = "522234";
        int convertedInt = Integer.valueOf(rawInt);
        System.out.println(convertedInt);


        //double
        String rawDouble = "4.23425";
        double convertedDouble = Double.valueOf(rawDouble);
        System.out.println(convertedDouble);

        //boolean 
        String rawBool = "true";
        boolean convertedBool = Boolean.valueOf(rawBool);
        System.out.println(convertedBool);


    }
}
