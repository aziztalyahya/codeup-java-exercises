import util.Input;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        Input myInput = new Input();
        myInput.yesNo("Would uou like to enter a number?");
//        myInput.getString();
//        myInput.yesNo();
//        myInput.getInt(1, 100);
        System.out.println("Enter a number");
          myInput.getInt();
//          myInput.getInt("Enter an integer");
//        myInput.getInt("Please enter an integer");
//        myInput.getDouble(1.0,100.0);
//        myInput.getDouble("Please enter a double");
//        myInput.getDouble();

    }
}
