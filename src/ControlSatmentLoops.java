import java.util.Scanner;
public class ControlSatmentLoops {
    public static void main(String[] args) {
        /*boolean xepressions*/
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println();
        System.out.println(2 <= 2);

/*logical Operators----------------------------------------------------------*/

        boolean isLoggedIn =true;
        boolean isAdmin =true;
        boolean isAuthor = true;

        if (isLoggedIn && isAdmin) { // user is logged in *and* is an admin
            // show the admin panel
            System.out.println("look at me look i am admin now");
        }
        System.out.println((true == true) || (true == false));

        if (isAdmin || isAuthor) { // user is an admin *or* user is the author
            // edit the content
        }

//        if (!loggedIn) { // user is *not* logged in
//            // redirect to login page
//        }
//
//// Determine if the input submitted from a site registration form is valid
//        boolean inputHasErrors = username.isEmpty()
//                || email.isEmpty()
//                || password.isEmpty()
//                || (! password.equals(passwordConfirmation));
/*string comparison ------------------------------------------------------------------------*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

// Don't do this!
//        boolean confirmation = userInput == "y";

        // Do this instead
        boolean confirmation = userInput.equals("y");

        System.out.println(userInput.equals ("y"));

/*----------------------------------------------control Structure--------------------------------*/

        boolean lectureTime =false;

        if (lectureTime) {
            System.out.println("learning Something ");

        }else {
            System.out.println("this will always run");
        }

        boolean learningJava =true;
        boolean learningJS =false;
        boolean learningHTML =false;

        if (learningHTML && learningJava && learningJS){
            System.out.println("learning JS, html, Java");

        }else if (learningHTML){
            System.out.println("learning html");

        } else if (learningJS){
            System.out.println("learning JS");

        }else if (learningJava){
            System.out.println("learning Java");

        } else {
            System.out.println("learning something else");
        }

/*---------------------------------Switch case-------------------------------------------------*/

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;


        }

        /*------------------while =---------------*/

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        /*---------------for loop----------------*/
//        for(/* init */; /* condition */; /* update */) {
//            // statements
//        }

        for(int i = 0; i < 20; i++ ) {
            System.out.println("i got " + i + "bones to pick");
        if (i == 7 ){
            System.out.println("who is the lucky one");
            continue;
        }if (i == 9){
            System.out.println("break");
            break;
            }

        }


    }

}
