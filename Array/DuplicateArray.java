package Array;

import java.util.*;

public class DuplicateArray{

    public static void copyElement(int[] arr, int[] arr1){
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] arr1 = new int[n];
        copyElement(arr, arr1);
        System.out.println("Duplicate array values");
        for(int x: arr1){
            System.out.println(x);
        }
    }
}