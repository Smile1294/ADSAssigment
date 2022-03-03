package Calculator.Controller;

import Calculator.Model.LinkedStack;
import org.apache.el.parser.Token;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(value = "/calculator")
    public int evaluateExpression(@RequestBody LinkedStack<Token> tokenStack)
    {

    }
}
