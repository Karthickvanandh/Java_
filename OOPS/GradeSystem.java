package OOPS;
import java.util.*;

class GradeException extends Exception{
    GradeException(String message){
        super(message);
    } 
}

class InvalidMarkException extends GradeException{
    InvalidMarkException(String message){
        super(message);
    } 
}
class FailException extends GradeException{
    FailException(String message){
        super(message);
    } 
}
interface checkable{
    void calculateGrade() throws GradeException;

}

abstract class Student implements checkable{
    int rollNo;
    String name;
    int[] marks;
    
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this. name = name;
    }

    public abstract void calculateGrade() throws GradeException;
}

class UGStudent extends Student{
    static final int SUBJECTS = 5;
    int passMark = 50;
    UGStudent(int rollNo, String name, int[] marks){
        super(rollNo, name);
        this.marks = marks;
    }

    public void calculateGrade() throws GradeException{
        int mark = 0; int average = 0;
        for(int i=0;i<marks.length;i++){
            if(marks[i] < 0 || marks[i] > 100 ){
                throw new InvalidMarkException("Invalid Mark");
            }
            mark += marks[i];
        }
        average = mark / marks.length;
        if(average < passMark){
            throw new FailException("Failed average: " + average);
        }
        System.out.println("Passed average: " + average);
    }

}


public class GradeSystem {
    public static void main(String args[]){
        UGStudent u1 = new UGStudent(101,"AAA",new int[]{60,70,86,90,95});
        try{
            u1.calculateGrade();
        }catch(GradeException e){
            System.out.println("Error" + e);
        }
    }
}
