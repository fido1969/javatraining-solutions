package week04d05;

import java.util.ArrayList;
import java.util.List;

public class CharOperations {

    public List<Integer> getPositionOfChars(String base, String part) {

        List<Integer> positions = new ArrayList<>();

        isValid(base);
        isValid(part);

        for (int i = 0; i < base.length(); i++) {

            if (i + part.length() <= base.length()) {

                if (base.substring(i, (i + part.length())).equals(part)) {
                    positions.add(i);
                }
            }else {

            }
        }
        return positions;
    }

    private void isValid(String base) {
        if (base == null || base.isBlank()) {
            throw new IllegalArgumentException("Invalid parameter!");
        }
    }
}
