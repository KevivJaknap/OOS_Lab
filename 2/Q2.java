import java.util.*;
public class Q2 {
    static int count(String s){
        boolean found = false;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' ' && !found){
                count += 1;
                found = true;
            }
            else if(s.charAt(i) == ' '){
                found = false;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int c = count(s);
        System.out.println("Words count is "+ c);
        for(int i=0;i<s.length();i++){
            System.out.println("'"+s.charAt(i)+"' "+(int)s.charAt(i));
        }
        scn.close();
    }
}
