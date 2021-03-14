package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResult() {
        Operation operation = new Operation("68+12");
        assertEquals(68,operation.getLeftOperand());
        assertEquals(12,operation.getRightOperand());
        assertEquals(80,operation.getResult());

    }

    @Test
    void getResultWithTrim() {
        Operation operation = new Operation("  68 +  12  ");
        assertEquals(68,operation.getLeftOperand());
        assertEquals(12,operation.getRightOperand());
        assertEquals(80,operation.getResult());

    }


}