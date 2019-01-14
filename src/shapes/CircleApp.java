package shapes;

public class CircleApp {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Please enter the radius");
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumfrence());
    }
}
