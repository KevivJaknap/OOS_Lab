import java.util.*;
public class Q4 {
    static int find(List<Integer> arr, int target){
        int left = 0, right = arr.size();
        int mid = 0;
        while(left < right){
            mid = left + (right-left)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            else if (arr.get(mid) < target){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            array.add(scn.nextInt());
        }
        int target = scn.nextInt();
        int index = find(array, target);
        if(index == -1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at "+index);
        }
    }
}
