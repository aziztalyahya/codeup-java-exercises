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



}
