package arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books books = new Books();

    @Test
    void add() {
        books.add("Toldi");
        assertEquals("[Toldi]", books.getTitles().toString());
    }

    @Test
    void findAllByPrefix() {
        books.add("Toldi");
        books.add("Arany ember");
        books.add("Alice in Wonderland");
        assertEquals("[Arany ember, Alice in Wonderland]", books.findAllByPrefix("A").toString());
    }

    @Test
    void getTitles() {
        books.add("Toldi");
        books.add("Arany ember");
        books.add("Alice in Wonderland");
        assertEquals("[Toldi, Arany ember, Alice in Wonderland]", books.getTitles().toString());
    }
}