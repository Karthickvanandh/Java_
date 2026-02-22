package Array;
import java.util.*;


public class leftRotate {

    public static void rotate(int[] arr, int m){
        for(int i=0;i<m;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
                System.out.print(arr[j]);
            }
            arr[arr.length-1] = temp;
        }

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rotatioin: ");
        int m = in.nextInt();
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        rotate(arr, m);
        System.out.println("Array after left rotate");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
