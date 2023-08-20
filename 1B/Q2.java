import java.util.*;
public class Q2 {
    static boolean isPrime(int x){
        for(int i=2;i*i<=x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    static List<Integer> Primes(int a, int b){
        List<Integer> array = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                array.add(i);
            }
        }
        return array;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        List<Integer> arr = Primes(a, b);
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
