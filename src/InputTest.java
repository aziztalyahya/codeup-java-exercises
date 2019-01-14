import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();
        myInput.getString();
        myInput.yesNo();
        myInput.getInt(1, 100);
        myInput.getInt();
        myInput.getInt("Please enter an integer");
        myInput.getDouble(1.0,100.0);
        myInput.getDouble("Please enter a double");
        myInput.getDouble();

    }
}
