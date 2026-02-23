package Array;
import java.util.*;


public class OddPosition {

    public static void findOdd(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        findOdd(arr);
    }
}
