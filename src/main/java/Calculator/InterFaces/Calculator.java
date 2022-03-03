package Calculator.InterFaces;

import Calculator.Model.Operand;
import Calculator.Model.Operator;

public interface Calculator {
    public void visit(Operand operand);
    public void visit(Operator operator);
}
