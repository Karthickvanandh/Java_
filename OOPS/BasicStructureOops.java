package OOPS;
import java.util.*;

class Student{
    int id;
    String name;

    void getDetails(){
        System.out.print("Student rollno: " + id);
        System.out.print("Student name: " + name);
    }

    void setDetails(int id,String name){
        id = id;
        name = name;
    }
}
public class BasicStructureOops {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setDetails(101, "ABC");
        s1.getDetails();
        
        System.out.print("After set id: " + s1.id);
        System.out.print("After set name: " + s1.name);
    }
}
