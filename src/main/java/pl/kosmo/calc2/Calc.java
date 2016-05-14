package pl.kosmo.calc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author kosmeusz
 */
public class Calc {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        String allowedOperations = Stream.of(Calculator.Operations.values()).map(a->a.name()).collect(Collectors.joining(","));
        System.out.println("Operation: " + allowedOperations);
        String operationStr = console.readLine();
        Calculator.Operations operation = Calculator.Operations.valueOf(operationStr);
        
        System.out.println("First arg");
        String arg1 = console.readLine();
        System.out.println("Second arg");
        String arg2 = console.readLine();
        int argc1 = Integer.parseInt(arg1);
        int argc2 = Integer.parseInt(arg2);

        Calculator calc = new Calculator();
        int result = calc.compute(operation, argc1, argc2);
        System.out.println("result = " + result);

    }

}
