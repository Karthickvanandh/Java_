package Array;

import java.util.*;


public class sumElement {

    public static int Sum(int[] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res += arr[i];
        }
        return res;
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
        int ans = Sum(arr);
        System.out.println("The total value: " + ans);
    }
}
