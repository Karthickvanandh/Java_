package Array;
import java.util.*;

public class addMatrix {

    public static void displayMatrix(int[][] arr1, int[][] arr2, int n, int m){  //printing matrix value
        System.out.println("Printing martix 1 values");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing matrix 2 values");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] arr1, int[][] arr2, int n, int m){   // Adding two matrix
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
        Random rand = new Random();  //Random method
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the number of column: ");
        int m = in.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter the value for matirx 1: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = (rand.nextInt(100) +1);   //Using random to generate the value for matrix
            }
        }
        int[][] arr2 = new int[n][m];
        System.out.println("Enter the value for martix 2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = (rand.nextInt(100) +1);
            }
        }

        displayMatrix(arr1, arr2, n, m);

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
