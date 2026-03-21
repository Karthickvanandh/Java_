package Array;
import java.util.*;

public class lowerTriangleMatrix {

    public static void convertMatrix(int[][] arr, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j>i){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the no.of col: ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the value: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        if(n == m){
            convertMatrix(arr, n, m);
        
            printMatrix(arr, n, m);
        }else{
            System.out.println("Matrix should be a square matrix");
        }

    }
}
