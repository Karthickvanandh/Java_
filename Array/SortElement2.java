package Array;
import java.util.*;

public class SortElement2 {

    public static void SortDesc(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        SortDesc(arr);
        System.out.print("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
}
