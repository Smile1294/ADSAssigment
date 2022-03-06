package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {
    @Test
    void getValue() {
        Operand operand = new Operand(10);
        assertEquals(10,operand.getValue());
    }
}