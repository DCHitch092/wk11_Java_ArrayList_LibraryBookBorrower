import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks(){
       return bookCollection.size();
    }

    public void addBook(Book book){
        if(checkCapacity() != 0) {
            bookCollection.add(book);
        }
    }

    public int checkCapacity() {
        return capacity - countBooks();
    }
}
