package Shapes;


public class Rectangle {

    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
         this.length = length;
        this.width = width;
    }

public double getArea(){
    return length * width;
}
public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public static void main(String[] args) {
Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.length);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
    }
}

