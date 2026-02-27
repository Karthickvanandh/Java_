package OOPS;
import java.util.*;

class Student{
    int id;
    String name;

    void getDetails(int id, String name){
        System.out.print("Student rollno: " + id);
        System.out.print("Student name: " + name);
    }

    void setDetails(){
        id = 102;
        name = "DEF";
    }
}
public class BasicStructureOops {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.getDetails(101, "ABC");
        s1.setDetails();
        System.out.print("After set id: " + s1.id);
        System.out.print("After set name: " + s1.name);
    }
}
