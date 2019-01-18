package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }




//    protected double length;
//    protected double width;
//
//    public Rectangle(){
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        double area = this.length *  this.width;
//        return area;
//    }
//    public double getPerimeter(){
//        double perimeter = (2 * this.length) + (2 * this.width);
//        return perimeter;
//    }
}
