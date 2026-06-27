package Collection;
import java.util.*;

public class VotingCheck {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>(); 
        System.out.println("Enter the no. of voter: ");
        int n = in.nextInt();
        System.out.println("Enter the voter name: ");
        for(int i=0;i<n;i++){
            String name = in.next();
            if(set.contains(name)){
                throw new IllegalArgumentException("Already voted");
            }
            set.add(name);
        }
        System.out.println("List of voters: " + set);
        System.out.println("Search name in list: ");
        String sn = in.next();
        if(set.contains(sn)){
            System.out.println("Present");
        }else{
            System.out.println("Not listed");
        }
    }
    
}
