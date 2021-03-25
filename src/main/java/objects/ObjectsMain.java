package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        Book[] books = new Book[]{new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList1 = new ArrayList<>();

        bookList1 = bookList;

        bookList1.add(new Book());
        bookList1.add(new Book());
        bookList1.add(new Book());
    }
}


