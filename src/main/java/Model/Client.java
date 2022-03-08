package Model;

import java.util.ArrayList;

public class Client
{
  public int evaluateExpression(ArrayList<Token> tokenList) throws MalformedException
  {
    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
    for (Token token : tokenList)
    {
      token.accept(calculatorVisitor);
    }
       return calculatorVisitor.getResult();
   }
}
