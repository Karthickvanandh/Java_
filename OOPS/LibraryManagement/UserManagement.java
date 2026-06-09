package OOPS.LibraryManagement;
import java.util.*;


abstract class User{
    int userId;
    String userName;
    String emailId;
    long phoneNumber;
    private String password;


    User(int userId, String userName, String emailId, long phoneNumber, String password){
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    boolean login(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}

abstract class Students extends User{
    BookDetails[] borrowedBookList;


    Students(int userId, String userName, String emailId, long phoneNumber, String password){
        super(userId, userName, emailId, phoneNumber, password);
    
    }


}

class RegularStudents extends Students{
     RegularStudents(int userId, String userName, String emailId, long phoneNumber, String password){
        super(userId, userName, emailId, phoneNumber, password);
        this.borrowedBookList = new BookDetails[2];
    
    }
}

class PremiumStudent extends Students{
    PremiumStudent(int userId, String userName, String emailId, long phoneNumber, String password){
        super(userId, userName, emailId, phoneNumber, password);
        this.borrowedBookList = new BookDetails[5];
    }

    
}

class Librarian extends User{


    Librarian(int userId, String userName, String emailId, long phoneNumber, String password){
        super(userId, userName, emailId, phoneNumber, password);
    }
    
    void checkStudentBookList(BookDetails[] borrowedBookList){
        if(borrowerdBookList.length >)
    }
    void checkReturnBook(Books book, )
}

public class UserManagement {
    public static void main(String args[]){
        
    }
}
