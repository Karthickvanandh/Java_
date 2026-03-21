package Array;
import java.util.*;

public class upperTriangleMatrix {

    public static void convertUpper(int[][] arr, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<i){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][]arr, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the no.of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the no.of col: ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = rand.nextInt(1,10);
            }
        }
        if(n==m){
            convertUpper(arr, n, m);
            printMatrix(arr, n, m);
        }else{
            System.out.println("Matrix should be a square matrix");
        }
    }    
}
