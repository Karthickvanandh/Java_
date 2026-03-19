package Array;
import java.util.*;

public class addMatrix {
    public static int[][] add(int[][] arr1, int[][] arr2, int n, int m){
        int[][] res = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the number of column: ");
        int m = in.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter the value for matirx 1: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = in.nextInt();
            }
        }
        int[][] arr2 = new int[n][m];
        System.out.println("Enter the value for martix 2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = in.nextInt();
            }
        }
        int ans[][] = add(arr1, arr2, n, m);
        System.out.println("After the addition");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
