package Matrix;
import java.util.*;

public class productMatrix {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the no.of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the no.of cols: ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (rand.nextInt(10) +2);
            }
        }
    }
}
