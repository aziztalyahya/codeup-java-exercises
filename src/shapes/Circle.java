package shapes;

import java.util.Scanner;


public class Circle {

    private double radius;
    Scanner scanner =  new Scanner(System.in).useDelimiter("\n");

    public Circle(String prompt){
        System.out.println(prompt);
        int radius = scanner.nextInt();
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double getCircumfrence(){
        double circumference = 2 *Math.PI * radius;
        return circumference;
    }
}
