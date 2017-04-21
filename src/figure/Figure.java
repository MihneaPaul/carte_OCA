package figure;

/**
 * Created by Mihnea on 21.04.2017.
 */
public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1=a;
        dim2=b;
    }
    // area is now a abstract method
    abstract double area();
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1*dim2;
    }
}
class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        System.out.println("Rectangle Area is "+r.area());
        System.out.println("Triangle Area is "+t.area());
    }
}
