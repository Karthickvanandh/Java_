package Matrix;
import java.util.*;

public class frequencyMatrix {
    public static void oddEven(int[][] arr, int n, int m){
        int odd = 0, even = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("No of even occurance: " + even);
        System.out.println("No of odd occurance: " + odd);
    }

    public static void printMat(int[][] arr, int n, int m){
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
                arr[i][j] = (rand.nextInt(10) +1);
            }
        }
        printMat(arr, n, m);
        oddEven(arr, n ,m);
    }
}
