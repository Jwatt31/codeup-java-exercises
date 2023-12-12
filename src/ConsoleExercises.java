import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("Formatted Pi: %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        double userInput = scanner.nextInt();

        System.out.println("you entered:"+ userInput);

//        Scanner scanner =new Scanner(System.in);
        System.out.println("enter first word: ");
        String firstWord = scanner.next();

        System.out.println("enter second word: ");
        String secondWord = scanner.next();

        System.out.println("enter third word: ");
        String thirdWord = scanner.next();

        System.out.println("you entered" + " " + firstWord + " " + secondWord + " " + thirdWord);

        Scanner scanner2 =new Scanner(System.in);
        System.out.println("enter 3 words");
        String input1 =scanner2.next();
        String input2 =scanner2.next();
        String input3 =scanner2.next();
        System.out.printf("thees are the entre: %n %s%n %s%n %s%n", input1, input2, input3);

        Scanner scanner3 =new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String wordsL =scanner3.nextLine();

        System.out.printf("here is that word %n %s%n", wordsL);

        System.out.println("length: ");
        double lengthEX = scanner.nextInt();
        System.out.println("width: ");
        double widthEX = scanner.nextInt();

        double area = lengthEX * widthEX;
        double parimater = (lengthEX * 2) + (widthEX * 2) ;

        System.out.println("enter the Length: ");
        double userLength = scanner.nextInt();

        System.out.println("enter the Height: ");
        double userHeight = scanner.nextInt();

         double userAnsw = userLength *= userHeight;
         double userAnsw2 = (userLength * 2) + (userHeight * 2);

        System.out.println(userAnsw);
        System.out.println(userAnsw2);



    }
}
