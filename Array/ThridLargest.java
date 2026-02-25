package Array;
import java.util.*;

public class ThridLargest {
    public static int sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if( arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-3];
    }
    public static int sort2(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int thrid = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                thrid = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                thrid = second;
                second = arr[i];
            }
            else if(arr[i] > thrid && arr[i] != second && arr[i] != first){
                thrid = arr[i];
            }
        }
        return thrid;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = sort(arr);
        System.out.println("Thrid largest number basic: " + ans);
        int res = sort2(arr);
        System.out.println("Thrid largest element Opti: " + res);
    }
}
