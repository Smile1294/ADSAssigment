package Interfaces;

import Model.Operand;
import Model.Operator;

public interface Visitor
{
  void visit(Operand operand);
  void visit(Operator operator);

}
