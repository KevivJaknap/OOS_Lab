package Assign5;

abstract class Abstract{
    Abstract(String s){
        System.out.println("This is a constructor");
        System.out.println(s);
    }
    abstract void a_method();
    void non_abstract(){
        System.out.println("This is a normal method");
    }
}
class SubClass extends Abstract{
    SubClass(String s){
        super(s);
    }
    void a_method(){
        System.out.println("This is an abstract method");
    }
}
public class Q4 {
    public static void main(String[] args){
        SubClass obj = new SubClass("Hello");
        obj.a_method();
        obj.non_abstract();
    }
}
