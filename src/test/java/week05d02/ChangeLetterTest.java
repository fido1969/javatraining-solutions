package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

    ChangeLetter changeLetter = new ChangeLetter();

    @Test
    void changeVowels() {
        assertEquals("*b*r*k*s*", changeLetter.changeVowels("Aberikosu"));
    }

    @Test
    void changeVowelsStringNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> changeLetter.changeVowels(null));
        assertEquals("Invalid parameter!", iae.getMessage());
    }

    @Test
    void changeVowelsStringEmpty() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> changeLetter.changeVowels(""));
        assertEquals("Invalid parameter!", iae.getMessage());
    }
}