package Calculator.Model;

public class Operator extends Token{
    private Operation operation;
    public void accept(CalculatorVisitor calculatorVisitor)
    {

    }
    public Operation getOperation()
    {
        return operation;
    }
}
