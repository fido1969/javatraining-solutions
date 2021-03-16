package arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapsulesTest {

    Capsules capsules = new Capsules();

    @Test
    void addLast() {
        capsules.addLast("green");
        assertEquals("[green]", capsules.getColors().toString());
        assertEquals("[green]", capsules.getCapsulesColour().toString());
    }

    @Test
    void addFirst() {
        capsules.addFirst("red");
        assertEquals("[red]", capsules.getColors().toString());
        assertEquals("[red]", capsules.getCapsulesColour().toString());
    }

    @Test
    void removeFirst() {
        capsules.addFirst("red");
        System.out.println(capsules.getColors().toString());
        System.out.println("------------");
        capsules.removeFirst();
        assertEquals("[]", capsules.getColors().toString());
    }

    @Test
    void removeLast() {
        capsules.addFirst("red");
        capsules.addFirst("green");
        System.out.println(capsules.getColors().toString());
        System.out.println("------------");
        capsules.removeLast();
        assertEquals("[green]", capsules.getColors().toString());
    }

    @Test
    void getColors() {
        capsules.addLast("green");
        capsules.addFirst("red");
        assertEquals("[red, green]", capsules.getColors().toString());
    }
}