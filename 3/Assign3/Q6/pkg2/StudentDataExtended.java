package Assign3.Q6.pkg2;
import Assign3.Q6.pkg1.StudentData;

import java.util.*;
public class StudentDataExtended extends Assign3.Q6.pkg1.StudentData{
    private String location;
    public void setLocation(String location){
        this.location = location;
    }
    List<StudentDataExtended> list = new ArrayList<>();
    public void addDetails(String id, String name, String location){
        StudentDataExtended s = new StudentDataExtended();
        s.setId(id);
        s.setName(name);
        s.setLocation(location);
        list.add(s);
    }
    public void display(){
        list.sort(Comparator.comparing(StudentData::getId));
        for(StudentDataExtended s: list){
            System.out.println(s.getId()+" "+s.getName()+" "+s.location);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        StudentDataExtended sde = new StudentDataExtended();
        System.out.print("Enter number of students:");
        int n = scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of student "+(i+1)+":");
            String s = scn.nextLine();
            String[] str = s.split(" ");
            sde.addDetails(str[0], str[1], str[2]);
        }
        System.out.println("The Student details are:");
        sde.display();
    }
}
