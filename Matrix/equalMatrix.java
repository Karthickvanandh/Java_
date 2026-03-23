package Array;
import java.util.*;

public class equalMatrix {
    public static boolean findEqual(int[][] arr1, int[][] arr2, int n, int m){
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i][j] != arr2[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no.of row: ");
        int n = in.nextInt();
        System.out.println("Enter the no.of col: ");
        int m = in.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter the values matrix 1: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = in.nextInt();
            }
        } 
        int[][] arr2 = new int[n][m];
        System.out.println("Enter the values matrix 2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = in.nextInt();
            }
        }

        boolean ans = findEqual(arr1, arr2, n, m);
        if(ans){
            System.out.println("Given matrix are equal");
        }else{
            System.out.println("The given matrix are not equal");
        }
    }
    
}
