package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    PhoneParser phoneParser = new PhoneParser();

    @Test
    void parseTest() {
        Phone phone = phoneParser.parse("10-12345678");
        assertEquals("10", phone.getPrefix());
        assertEquals("12345678", phone.getNumber());
        assertEquals("prefix= 10  number= 12345678", phone.toString());
    }

}