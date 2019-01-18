package shapes;

public class Square extends Quadrilateral implements Measurable{


    public Square(int side) {
        super(side, side);
    }


    // abstract methods HAVE TO BE INSTANTIATED IN THE SUBCLASS / child class
    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }


    //    private double side;
//
//
//    public Square(double length, double width) {
//        super(length, width);
//    }
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea(){
//        double area = Math.pow(this.side, 2);
//        return area;
//    }
//    @Override
//    public double getPerimeter(){
//        double perimeter = 4 * this.side;
//        return perimeter;
//    }

}
