package Array;
import java.util.*;

public class identityMatrix {

    public static boolean findIdentity(int[][] arr, int n, int m){
        boolean flag = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j && arr[i][j] == 0){
                    flag = false;
                    break;
                }
                if(i!=j && arr[i][j] == 1){
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
        System.out.println("Enter the value: ");
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }

        boolean ans = findIdentity(arr, n, m);
        if(ans){
            System.out.println("Matrix is identiy");
        }
        else{
            System.out.println("Matrix is not identity");
        }

    }
}
