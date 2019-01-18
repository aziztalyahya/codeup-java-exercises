package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);
        Measurable myShape2 = new Square(5);

        System.out.println("The perimeter of box1 is: " + myShape.getPerimeter());
        System.out.println("The area of box1 is: " + myShape.getArea());
        System.out.println("The perimeter of box2 is: " + myShape2.getPerimeter());
        System.out.println("The area of box2 is: " + myShape2.getArea());
        System.out.println(((Rectangle) myShape).getLength());
        ((Square) myShape2).setLength(10);
        ((Square) myShape2).setWidth(10);
        System.out.println(myShape2.getPerimeter());

    }
}
