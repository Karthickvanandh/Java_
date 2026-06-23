package Collection;
import java.util.*;

public class StoreStudentList {
    public static void main(String args[]) {
        ArrayList<String> student = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<4;i++){
            student.add(in.next());
        }
        student.remove(2);
        for(int i=0;i<student.size();i++){
            System.out.println("Student lists: " + student.get(i));
        }
    }
}
