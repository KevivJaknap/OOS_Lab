import java.util.*;
public class Q5 {
    static int dot(int[][] arr1, int[][] arr2, int s, int row, int col){
        int sum = 0;
        for(int i=0;i<s;i++){
            sum += arr1[row][i]*arr2[i][col];
        }
        return sum;
    }
    static int[][] Prod(int[][] arr1, int[][] arr2, int a, int b, int m, int n){
        if(b != m){
            System.out.println("Not possible");
            return null;
        }
        int[][] arr = new int[a][n];
        for(int i=0;i<a;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = dot(arr1, arr2, b, i, j);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[m][n];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        int[][] arr = Prod(arr1, arr2, a, b, m, n);
        if(arr != null) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
