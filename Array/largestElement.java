package Array;
import java.util.*;

public class largestElement {
    public static int findlargest(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans = findlargest(arr);
        System.out.println("The largest element in the array: " + ans);
    }
}
