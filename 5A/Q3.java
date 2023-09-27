package Assign5;
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{
    double sub1, sub2, sub3;
    A(double sub1, double sub2, double sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    double getPercentage(){
        return (sub1 + sub2 + sub3) / 3;
    }
}
class B extends Marks{
    double[] subs = new double[4];
    B(double sub1, double sub2, double sub3, double sub4){
        subs[0] = sub1;
        subs[1] = sub2;
        subs[2] = sub3;
        subs[3] = sub4;
    }
    double getPercentage(){
        double sum = 0;
        for(int i=0; i<4; i++){
            sum += subs[i];
        }
        return sum / 4;
    }
}
public class Q3 {
    public static void main(String[] args){
        A a = new A(50, 44, 76);
        B b = new B(90, 91, 92, 93);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}
