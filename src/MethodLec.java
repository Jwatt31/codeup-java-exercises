import java.util.Scanner;

public class MethodLec {

    public static void main(String[] args) {
        System.out.println(startingApplication());

        System.out.println(sayHello("hell", "Satan"));

        System.out.println(sum(9,8));

        System.out.println(ageName("James",31));

        System.out.println(hiHigh());

        String changeMe = "hello codeup!";
        changeString(changeMe);/*cant change the value*/
        System.out.println(changeMe);

        count(5);

        int base =5;
        int exponent=6;

        long result = getPower(base,exponent);
        System.out.println(base + "^" + exponent + " = " + result);

        long results = getPowers(base,exponent);
        System.out.println(base + "^" + exponent + " = " + results);

        ispy("chair", "seat on it");
    }

//    example:no paramater
        public static String startingApplication () {
            return "starting";

        }
        /*example 2 paramaeters*/
        public static String sayHello (String greeter, String name){
            return greeter + " " + name;
        }

        /*create a method that takes in 2 numbers and returns the sum*/

        public static int sum ( int num1, int num2){
            return num1 + num2;
        }

        /*creat a function that takes a string and int */
        public static String ageName (String name,int age){
            return name + " " + age;
        }


        public static String hiHigh(){
            return "hello hello";

        }

        public static String hiHigh(String greeter, String name){
            return greeter + " " + name;
        }
        public static String hiHigh(String name){
            return name;
        }

        public static void changeString(String s){
            s = "wub wub";
        }

        public static void count (int n){

            /*the if is my base case*/
            if (n<=0){
                return;
            }

            System.out.println(n);
            count(n-1);
        }


        /*--this is to the power of the exponent spot--------------------------------------------*/
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static long getPowers(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    /*ispy*/

    public static void ispy(String objectToFind, String hint){
        System.out.println("player1: this is your father i spy with my eyes something"+ hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player2: i dont see anything to help u better look here "+ guess);

        if (guess.equalsIgnoreCase(objectToFind)){
            System.out.println("you winz");
            return;
        }
        System.out.println("stop trying dumby");
        ispy(objectToFind,hint);

    }











}



/*-----------------------------------------------Notes------------------------------------------------*/
/*return type*/
//    public static returnType methodName([param1[, param2[, ...]]) {
//        // the statements of the method
//        // a return statement, if a return type is declared
//    }

/*return type*/
//    public static String sayHello(String name) {
//        return String.format("Hello, %s!", name);
//    }

/*Let's take a look at all the individual pieces of the method definition in the example above:

public -- this is the visibility modifier.

        This defines whether or not other classes can see this method. For now, just put public here.

static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.

        For now, we will define all of our methods as static. We'll explore this concept in more detail in the next lesson.

        String -- this is the return type of the method.

        In Java, all methods must define the type of the value they will return. If a method does not return anything, the special keyword void is used here.

        If a method defines a return type, it must have a return statement. It is a compile time error for a method that defines a return type to not return anything, or to return a value of a type other than the one that is specified.

        If a method's return type is void, it is a compile time error to return anything inside of the method; however, methods with a void return type can still use the return keyword to exit the method early.

        sayHello -- the name of the method.

        Method names follow the same rules as variable names.

        (String name) -- the parameter the method accepts.

        A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.

        Everything inside the curly braces is the body of the method.

        Here are some simple examples of methods:*/

//public static void sayHello(String greeting, String name) {
//        System.out.printf("%s, %s!\n", greeting, name);
//        }

//public static int returnThree() {
//        return 3;
//        }
