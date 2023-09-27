package Assign5;
interface Shape2{
    double getArea();
}
class Rectangle implements Shape2{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return length * breadth;
    }
}
class Square implements Shape2{
    double side;
    Square(double side){
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
}
class Circle implements Shape2{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
public class Q7 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(5, 6);
        Square s = new Square(7);
        Circle c = new Circle(8);
        System.out.println(r.getArea());
        System.out.println(s.getArea());
        System.out.println(c.getArea());
    }
}
