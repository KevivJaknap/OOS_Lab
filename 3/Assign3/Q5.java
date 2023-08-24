package Assign3;
import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of patients:");
        int n = scn.nextInt();
        scn.nextLine();
        List<Patient> list = new ArrayList<>();
        String name;
        String id;
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of patient "+(i+1)+":");
            System.out.print("Name:");
            name = scn.nextLine();
            System.out.print("Patient ID:");
            id = scn.nextLine();
            Patient p = new Patient();
            p.name = name;
            p.id = id;
            list.add(p);
        }
        //sort in reverse order of age
        list.sort((p1, p2) -> p2.getAge() - p1.getAge());
        for(Patient p: list) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
class Person{
    String name;
}
class Patient extends Person{
    String id;

    int getAge(){
        String[] arr = id.split("-");
        return Integer.parseInt(arr[1]);
    }
}
