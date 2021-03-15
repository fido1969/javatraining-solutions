package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    NameChanger nameChanger = new NameChanger("János Szabadkai");

    @Test
    void getFullName() {
        assertEquals("János Szabadkai",nameChanger.getFullName());
    }

    @Test
    void getFullNameIsNull() {
        Exception ex= assertThrows(IllegalArgumentException.class,()->new NameChanger(null));
        assertEquals(" Invalid name: null",ex.getMessage());
    }

    @Test
    void getFullNameIsEmpty() {
        Exception ex= assertThrows(IllegalArgumentException.class,()->new NameChanger(""));
        assertEquals(" Invalid name: ",ex.getMessage());
    }

    @Test
    void getFullNameWithoutSpace() {
        Exception ex= assertThrows(IllegalArgumentException.class,()->new NameChanger("JánosSzabadkai"));
        assertEquals(" Invalid name: JánosSzabadkai",ex.getMessage());
    }

    @Test
    void changeFirstName() {
        nameChanger.changeFirstName("Attila");
        assertEquals("Attila Szabadkai",nameChanger.getFullName());
    }

    @Test//using StringBuilder
    void changeFirstNameSb() {
        nameChanger.changeFirstNameSb("Attila");
        assertEquals("Attila Szabadkai",nameChanger.getFullName());
    }

    @Test
    void changeFamilytName() {
        nameChanger.changeFamilyName("Király");
        assertEquals("János Király",nameChanger.getFullName());
    }

    @Test//using StringBuilder
    void changeFamilyNameSb() {
        nameChanger.changeFamilyNameSb("Király");
        assertEquals("János Király",nameChanger.getFullName());
    }
}