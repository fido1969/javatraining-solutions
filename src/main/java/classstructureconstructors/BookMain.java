package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Arany János", "Toldi");

        book.register("ISBN: 9789636450960");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title of the book: " + book.getTitle());
        System.out.println("Registration number of the book: " + book.getRegNumber());
    }
}
