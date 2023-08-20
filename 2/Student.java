import java.util.Scanner;

public class Student {
    String rollNumber;
    String fullName;
    int height;
    int weight;

    public void readStudent(){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split(",");
        this.rollNumber = arr[0];
        this.fullName = arr[1];
        this.height = Integer.parseInt(arr[2]);
        this.weight = Integer.parseInt(arr[3]);
        scn.close();
    }
    public void displayStudent(){
        System.out.println(this.rollNumber+","+this.fullName+","+this.height+","+this.weight);
    }
}
