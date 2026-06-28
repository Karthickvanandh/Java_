package Collection;
import java.util.*;


class Book{
    int bookId;
    String title;
    String genre;

    Book(int bookId, String title, String genre){
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
    }

}

public class LibraryCatlog {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Book> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter the number of book: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int bookId = in.nextInt();
            String title = in.next();
            String genre = in.next();
            if(map.containsKey(bookId)){
                throw new IllegalArgumentException("Already Existed");
            }
            Book b = new Book(bookId, title, genre);
            map.put(bookId, b);
            set.add(genre);
        }
        System.out.println("Search book by book ID: ");
        int sBookId = in.nextInt();
        Book sBook = map.get(sBookId);
        if(sBook == null){
            throw new IllegalArgumentException("Book not found");
        }
        System.out.print(sBook.bookId + " " + sBook.title + " " + sBook.genre);

    }
    
}
