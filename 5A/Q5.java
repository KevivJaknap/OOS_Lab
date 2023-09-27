package Assign5;

abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){
        System.out.println("Dogs bark");
    }
}
class Dogs extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){
        System.out.println("Dogs bark");
    }
}
public class Q5 {
    public static void main(String[] args){
        Cats c = new Cats();
        Dogs d = new Dogs();
        c.cats();
        d.dogs();
    }
}
