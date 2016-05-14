package pl.kosmo.calc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kosmeusz
 */
public class Calc {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Operation: add, sub");
        String operation = console.readLine();

        if (operation.equals("add")) {

            Operation operationAction = new Operation();
            String arg1 = console.readLine();
            String arg2 = console.readLine();
            System.out.println("operation:" + operation + " Arg =" + arg1 + " Arg2 =" + arg2);
            operationAction.add(arg1, arg2);
        } else if (operation.equals("sub")) {
            Operation operationAction = new Operation();
            String arg1 = console.readLine();
            String arg2 = console.readLine();
            System.out.println("operation:" + operation + " Arg =" + arg1 + " Arg2 =" + arg2);
            operationAction.sub(arg1, arg2);
        } else{ 
            
        }
    }

}
