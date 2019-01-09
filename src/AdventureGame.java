import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter your Hero name!");
        String heroName = scan.next();
        System.out.println("Would you like to start the game " + heroName + "?");
        String startGameAnswer = scan.next();



        if (startGameAnswer.equalsIgnoreCase("yes")){
            int heroHealth = 150;
            int enemyHealth = 100;
            int potion = 5;
            int enemyDamage = (int)(Math.random() * 11 + 10);
            int heroDamage = (int)(Math.random() * 11 + 10);
            boolean gameStarted = false;

            do{
//                gameStarted = enemyHealth >= 0 || heroHealth >= 0;
                System.out.println("Hero: " + heroName);
                System.out.println("Health: " + heroHealth);
                System.out.println("Damage: " + heroDamage);
                System.out.println("---------------------");
                System.out.println("Troll: Grendel");
                System.out.println("Health: " + enemyHealth);
                System.out.println("Damage: " + enemyDamage);

                System.out.println("What would you like to do?");
                System.out.println("1) Attack");
                System.out.println("2) Drink Potion");
                System.out.println("3)Run");
                String playerOption = scan.next();

                if (Integer.parseInt(playerOption) == 1){
                    heroHealth -= enemyDamage;
                    enemyHealth -= heroDamage;
                } else if (Integer.parseInt(playerOption) == 2){
                    heroHealth += potion;
                    enemyHealth += potion;
                } else if (Integer.parseInt(playerOption) == 3){
                    System.out.println("You can't run you coward!");
                } else {
                    System.out.println("Invalid Input");
                }

                if (heroHealth <= 0){
                    gameStarted = true;
                    System.out.println("The hero is dead!");
                }
                if (enemyHealth <=0){
                    gameStarted = true;
                    System.out.println("The troll is dead!");
                }


            } while (!gameStarted);

        } else {
            System.out.println("Game Not Started");
        }


    }
}
