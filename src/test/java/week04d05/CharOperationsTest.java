package week04d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharOperationsTest {

    CharOperations charOperations = new CharOperations();

    @Test
    void getPositionOfCharsIs() {
        assertEquals("[0, 4]",charOperations.getPositionOfChars("almaalma","al").toString());
    }

    @Test
    void getPositionOfCharsIsNot() {
        assertEquals("[]",charOperations.getPositionOfChars("almaalma","p").toString());
    }

    @Test
    void getPositionOfCharsBaseNull(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->charOperations.getPositionOfChars(null,"al"));
        assertEquals("Invalid parameter!",iae.getMessage());
    }

    @Test
    void getPositionOfCharsBaseEmpty(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->charOperations.getPositionOfChars("","al"));
        assertEquals("Invalid parameter!",iae.getMessage());
    }

    @Test
    void getPositionOfCharsPartNull(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->charOperations.getPositionOfChars("alma",null));
        assertEquals("Invalid parameter!",iae.getMessage());
    }

    @Test
    void getPositionOfCharsPartEmpty(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class,()->charOperations.getPositionOfChars("alam",""));
        assertEquals("Invalid parameter!",iae.getMessage());
    }
}