import java.util.Scanner;

public class extraMethodsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.println(firstChar("The sun is hot"));
//        System.out.println(secondChar("The sun is hot"));
//        System.out.println(secondToLastChar("The sun is hot"));
//        System.out.println(lastChar("The sun is hot"));
//        System.out.println(userWantsToContinue());
//        System.out.println(isEven(3));
//        System.out.println(countOdds(1, 11));
//        System.out.println(countEvens(1,100));
//        System.out.println(isVowel("a"));
//        System.out.println(hasVowels("www.www.wwwa"));
//        System.out.println(countVowels("Aziz"));
        fizzBuzz(1, 100);

    }

    public static char firstChar(String sentence) {
        char firstChar = sentence.charAt(0);
        return firstChar;
    }

    public static char secondChar(String sentence){
        char secondChar = sentence.charAt(1);
        return secondChar;
    }

    public static char lastChar(String sentence){
        char lastChar = sentence.charAt(sentence.length()-1);
        return lastChar;
    }

    public static char secondToLastChar(String sentence){
        char secondToLastChar = sentence.charAt(sentence.length()-2);
        return secondToLastChar;
    }

    public static boolean userWantsToContinue(){
        boolean yesOrNo = false;
        System.out.println("Would you like to continue? Enter yes or no");
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            yesOrNo = false;
        }
        if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
            yesOrNo = true;
        }
        return yesOrNo;
    }

    public static boolean isEven(int number){
        boolean isEven = false;

        if (number % 2 == 0){
            isEven = true;
        }
        return isEven;
    }

    public static boolean isOdd(int number){
        boolean isOdd = false;

        if (number % 2 != 0){
            isOdd = true;
        }
        return isOdd;
    }

    public static int countOdds(int start, int end){
        int counter = 0;
        for (int i =start; i <= end; i++){
            if (isOdd(i)){
                counter++;
            }
        }
        return counter;
    }

    public static int countEvens(int start, int end){
        int counter = 0;
        for(int i = start; i <= end; i++){
            if(isEven(i)){
                counter++;
            }
        }
        return counter;
    }

    public static boolean isVowel (String input){
         return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");

    }

    public static boolean hasVowels (String input){
        boolean hasVowels = false;
        for(int i = 0; i< input.length(); i++){
            if(isVowel(input.charAt(i) + "")){
                hasVowels = true;
            }
        }
        return hasVowels;
    }

    public static int countVowels (String input){
        int vowelCount = 0;
        for(int i = 0; i< input.length(); i++){
            if(isVowel(input.charAt(i) + "")){
                vowelCount++;
            }
            }
        return vowelCount;
    }

    public static int fizzBuzz (int min, int max){
        if (min > max) {
            System.out.println("All done!");
        } else if (min % 5 == 0 && min % 3 == 0){
            System.out.println(min);
            System.out.println("Fizzbuzz");
            min++;
            fizzBuzz(min, max);
        } else if (min % 3 == 0){
            System.out.println(min);
            System.out.println("Fizz");
            min++;
            fizzBuzz(min, max);
        } else if (min % 5 == 0){
            System.out.println(min);
            System.out.println("Buzz");
            min++;
            fizzBuzz(min, max);
        } else {
            System.out.println(min);
            min++;
            fizzBuzz(min, max);
        }
        return max;
    }

    public static boolean isPrime(int number){
        boolean primeNumber = false;

        return primeNumber;
    }
}
