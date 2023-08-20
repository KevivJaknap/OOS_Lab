import java.util.*;
public class Q7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder ret = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                ret.append(Character.toLowerCase(c));
            }
            else{
                ret.append(c);
            }
        }
        System.out.println(ret);
    }

}
