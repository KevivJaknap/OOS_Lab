import java.util.*;
public class Q4 {
    static int maxPalindrome(String s){
        int n = s.length();
        int max = -10;
        for(int i=0;i<n;i++){
            for(int j=0;j<1+n/2;j++){
                if(i-j >= 0 && i+j < n && s.charAt(i+j) == s.charAt(i-j)){
                    max = Math.max(max, 2*j+1);
                }
                else{
                    break;
                }
            }
        }
        return (max-1)/2;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String n = "";
        for(int i=0;i<s.length();i++){
            n += "#"+s.charAt(i);
        }
        n += "#";
        System.out.println(maxPalindrome(n));
        scn.close();
    }
}
