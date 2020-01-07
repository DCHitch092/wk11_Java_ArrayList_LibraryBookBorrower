import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library("The Great Library Of Shangford", 1);
        book1 = new Book("Great Things Of Shangford", "Ollie Cumber", "Local History");
        book2 = new Book("1000 ways to make an omletter without cracking eggs", "Janice Fambrozy", "cookery");

    }
    @Test
    public void libraryHasBookCollection(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void libraryHasCapacity(){
        library.addBook(book1);
        assertEquals(0, library.checkCapacity());
    }

    @Test
    public void libraryDoesntOverfill(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.countBooks());
    }

}
