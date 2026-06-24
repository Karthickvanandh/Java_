package Collection;

import java.util.ArrayList;
import java.util.Scanner;




public class MarkList {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = in.nextInt();
        System.out.println("Enter the marks: " + n);
        ArrayList<Integer> arr = new ArrayList<>();
        try{
            for(int i=0;i<n;i++){
                int mark = in.nextInt();
                if(mark < 0 || mark > 100){
                    throw new IllegalArgumentException("Invalid marks: ");
                }else{
                    arr.add(mark);
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        int higest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int average = 0;
        for(int i=0;i<n;i++){
            if(arr.get(i) > higest){
                higest = arr.get(i);
            }
            if(arr.get(i) < lowest){
                lowest = arr.get(i);
            }
            average += arr.get(i);
        }
        average /= n;

        System.out.println("Higest mark: " + higest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Avarege mark: " + average);
    }
    
}
