package Model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void evaluateExpression() {
        Client client = new Client();
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(6));
        tokens.add(new Operand(2));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        tokens.add(new Operand(10));
        tokens.add(new Operator(Operation.SUBTRACTION));
        assertEquals(2,client.evaluateExpression(tokens));
        System.out.println(client.evaluateExpression(tokens));
    }
}