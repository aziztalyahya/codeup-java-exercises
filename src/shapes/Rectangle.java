package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area = this.length *  this.width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (2 * this.length) + (2 * this.width);
        return perimeter;
    }
}
