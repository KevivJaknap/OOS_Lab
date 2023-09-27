package Assign5;

abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{
    void getBalance(){
        System.out.println("$100");
    }
}
class BankB extends Bank{
    void getBalance(){
        System.out.println("$150");
    }
}
class BankC extends Bank{
    void getBalance(){
        System.out.println("$200");
    }
}
public class Q2 {
    public static void main(String[] args){
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
