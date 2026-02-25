package Array;
import java.util.*;

public class SecondLargest {
    public static int FindElement(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Ente the value: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans = FindElement(arr);
        System.out.println("Second largest element: " + ans);
    }
}
