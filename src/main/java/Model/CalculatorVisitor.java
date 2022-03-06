package Model;

import Interfaces.Calculator;
import Interfaces.Visitor;

import java.lang.reflect.MalformedParametersException;

public class CalculatorVisitor implements Visitor, Calculator
{
  LinkedStack<Token> tokenStack;

  public CalculatorVisitor()
  {
    this.tokenStack = new LinkedStack<>();
  }

  @Override public int getResult() throws MalformedParametersException
  {
    return ((Operand) tokenStack.pop()).getValue();
  }

  @Override public void visit(Operand operand)
  {
    pushOperand(operand);
  }

  @Override public void visit(Operator operator)
  {
    pushOperator(operator);
  }

  private void pushOperand(Operand operand)
  {
    tokenStack.push(operand);
  }

  private void pushOperator(Operator operator)
  {
    Operand operand1 = (Operand) tokenStack.pop();
    Operand operand2 = (Operand) tokenStack.pop();
    switch (operator.getOperation())
    {
      case ADDITION:
        System.out.println(
                operand1.getValue() + "+" + operand2.getValue());
        pushOperand(new Operand(operand1.getValue() + operand2.getValue()));
        break;
      case SUBTRACTION:
        System.out.println(
             (operand1.getValue() + "-" + operand2.getValue()));
        pushOperand(new Operand((operand2.getValue() - operand1.getValue())));
        break;
      case DIVISION:
        System.out.println(
            (operand1.getValue() + "/" + operand2.getValue()));
        pushOperand(new Operand(operand1.getValue() /operand2.getValue()));
        break;
      case MULTIPLICATION:
        System.out.println(
            (operand1.getValue() + "*" + operand2.getValue()));
        pushOperand(new Operand(operand1.getValue() * operand2.getValue()));
        break;

    }
  }
}
