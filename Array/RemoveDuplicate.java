package Array;
import java.util.*;

//{10,20,20,30,30,40,50,50}

public class RemoveDuplicate {
    public static int Remove(int[] arr){
        int j = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int len = Remove(arr);
        System.out.println("After remove duplicate");
        for(int i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
