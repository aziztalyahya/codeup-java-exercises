import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Say something to bob, and see his response!");
        String message = scan.next();
        boolean answer = false;

        while(answer = false) {

                if (message.endsWith("?")) {
                    System.out.println("Sure");
                } else if (message.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (message.equals("")) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever");
                }

                System.out.println("Would you like to continue this fine conversation with bob? enter y or n");
                String continueConvo = scan.next();
                if (continueConvo.equals("y")) {
                    answer = false;
                }
                if (continueConvo.equals("n")) {
                    answer = true;
                }
            }
    }
}
