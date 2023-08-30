package Assign4A;

import java.util.Scanner;

class Point{
    int abscissa;
    int ordinate;

    public Point(int abscissa, int ordinate){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }
    public Point midPoint(Point p1, Point p2){
        int abscissa = (p1.abscissa + p2.abscissa)/2;
        int ordinate = (p1.ordinate + p2.ordinate)/2;
        return new Point(abscissa, ordinate);
    }

}
public class Q6 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);
        Point p1 = new Point(x, y);
        input = sc.nextLine().split(",");
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);
        Point p2 = new Point(x, y);
        Point p3 = p1.midPoint(p1, p2);
        System.out.println(p3.abscissa +","+p3.ordinate);
    }
}
