package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;


    public double getPerimeter(){
        return 2*length + 2*width;
    }
     public double getArea(){
        return length * width;
    }

     // constructor
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    abstract void setLength(int length);
    abstract void setWidth(int width);



}
