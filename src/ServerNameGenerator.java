import java.util.Scanner;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] arrayOfNouns = {"tooth", "dog", "cat", "country", "boy", "girl", "eye"};
        String[] arrayOfAdjectives = {"fat", "smelly", "pink", "ugly", "cold", "golden", "broken"};
        boolean continueLoop;

        do {
            System.out.print("Here is your server name: ");
            System.out.print(returnRandomElement(arrayOfAdjectives));
            System.out.print("-");
            System.out.print(returnRandomElement(arrayOfNouns));
            System.out.println("");
            System.out.println("Would you like another server name?");
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            String myInput = scanner.next();
            if (myInput.equalsIgnoreCase("y") || myInput.equalsIgnoreCase("yes")) {
                continueLoop = true;
            } else {
                continueLoop = false;
            }
        } while (continueLoop);



    }

    public static String returnRandomElement(String[] myArray) {
        int randomNum = (int) (Math.random() *6) +1;
        return myArray[randomNum];
    }


}
