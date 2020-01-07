import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        borrower = new Borrower("Denald Gump");
    library = new Library("The Great Library Of Shangford", 1);
        book1 = new Book("Great Things Of Shangford", "Ollie Cumber", "Local History");
        book2 = new Book("1000 ways to make an omletter without cracking eggs", "Janice Fambrozy", "cookery");
    }

    @Test
    public void hasBorrowedCollection(){
        assertEquals(0, borrower.countBooks());
    }
}
