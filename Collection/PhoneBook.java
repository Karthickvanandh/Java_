package Collection;
import java.util.*;

class Details{
    int id;
    String name;
    long phoneNumber;
    Details(int id, String name, long phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

public class PhoneBook {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Details> map = new HashMap<>();
        System.out.println("Enter the list of phone number to be added: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int id = in.nextInt();
            String name = in.next();
            long phoneNumber = in.nextLong();
            if(map.containsKey(id)){
                throw new IllegalArgumentException("already existed");
            }
            Details d = new Details(id, name, phoneNumber);
            map.put(id, d);
        }
        //Search data

        System.out.println("Enter the id: ");
        int sId = in.nextInt();
        Details d = map.get(sId);
        if(map.containsKey(sId)){
            System.out.println("ID: " + d.id + " " + "Name: " + d.name + " " + "Phone Number: " + d.phoneNumber);
        }else{
            throw new IllegalArgumentException("Not found");
        }
        System.out.println("");

        //Update phone number

        System.out.println("Update phone number: ");
        sId = in.nextInt();
        if(!map.containsKey(sId)){
            throw new IllegalArgumentException("Not found");
        }
        d = map.get(sId);
        d.phoneNumber = in.nextLong();
        for(int i:map.keySet()){
            d = map.get(i);
            System.out.println("ID: " + d.id + " " + "Name: " + d.name + " " + "Phone Number: " + d.phoneNumber);
        }
        System.out.println("");

        //delete contact

        System.out.println("Enter the id to delete contact");
        sId = in.nextInt();
        if(!map.containsKey(sId)){
            throw new IllegalArgumentException("Not found");
        }
        map.remove(sId);
        for(int i:map.keySet()){
            d = map.get(i);
            System.out.println("ID: " + d.id + " " + "Name: " + d.name + " " + "Phone Number: " + d.phoneNumber);
        }
    }
}
