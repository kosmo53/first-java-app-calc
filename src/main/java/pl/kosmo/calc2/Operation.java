package pl.kosmo.calc2;

/**
 *
 * @author kosmeusz
 */
public class Operation {
    public void add(String arg1, String arg2){
        
        int argc1 = Integer.parseInt(arg1);
        int argc2 = Integer.parseInt(arg2);
        System.out.println(argc1 + argc2);
    }
    
    public void sub(String arg1, String arg2){
        
        int argc1 = Integer.parseInt(arg1);
        int argc2 = Integer.parseInt(arg2);
        System.out.println(argc1 - argc2);
    }
}
