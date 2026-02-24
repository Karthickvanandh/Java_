package Array;
import java.util.*;

//[10, 2, 23, 13, 4, 53]
public class SortElement {

    public static void Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
        Sort(arr);
        System.out.print("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
