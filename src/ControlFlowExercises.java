import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1a
        int i = 5;
        while (i <= 15){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //1b
        long num = 2;
        do {
            System.out.print(num + " ");
            num = num * num;

        } while (num < 10000000);

        System.out.println("What Number would you like to go to?");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int scanInt = Integer.parseInt(scan.next());
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (i=0; i<=scanInt; i++){
            int iSquared = i * i;
            int iCubed = i * i * i;
            System.out.println(i + "      | " + iSquared + "       | " + iCubed);
        }

    }
}
