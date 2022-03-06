package Interfaces;

import Model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class CalculatorTest {
    @Test
    void getResult() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(6));
        tokens.add(new Operand(2));
        tokens.add(new Operator(Operation.MULTIPLICATION));
        tokens.add(new Operand(10));
        tokens.add(new Operand(2));

        tokens.add(new Operator(Operation.SUBTRACTION));

        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        for (Token token : tokens)
        {
            token.accept(calculatorVisitor);
        }
        System.out.println(calculatorVisitor.getResult());
    }
}