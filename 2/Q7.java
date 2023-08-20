import java.util.*;
public class Q7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scn.nextInt();
        Student[] array = new Student[n];
        System.out.println("Enter details (rollNumber, fullName, height, weight");
        for(int i=0;i<n;i++){
            array[i] = new Student();
            array[i].readStudent();
        }
        for(int i=0;i<n;i++){
            array[i].displayStudent();
        }
    }
}
