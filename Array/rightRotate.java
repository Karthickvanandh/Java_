package Array;
import java.util.*;

//[1, 2, 3, 4, 5] -> [3, 4, 5, 1, 2]

public class rightRotate {
    public static void rotate(int[] arr, int m){
        for(int i=0;i<m;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the value: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number of rotation: ");
        int m = in.nextInt();
        rotate(arr, m);
        System.out.print("After right rotate: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
