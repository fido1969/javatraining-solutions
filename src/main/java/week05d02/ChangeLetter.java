package week05d02;

public class ChangeLetter {

    public static final String VOWELS = "aeiou";

    public static final String REPLACE_CHAR = "*";


    public String changeVowels(String str) {

        isValid(str);

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (VOWELS.contains(str.toLowerCase().substring(i, i + 1))) {
                sb.replace(i, i + 1, REPLACE_CHAR);
            }
        }
        return sb.toString();
    }

    private void isValid(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid parameter!");
        }
    }


   /* public String changeVowels(String str) {

        isValid(str);

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < VOWELS.length(); j++) {
                if (str.toLowerCase().charAt(i) == VOWELS.charAt(j)) {
                    sb.replace(i, i + 1, REPLACE_CHAR);
                }
            }
        }
        return sb.toString();
    }*/
}
