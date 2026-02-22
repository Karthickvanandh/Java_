package Array;
import java.util.*;


public class elementOccurance {

    public static void findOccu(int[] arr, int[] arr1){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] arr1 = new int[n];
        findOccu(arr, arr1);
    }
}
