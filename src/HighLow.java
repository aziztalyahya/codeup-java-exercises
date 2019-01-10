import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
            numberGame();
    }

    public static int numberGame(){
        int randomNum = (int) (Math.random() * 100) + 1;

        System.out.println("Your random number is: " + randomNum);

        System.out.println("Please guess what number you got, and we will say if your to high, to low, or just right!");
        System.out.println("Hi User! You have 10 tries to guess this, You can do it!");
        boolean finishGame = false;
        int tries = 1;
        do {
            System.out.println("You are on try: " + tries);
            System.out.println("Please enter a number");
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            int numberChosen = scan.nextInt();

            if ( numberChosen > randomNum) {
                System.out.println("This number is to high");
            }
            if (numberChosen < randomNum) {
                System.out.println("This number is to low");
            }
            if (randomNum == numberChosen) {
                System.out.println("Correct a mundo!");
                finishGame = true;
            }
            tries++;
            if (tries > 10){
                System.out.println("Sorry, you ran out of tries");
                finishGame = true;
            }
            } while (!finishGame);

        return randomNum;
    }
}
