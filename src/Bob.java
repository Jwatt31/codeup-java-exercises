import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean confirm;

        do {

            System.out.println("would");
            String initiate = sc.next();

            if (initiate.equalsIgnoreCase("y")) {

                System.out.print("what would u like to say?");
                String userInput = sc.nextLine();

                if (userInput.endsWith("?")) {
                    System.out.println("Sure");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.isEmpty()) {
                    System.out.println("Fine. Be that way");
                } else {
                    System.out.println("Whatever.");
                }
            }else {
                break;
            }

            System.out.println("continue [y/n]");
            confirm =sc.nextLine().equalsIgnoreCase("y");



        }while (confirm);
        System.out.println("good chat");
    }
}
