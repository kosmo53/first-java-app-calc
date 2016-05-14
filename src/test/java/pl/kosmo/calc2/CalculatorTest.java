package pl.kosmo.calc2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kosmeusz
 */
public class CalculatorTest {
    
    Calculator instance = new Calculator();
    
    @Test
    public void shoudAddTwoArgs() {
        assert instance.compute(Calculator.Operations.add, 1, 2) == 3;
    }
    
    @Test
    public void shoudSubTwoArgs() {
        assert instance.compute(Calculator.Operations.sub, 3, 2) == 1;
    }
    
}
