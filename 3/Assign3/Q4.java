package Assign3;
import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        List<Manager> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            String[] str = s.split(" ");
            Manager m = new Manager();
            m.id = Integer.parseInt(str[0]);
            m.name = str[1];
            m.department = str[2];
            m.salary = Integer.parseInt(str[3]);
            m.bonus = Integer.parseInt(str[4]);
            list.add(m);
        }
        Manager max = Collections.max(list, Comparator.comparingInt(Manager::totalSalary));
        for(Manager m: list){
            if(m.totalSalary() == max.totalSalary()){
                System.out.println(m.id+" "+m.name+" "+m.department+" "+m.salary+" "+m.bonus);
            }
        }
    }
}
class Employee{
    int id;
    String name;
    String department;
    int salary;
}
class Manager extends Employee{
    int bonus;
    public int totalSalary(){
        return salary+bonus;
    }
}
