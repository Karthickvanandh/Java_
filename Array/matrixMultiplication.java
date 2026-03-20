package Array;
import java.util.*;


public class matrixMultiplication {

    public static int[][] Multiplication(int[][] arr1, int[][]arr2, int n, int m){
        int[][] res = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter teh no.of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the no.of col: ");
        int m = in.nextInt();
        int[][] arr1 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = (rand.nextInt(100) +10);
            }
        }
        int[][] arr2 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = (rand.nextInt(100) +10);
            }
        }
        int[][] ans = Multiplication(arr1, arr2, n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
