import java.util.*;
public class Q1 {
    static boolean check(String x){
        int l = x.length();
        for(int i=0;i<l/2;i++){
            if(x.charAt(i) != x.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if(check(s)){
            System.out.println("Yes, it is a palindrome");
        }
        else{
            System.out.println("No, it is not a palindrome");
        }
    }
}
