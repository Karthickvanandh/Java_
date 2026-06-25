package Collection;
import java.util.*;

class Student{
    String name;
    int mark;

    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    
}


public class StudentReport {

    public static void findStudent(String name, ArrayList<Student> arr){
        boolean flag = false;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).name.equals(name)){
                System.out.print("Name: " + arr.get(i).name + " " + "Mark: " + arr.get(i).mark);
                flag = true;
                break;
            }
        }
        if(!flag){
            throw new IllegalArgumentException("Error");
        }
    }

    public static void findHigestmark(ArrayList<Student> arr){
        int higest = Integer.MIN_VALUE;
        String topperStd = "";
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).mark > higest){
                higest = arr.get(i).mark;
                topperStd = arr.get(i).name;
            }
        }
        System.out.println("Topper student: " + topperStd + " : " + higest);

    }

    public static void displayList(ArrayList<Student> arr){
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j).mark > arr.get(i).mark){
                    Student temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).name + " : " + arr.get(i).mark);
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Student> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name: ");
            String name = in.next();
            System.out.println("Enter the mark: ");
            int mark = in.nextInt();
            try{
                if(mark < 0 || mark > 100){
                    throw new IllegalArgumentException("Invalid mark");
                }
                Student s = new Student(name, mark);
                arr.add(s);
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e);
            }
        }    
        

        System.out.println("Search student: ");
        String stName = in.next();
        findStudent(stName, arr);
        findHigestmark(arr);
        displayList(arr);
        
    }
    
}
