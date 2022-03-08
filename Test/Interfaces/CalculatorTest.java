package Interfaces;

import Model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.MalformedParametersException;
import java.util.ArrayList;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {
    private Client client;
    private ArrayList<Token> list;

    @BeforeEach
    void setUp() {
        client = new Client();
        list = new ArrayList<>();
    }
    @AfterEach
    void clear() {
        list.clear();
    }

    @Test
    void test1() {
        list.add(new Operand(5));
        list.add(new Operand(3));
        list.add(new Operand(1));
        list.add(new Operator(Operation.ADDITION));
        list.add(new Operator(Operation.MULTIPLICATION));
        int result = client.evaluateExpression(list);
        assertEquals(20, result, "Result");
    }

    @Test
    void test2() {
        list.add(new Operand(2));
        list.add(new Operand(4));
        list.add(new Operand(2));
        list.add(new Operator(Operation.MULTIPLICATION));
        list.add(new Operand(4));
        list.add(new Operator(Operation.DIVISION));
        list.add(new Operator(Operation.ADDITION));
        int result = client.evaluateExpression(list);
        assertEquals(4, result, "Result");
    }

    @Test
    void test3() {
        list.add(new Operand(3));
        list.add(new Operand(7));
        list.add(new Operator(Operation.MULTIPLICATION));
        list.add(new Operand(17));
        list.add(new Operator(Operation.SUBTRACTION));
        int result = client.evaluateExpression(list);
        assertEquals(4, result, "Result");
    }

    @Test
    void test4() {
        list.add(new Operand(4));
        list.add(new Operand(7));
        list.add(new Operator(Operation.MULTIPLICATION));
        list.add(new Operand(2));
        list.add(new Operator(Operation.DIVISION));
        int result = client.evaluateExpression(list);
        assertEquals(14, result, "Result");
    }

    @Test
    void test5() {
        list.add(new Operand(5));
        list.add(new Operand(4));
        list.add(new Operand(-3));
        list.add(new Operator(Operation.MULTIPLICATION));
        list.add(new Operand(1));
        list.add(new Operand(2));
        list.add(new Operator(Operation.ADDITION));
        list.add(new Operator(Operation.DIVISION));
        list.add(new Operator(Operation.MULTIPLICATION));
        int result = client.evaluateExpression(list);
        assertEquals(-20, result, "Result");
    }

    @Test
    void testThrowsException() throws MalformedParametersException
    {
        Assertions.assertThrows(MalformedParametersException.class,()->
        {
            list.add(new Operand(2));
            list.add(new Operand(-0));
            list.add(new Operator(Operation.DIVISION));
            int result = client.evaluateExpression(list);
        });
    }

}