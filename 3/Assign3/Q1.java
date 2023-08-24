package Assign3;
import java.util.Scanner;
public class Q1 {
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of nodes:");
        int n = scn.nextInt();
        Node dummy = new Node('0');
        Node curr = dummy;
        for(int i=0;i<n;i++){
            System.out.print("Enter the data in Node"+(i+1)+":" );
            curr.next = new Node(scn.next().charAt(0));
            curr = curr.next;
        }
        Node head = dummy.next;
        head = reverse(head);
        System.out.println("The reversed list is:");
        Node temp;
        for(temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("->");
            }
        }
    }
}
class Node {
    char data;
    Node next;
    Node(char data){
        this.data = data;
        this.next = null;
    }
}