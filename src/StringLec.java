import java.util.Scanner;
public class StringLec {
    public static void main(String[] args) {

        String message = "Hello";
        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        // Don't do this!
        boolean confirmation = userInput == "y";

        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup"); // false
        input.startsWith("Codeup") ;// true

        input.endsWith("rocks") ;// false
        input.endsWith("rocks!") ;// false
        input.endsWith("Rocks!") ;// true /*as long as the last 4 are the same*/


        String manipulation = "String to manipulate";
        String trims = "  Trims the test   ";
        System.out.println(manipulation.charAt(4));

        System.out.println(manipulation.indexOf("i")); /*comes back as 3*/
        System.out.println(manipulation.indexOf("y"));/*it comes back -1 having 0 y in the string  */

        System.out.println(manipulation.lastIndexOf("n"));/*should get 12*/


        System.out.println(manipulation.replace("manipulate", "change"));
        System.out.println(manipulation.replace("String", "Minds"));/*dosent save so the outcome issnt minds to change but minds to manipulate
        */

        System.out.println(manipulation.substring(6));
        System.out.println(manipulation.substring(0,6));

        System.out.println(manipulation.toLowerCase());
        System.out.println(manipulation.toUpperCase());

        System.out.println(trims.trim());

    }
}
