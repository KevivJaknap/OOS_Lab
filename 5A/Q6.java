package Assign5;

abstract class Shape{
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}
class Area extends Shape{
    double RectangleArea(double length, double breadth){
        return length * breadth;
    }
    double SquareArea(double side){
        return side * side;
    }
    double CircleArea(double radius){
        return 3.14 * radius * radius;
    }
}
public class Q6 {
    public static void main(String[] args){
        Area a = new Area();
        System.out.println(a.RectangleArea(5, 6));
        System.out.println(a.SquareArea(7));
        System.out.println(a.CircleArea(8));
    }
}
