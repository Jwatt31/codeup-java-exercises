import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        /*-------------------------------------------Q1---------------------------------------------------*/

//        int e = 5;
//        while (e <= 15) {
//            System.out.println(e);
//            e++;
//        }
//
//
//        int j = 0;
//        do  {
//            System.out.println(j);
//            j += 2;
//
//        } while (j <= 100);
//
//
//        int k=100;
//        do {
//            System.out.println(k);
//            k -= 5;
//
//        } while (k >= -10);
//
//
//        long d=2;
//        do {
//            System.out.println(d);
//            d *=d;
//
//        }while (d <= 1_000_000);
//
//
//        for (int i =100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//
//        for (long i = 2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }
//
//
//
//        /*-----------------------------------------Q2---------------------------------------------*/
//
//        for (int fi = 1; fi <= 100; fi++) {
//            System.out.println(fi);
//            if (fi % 3 == 0 && fi % 5 == 0) {
//                System.out.println("fizzBuzz");
////                continue;
//            } else if (fi % 5 == 0) {
//                System.out.println("buzz");
////                continue;
//            } else if (fi % 3 == 0) {
//                System.out.println("fizz");
////                break;
//            }else {
//                System.out.println(fi);
//            }
//        }


        /*-------------------------------------Q3-----------------------------------------------*/

        Scanner scanner = new Scanner(System.in);
        boolean confirm;

//        do {
//            System.out.println("enter a number between 1-5: ");
//            int userInput = scanner.nextInt();
//            System.out.println("here is your table");
//            System.out.println("Number | Squar | Cubed");
//            System.out.println("_______ | _______ | _______ ");
//
//            for (int i = 1; i <= userInput; i++){
//                int squared = i * i;
//                int cube = i * i * i;
//
//                System.out.printf("%-7s|%-9s|%-6s\n",i,squared,cube);/* % is needed to format - means from the left 7 is the spaces */
//            }
//            System.out.println("confirm y/n");
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//        }while (confirm);


        /*-------------------------------------Q4-----------------------------------------------*/

        do {

            System.out.println("enter your grade: ");
            int userGrade = scanner.nextInt();
            if (userGrade >= 88 && userGrade <= 100){
                System.out.println("A");
            } else if (userGrade >= 80&& userGrade <= 87){
                System.out.println("B");
            } else if (userGrade >= 67&& userGrade <= 79){
                System.out.println("C");
            } else{
                System.out.println("F");
            }

            System.out.println("confirm y/n");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while (confirm);
        System.out.println("next time on your Grades *play outtro music....");


    }

}
