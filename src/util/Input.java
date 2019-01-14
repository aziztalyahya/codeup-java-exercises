package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public String Input(){
        String userInput = getString();
        return userInput;
    }

    public String getString(){
        System.out.println("Please enter your input.");
        String userInput = scanner.next();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? y or n");
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
            System.out.println("The number must be between" + min + " and " + max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number within the min and max parameters");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput<= max){
            return userInput;
        } else{
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

}


