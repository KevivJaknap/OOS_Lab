package Assign5;

abstract class Parent{
    abstract void message();
}
class first extends Parent{
    @Override
    void message(){
        System.out.println("This is first class");
    }
}
class second extends Parent{
    @Override
    void message(){
        System.out.println("This is second class");
    }
}
public class Q1 {
    public static void main(String[] args){
        Parent f = new first();
        Parent s = new second();
        f.message();
        s.message();
    }
}
