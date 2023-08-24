package Assign3;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DepartmentMeetingScheduler obj = new DepartmentMeetingScheduler();
        int choice = 0;
        do {
            System.out.println("1.Schedule meeting");
            System.out.println("2.List Meetings on a date");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            choice = scn.nextInt();
            scn.nextLine();
            if (choice == 1) {
                System.out.print("Title - ");
                String title = scn.nextLine();
                System.out.print("Date - ");
                String date = scn.nextLine();
                System.out.print("Start Time - ");
                String startTime = scn.nextLine();
                System.out.print("End Time - ");
                String endTime = scn.nextLine();
                System.out.print("Description - ");
                String description = scn.nextLine();
                Meeting meet = new Meeting();
                meet.title = title;
                meet.date = date;
                meet.startTime = startTime;
                meet.endTime = endTime;
                meet.description = description;
                obj.scheduleMeeting(meet);
            } else if (choice == 2) {
                System.out.print("Enter date - ");
                String date = scn.nextLine();
                obj.displayMeetings(date);
            }
        } while (choice != 3);
    }
}
class DepartmentMeetingScheduler{
    public List<Meeting> list = new ArrayList<>();

    void scheduleMeeting(Meeting newMeet){
        if(checkCollision(newMeet)){
            System.out.println("Collision| Already another meet is scheduled.");
        }
        else{
            list.add(newMeet);
            System.out.println("Scheduled successfully");
        }
    }

    void displayMeetings(String date){
        System.out.println("Meetings on "+date);
        for(Meeting meet: list){
            if(meet.date.equals(date)){
                System.out.println(meet.title+","+meet.startTime+","+meet.endTime+","+meet.description);
            }
        }
    }

    boolean checkCollision(Meeting newMeet){
        for(Meeting meet: list){
            if(newMeet.startTime.compareTo(meet.startTime) >= 0 && newMeet.startTime.compareTo(meet.endTime) <= 0){
                return true;
            }
        }
        return false;
    }
}
class Meeting{
    String title;
    String date;
    String startTime;
    String endTime;

    String description;
}
