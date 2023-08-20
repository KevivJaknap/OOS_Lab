import java.util.*;

public class Q8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=0;
        List<Bus> array = new ArrayList<Bus>();
        int busno;
        String from;
        String to;
        int distance;
        char type;
        while (n != 3){
            System.out.println("1-Add details");
            System.out.println("2-Show details");
            System.out.println("3-Exit");
            n = scn.nextInt();
            scn.nextLine();
            if(n == 1){
                System.out.println("Enter bus details (busno, from, to, distance, type)");
                String str = scn.nextLine();
                String[] parts = str.split("\\s+");
                if(parts.length == 4){
                    busno = Integer.parseInt(parts[0]);
                    from = parts[1];
                    to = parts[2];
                    distance = Integer.parseInt(parts[3]);
                    type = 'O';
                }
                else{
                    busno = Integer.parseInt(parts[0]);
                    from = parts[1];
                    to = parts[2];
                    distance = Integer.parseInt(parts[3]);
                    type = parts[4].charAt(0);
                }
                Bus b = new Bus(busno, from, to, distance, type);
                array.add(b);
            }
            else if(n == 2){
                System.out.println("Bus Details (busno, from, to, distance, type)");
                for(int i=0;i<array.size();i++){
                    array.get(i).Show();
                }
            }

        }
    }
}
