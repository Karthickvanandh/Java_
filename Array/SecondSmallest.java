package Array;
import java.util.*;

public class SecondSmallest {


    public static int FindSmallest(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = FindSmallest(arr);
        System.out.println("The  second smallest element: " + ans);
    }
}
