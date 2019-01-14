package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public String getString(){
        String userInput = scanner.next();
        return userInput;
    }

    public boolean yesNo(){
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Please enter a number within the min and max parameters");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput<= max){
            return userInput;
        } else{
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getInt(double min, double max){
        System.out.println("Please enter a number within the min and max parameters");
        double userInput = scanner.nextInt();
        if (userInput >= min && userInput<= max){
            return userInput;
        } else{
            return getInt(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

}


