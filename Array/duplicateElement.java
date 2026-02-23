package Array;
import java.util.*;

//[1, 2, 3, 3, 2, 4]

public class duplicateElement {

    public static void findDuplicate(int[] arr){
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i])
                continue;
            boolean isDuplicate = false;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            if(isDuplicate)
                System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        System.out.println("List of Duplicate element in the array: ");
        findDuplicate(arr);
    }
}
