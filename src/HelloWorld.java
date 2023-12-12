import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;
//%L = Long
//%S = String
//%D = Double


//public class HelloWorld {/*these will always be pascal case*/
   // public static void main(String[] args){
   //     System.out.println("Hello, World");
   // }
//}
public class HelloWorld {
    public static void main(String[] args) {
//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        id = 123;
//        isLoggedIn = false;
//        bankAccountBalance = 1000.23f;
//
//        int theAnswer= 42;
//        String question = "what is your fav color";
//
//
//        final int SIDES_OF_A_DICE =6;
//        final String API_KEY ="b75b703d8195f6f433ca";
//        final String GITHUB_API_BASE_URL = "https://api.github.com";
//
//        int myInteger =900;
//        long morePRECISE = myInteger;
//
//        double pi = 3.14159;
//        int almostPi =(int) pi;
//
//        System.out.println(pi);
//        System.out.println(almostPi);
        /*1*/int myFavoriteNumber = 27;
        System.out.println(myFavoriteNumber);


        /*2*/String myString = "name";
        System.out.println(myString);

        /*3*/myString = "that should work";
        System.out.println(myString);

//        /*4*/myString = 3.14159;
//        System.out.println();
        /*cant run*/

//        /*5*/long myNumber;
//        System.out.println(myNumber);
        /*no value can run */

//        /*6*/myNumber = 3.14;
//        System.out.println(myNumber);
        /*wont run as its a decimal and needs to be a float or double*/

//        /*7*/myNumber = 123L;
//        System.out.println(myNumber);
//        /*this runs*/

//        /*8*/myNumber = 123;
//        System.out.println(myNumber);


//        /*9*/double myNumber = 3.14;
//        System.out.println(myNumber);
        /*error due to it being float change to double*/


//        /*10*/       int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x); /*7*/
//        System.out.println(x);   /*7*/
        /*the x++ appears to add 1 after the rotation thats why x is 6 where ++x adds 2 before the x giving us 6 and 6 instead of 5 and 6
         * */

        /*11*/ //String class = asdf;
        /*an error but myClass is good*/


        /*12*/
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

//        System.out.println(o);
//        System.out.println(three);


        /*13*/
//        int x = 4;
//        x = x + 5;

//        x+=5;
//        System.out.println(x);

        int x = 3;
        int y = 4;
//        y = y * x;

         y*=x;
        System.out.println(x);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//        x /= y;
//        y -= x;
//        System.out.println(x);


        /*14*/
//        byte myNum =180;
        /*byte is a max of 127 so if u try to add to the it goes to the lowest number*/


//        System.out.println("Hell");
//        System.out.print("world");
        String name = "codeup";
        System.out.printf("hello hell, %s. nice to be here.%n", name);

        String greeting = "yo what up";
        System.out.printf("%s, %s", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hotdog: ");
        String userInput =scanner.nextLine();/*this way for a string*/
//        String userInput =scanner.next();
        System.out.println("you enterd ---> \"" + userInput + "\" <----");





    }
}

