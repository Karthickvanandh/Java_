package Collection;
import java.util.*;

public class ShoppingCartArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list of items: ");
        int n = in.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(in.next());
        }
        System.out.println("Enter the item to be removed: ");
        String st = in.next();
        try{
            if(arr.contains(st)){
                arr.remove(st);
            }else{
                throw new IllegalArgumentException("Item not found: " + st);
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Total no of item: " + arr.size());
    }
}
