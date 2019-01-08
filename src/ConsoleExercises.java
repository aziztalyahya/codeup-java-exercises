import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is %.2f%n", pi);
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        // #1
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        // #2
        System.out.println("Enter three words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.format("You entered %s, %s, %s%n", word1, word2, word3);
        // #3
        System.out.println("Please enter a sentence");
        String sentence = scanner.next();
        System.out.format("Your sentence is %s", sentence);
        System.out.println();

        System.out.println("What's the height?");
        String heightString = scanner.next();
        double height = Double.parseDouble(heightString);

        System.out.println("What's the length?");
        String lengthString = scanner.next();
        double length = Double.parseDouble(lengthString);

        System.out.println("Whats the width?");
        String widthString = scanner.next();
        double width = Double.parseDouble(widthString);

        double area = length * width;
        double perimeter = 2*length + 2*width;
        double volume = length * width * height;

        System.out.println("Area is: " + area);
        System.out.println("perimeter is: " + perimeter);
        System.out.println("The volume is: " + volume);

    }
}
