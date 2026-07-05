package Collection;
import java.util.*;


public class FriendsLists {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        HashSet<String> person1 = new HashSet<>();
        HashSet<String> person2 = new HashSet<>();
        System.out.println("Enter the friends of person1: ");
        int n = in.nextInt();
        System.out.println("Enter the names: ");
        for(int i=0;i<n;i++){
            person1.add(in.next());
        }
        System.out.println("Enter the no.of friends person2: ");
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            person2.add(in.next());
        }
        System.out.println(person1);
        System.out.println(person2);
        HashSet<String> common = new HashSet<>(person1);
        common.retainAll(person2);
        System.out.println("Common friends: " + common);
        HashSet<String> unique = new HashSet<>(person1);
        unique.addAll(person2);
        System.out.println("Unique friends: " + unique);
        HashSet<String> copy = new HashSet<>(person1);
        copy.removeAll(person2);
        System.out.println("remove friends unique in person 2: " + copy);
    }
}
