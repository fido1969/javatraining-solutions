package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    Phone phone = new Phone("30","12345678");

    @Test
    void getPrefix() {
        assertEquals("30",phone.getPrefix());
    }

    @Test
    void getNumber() {
        assertEquals("12345678",phone.getNumber());
    }

    @Test
    void testToString() {
        assertEquals("prefix= 30  number= 12345678",phone.toString());
    }
}