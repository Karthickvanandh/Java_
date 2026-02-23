package Array;
import java.util.*;

public class ReverseArray {

    public static void ReversePrint(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("reversed array: ");
        ReversePrint(arr);
    }
}
