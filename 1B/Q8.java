import java.util.*;
public class Q8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder ret = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            ret.append(s.charAt(i));
        }
        System.out.println(ret);
        scn.close();
    }
}
