import java.util.*;
class Q1{
    static int count(List<Integer> array){
        int count = 0;
        int max = (int) Math.pow(2, 31);
        array.add(max);
        for(int i=0;i<array.size()-1;i++){
            if(array.get(i) != array.get(i+1)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        System.out.println(count(arr));
        scn.close();
    }
}