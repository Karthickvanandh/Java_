package Array;
import java.util.*;


public class elementOccurance {

    public static void findOccu(int[] arr, int[] arr1){
        int visited = -1;
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr1[j] = visited;
                }
            }
            if(arr1[i] != -1){
                arr1[i] = count;
            }
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] arr1 = new int[n];
        findOccu(arr, arr1);

        System.out.println("Elements" + " " + "|" + " " + "Occurance");
        for(int i=0;i<n;i++){
            if(arr1[i] != -1){
                System.out.println(" " + arr[i] + " " + "|" + " " + arr1[i]);
            }
        }
    }
}
