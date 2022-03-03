package Calculator.Model;

import Calculator.InterFaces.Calculator;
import Calculator.InterFaces.Visitor;

import java.util.LinkedList;

public class CalculatorVisitor implements Calculator, Visitor {
    private LinkedList<Token> linkedList;
    private LinkedStack<Token> tokenStack;
    @Override
    public void visit(Operand operand) {

    }
    @Override
    public void visit(Operator operator) {

    }
    @Override
    public int getResult() throws Exception {
        return 0;
    }
    private void pushOperand(Operand operand){

    }
    private void performOperation(Operator operator) throws Exception
    {

    }
}
