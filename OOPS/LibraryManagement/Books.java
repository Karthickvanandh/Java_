package OOPS.LibraryManagement;
import java.util.*;



abstract class BookDetails{
    int bookId;
    String bookName;
    String author;
    String genre;
    int totalCount;

    BookDetails(int bookId, String bookName, String author, String genre, int totalCount){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.totalCount = totalCount;
    }

}


class PhysicalBook extends BookDetails{

    PhysicalBook(int bookId, String bookName, String author, String genre, int totalCount){
        super(bookId, bookName, author, genre, totalCount);
    }


}


class DigitalBook extends BookDetails{
    DigitalBook(int bookId, String bookName, String author, String genre, int totalCount){
        super(bookId, bookName, author, genre, totalCount);
    }
}


public class Books {
    public static void main(String args[]){

    }    
}
