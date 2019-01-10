import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println(Addition(1, 5));
        System.out.println(Subtraction(5, 3));
        System.out.println(Multiplication(5,3));
        System.out.println(Division(10, 2));
        System.out.println(Modulus(10, 5));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

        System.out.println(factorial(userInput));
        dice();
    }

    public static int Addition (int num1,int num2){
        return num1 + num2;
    }

    public static int Subtraction (int num1,int num2){
        return num1 - num2;
    }

    public static int Multiplication (int num1,int num2){
        return num1 * num2;
    }
    public static int Division (int num1,int num2){
        return num1 / num2;
    }
    public static int Modulus (int num1,int num2){
        int moddedNum = 0;
        if (num2 == 0){
            System.out.println("Unable to do this");
        } else {
           moddedNum += (num1 % num2);
        }
        return moddedNum;
    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int myNumber = scan.nextInt();

        if (myNumber >= min && myNumber<=max){
            System.out.println("This number is in range!");
        } else {
            System.out.println("This is not a valid number, let's try again.");
            getInteger(1, 10);
        }
        return myNumber;
    }

    public static long factorial(long num){
//        getInteger(1, 10);
        if(num <= 1){
            System.out.println(num + " = ");
            return 1;
        } else
            System.out.println(num + " * ");
            return num * factorial(num -1);
    }


    public static int dice(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("How many sides are on the Dice?");
        int userInput =scan.nextInt();
        int sidesOfDice1 = userInput;
        int sidesOfDice2 = userInput;
        System.out.println("Would you like to roll the dice? y or n");
        String rollDice = scan.next();
        if (rollDice.equalsIgnoreCase("y")){
            boolean answer = false;

            do {
                int dice1Rolled = (int) (Math.random() * sidesOfDice1) +1;
                int dice2Rolled = (int) (Math.random() * sidesOfDice2) +1;
                System.out.println(dice1Rolled);
                System.out.println(dice2Rolled);
                System.out.println("Would you like to roll again?");
                String reRoll = scan.next();
                if (reRoll.equalsIgnoreCase("y")){
                    answer = true;
                } if (reRoll.equalsIgnoreCase("n")){
                    answer = false;
                    }
                }while (answer);

        } else if(rollDice.equalsIgnoreCase("n")) {
            System.out.println("Okay then, program ending");
        } else {
            System.out.println("Not a valid input, restarting program");
            dice();
        }


        return sidesOfDice1;
    }
}
