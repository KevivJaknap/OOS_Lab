package Assign5;
interface Playable{
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Volleyball");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing Basketball");
    }
}
public class Q8 {
    public static void main(String[] args){
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}
