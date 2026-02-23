package Array;
import java.util.*;

public class EvenPosition {

    public static void findEven(int[] arr){
        for(int i=1;i<arr.length;i+=2){
            System.out.print(arr[i] + " ");
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
        findEven(arr);
    }
}
