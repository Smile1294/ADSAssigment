package Calculator.Model;

public class Operand extends Token{
    private int value;
    public void accept(CalculatorVisitor calculatorVisitor)
    {

    }
    public int getValue()
    {
        return value;
    }
}
