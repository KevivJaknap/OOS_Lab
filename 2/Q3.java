import java.util.*;
// ask about duplicate chars
public class Q3 {
    static String foo(String s){
        Set<Character> set = new LinkedHashSet<Character>();
        String ret = "";
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                ret += s.charAt(i);
                set.add(s.charAt(i));
            }
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(foo(s));
        scn.close();
    }
}
