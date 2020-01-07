import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> bookCollection;

    public Library(String name){
        this.name = name;
        this.bookCollection = new ArrayList<Book>();
    }

    public int countBooks(){
       return bookCollection.size();
    }


}
