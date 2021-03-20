package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char letter) {

        isValid(word);

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                integerList.add(i);
            }
        }
        return integerList;
    }

    private void isValid(String word) {
        if (word == null || word.isBlank()) {
            throw new IllegalArgumentException("Wrong parameter!");
        }
    }

    public static void main(String[] args) {

        Search search = new Search();

        System.out.println(search.getIndexesOfChar("almafa", 'a'));


    }
}
