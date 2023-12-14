import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println(sub(1,3));
        System.out.println(mul(52,4));
        System.out.println(div(6,12));
        System.out.println(mod(6,12));


        System.out.println(range(1,10));

        System.out.println(factor());

        do{
            long result = factor();
            System.out.println("factor results"+ result);


        }while (confirm());

    }
/*Q1*/
    public static int add ( int num1, int num2){
        return num1 + num2;
    }
    public static int sub ( int num1, int num2){
        return num1 - num2;
    }
    public static int mul ( int num1, int num2){
        return num1 * num2;
    }
    /*you want to use double instead of int because non whole numbers*/
    public static double div ( double num1, double num2){
        return num1 / num2;
    }
    public static int mod ( int num1, int num2){
        return num1 % num2;
    }
/*Q2*/
//public static void range(int min, int max){
//    Scanner scanner= new Scanner(System.in);
//    System.out.println("enter a number between 1-10");
//    int num1 = scanner.nextInt();
//    if (num1>= 2&& num1 <= 3){
//        System.out.println("you got it");
//
//    }else{
//        System.out.println("try again");
//    }
//    scanner.close();
//}
    public static int range (int min, int max){
        System.out.print("enter a number between " + min +" and "+ max +"\n");
        Scanner scanner =new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
        return userInput;
        }
        return range(min,max);

    }

    /*Q3*/
//    public static String factor(String[] args){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter a number between 1-10");
//        int number = scanner.nextInt();
////        long factoral = factor(number);
////        System.out.println("factorial of " + number + " is "+ factoral);
////        return factoral;
//    }

    public static long factor(){
        int numToFactor = range(1,10);

        long currentSum =1;
        for (int counter = 1; counter < numToFactor; counter++) {
            currentSum *= counter;

        }
        return currentSum;
    }
    public static boolean confirm(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("would u like to play a game? (y/n)");
        String answer =scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }




}
