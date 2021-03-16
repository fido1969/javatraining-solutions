package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titleOfTheBooks = new ArrayList<>();

    public void add(String title) {
        titleOfTheBooks.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> booksByPrefix = new ArrayList<>();
        for (String bookTitle : titleOfTheBooks) {
            if (bookTitle.startsWith(prefix)) {
                booksByPrefix.add(bookTitle);
            }
        }
        return booksByPrefix;
    }

    public List<String> getTitles() {
        return titleOfTheBooks;
    }

    public void removeByPrefix(String prefix) {
        for (String bookTitle : titleOfTheBooks) {
            if (bookTitle.startsWith(prefix)) {
                titleOfTheBooks.remove(bookTitle);
            }
        }
    }

    public void removeAllByPrefix(String prefix) {
        List<String> deleteByPrefix = new ArrayList<>();
        for (String bookTitle : titleOfTheBooks) {
            if (bookTitle.startsWith(prefix)) {
                deleteByPrefix.add(bookTitle);
            }
        }
        titleOfTheBooks.removeAll(deleteByPrefix);
    }
}
