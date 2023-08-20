import java.util.*;
public class Q5 {
    String name;
    boolean isStudent;
    boolean isVeg;
    public Q5(String name, boolean s, boolean veg){
        this.name = name;
        this.isStudent = s;
        this.isVeg = veg;
    }
    public int calc(int days){
        float bill;
        if(this.isVeg){
            bill = days*100;
        }
        else{
            bill = days*120;
        }
        if(!this.isStudent){
            bill += bill*5/100;
        }
        return (int)bill;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of inmates: ");
        int n = scn.nextInt();
        Q5[] arr = new Q5[n];
        String name;
        String isVeg;
        String isStudent;
        for(int i=0;i<n;i++){
            System.out.print("Enter the inmate details: ");
            name = scn.next();
            isStudent = scn.next();
            isVeg = scn.next();
            boolean veg = isVeg.equals("veg");
            boolean student = isStudent.equals("student");
            arr[i] = new Q5(name, student, veg);
            System.out.println("Enter the number of days: ");
            int days = scn.nextInt();
            System.out.println(arr[i].calc(days));
        }   
        scn.close();
    }
}
