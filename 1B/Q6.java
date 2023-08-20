import java.util.*;
public class Q6 {
    static int find(int[] arr, int s){
        if(s < 2){
            return -1;
        }
        int first, second;
        if(arr[0] > arr[1]){
            first = arr[0];
            second = arr[1];
        }
        else{
            first = arr[1];
            second = arr[0];
        }
        for(int i=2;i<s;i++){
            if(arr[i] > second){
                if(arr[i] > first){
                    second = first;
                    first = arr[i];
                }
                else{
                    second = arr[i];
                }
            }
        }
        return second;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int output = find(arr, n);
        if(output == -1){
            System.out.println("Not enough elements");
        }
        else{
            System.out.println(output);
        }
    }
}
