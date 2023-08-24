package Assign3;
import java.util.*;
public class Q2 {
    public HashMap<Integer, Item> map = new HashMap<>();

    void addItem(int id, String name, int price){
        Item item = new Item();
        item.id = id;
        item.name = name;
        item.price = price;
        map.put(id, item);
    }
    void generateInvoice(List<List<Integer>> arr){
        System.out.println("**********INVOICE**********");
        int total = 0;
        for(List<Integer> l: arr){
            int id = l.get(0);
            int quantity = l.get(1);
            Item item = map.get(id);
            System.out.println(item.id+","+item.name+","+item.price+","+quantity);
            total += item.price*quantity;
        }
        System.out.println("Total: "+total);
        System.out.println("***************************");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.println("Enter the available items line by line, type OKAY at the end of the list:");
        while(true){
            String s = scn.nextLine();
            if(s.equals("OKAY")){
                break;
            }
            String[] arr = s.split(" ");
            obj.addItem(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
        }
        int choice = 0;
        do{
            System.out.println("1.Add invoice");
            System.out.println("2.Exit");
            System.out.println("Choice:");
            choice = scn.nextInt();
            scn.nextLine();
            if(choice == 1){
                System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                List<List<Integer>> list = new ArrayList<>();
                while(true){
                    String s = scn.nextLine();
                    if(s.equals("OKAY")){
                        break;
                    }
                    String[] arr = s.split(" ");
                    List<Integer> l = new ArrayList<>();
                    l.add(Integer.parseInt(arr[0]));
                    l.add(Integer.parseInt(arr[1]));
                    list.add(l);
                }
                obj.generateInvoice(list);
            }
        }while(choice != 2);
    }
}

class Item{
    String name;
    int id;
    int price;
}
