import java.util.*;
public class Q9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String k = scn.nextLine();
        boolean flag = true;
        if(s.length() != k.length()){
            flag = false;
        }
        else{
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) != k.charAt(i)){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}
