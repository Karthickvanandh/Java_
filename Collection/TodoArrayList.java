package Collection;
import java.util.*;

public class TodoArrayList {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        boolean flag = true;
        int totaltask = 0;
        while(flag){
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View all");
            System.out.println("4. Search task");
            System.out.println("5. Exit");

            int n = in.nextInt();
            in.nextLine();

            switch(n){
                case 1:
                    System.out.println("Enter task: ");
                    arr.add(in.nextLine());
                    totaltask++;
                    break;
                case 2:
                    System.out.println("Enter the task to remove: ");
                    String removetask = in.nextLine();
                    try{
                        if(arr.contains(removetask)){
                            arr.remove(removetask);
                        }
                        else{
                            throw new IllegalArgumentException("Task not found");
                        }
                    }catch(IllegalArgumentException e){
                            System.out.println("Error: " + e);
                    }
                    totaltask--;
                    break;
                case 3:
                    for(int i=0;i<arr.size();i++){
                        System.out.println("Todo list");
                        System.out.println(arr.get(i));
                    }
                    totaltask++;
                    break;

                case 4:
                    System.out.println("Enter the task to search: ");
                    String search = in.nextLine();
                    try{
                        if(arr.contains(search)){
                            System.out.println("Found");
                        }else{
                                throw new IllegalArgumentException("Not Found");
                        }
                    }catch(IllegalArgumentException e){
                        System.out.println("Error: " + e);
                    }
                    totaltask++;
                    break;
                case 5:
                    flag = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
