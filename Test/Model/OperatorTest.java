package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void getOperation(){
        new Operator(Operation.MULTIPLICATION);
        Operator operator = new Operator(Operation.ADDITION);
        System.out.println(operator.getOperation());
        assertNotNull(operator.getOperation());
    }
}