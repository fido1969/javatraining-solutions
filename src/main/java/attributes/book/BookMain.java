package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Toldi");
        System.out.println(book.getTitle());

        book.setTitle("Ábel a rengetegben");
        System.out.println(book.getTitle());

    }
}
