package pl.kosmo.calc2;

/**
 *
 * @author kosmeusz
 */
public class Calculator {

    public enum Operations {
        add, sub, mult;        
    }

    public int compute(Operations operation, Integer arg1, Integer arg2) {
        CalculatorEngine engine = new CalculatorEngine();
        
        if (operation.equals(Operations.add)) {
            return engine.add(arg1, arg2);
        } else if (operation.equals(Operations.sub)) {
            return engine.sub(arg1, arg2);
        } else {
            throw new UnsupportedOperationException("No Operation: " + operation);
        }
    }

}
