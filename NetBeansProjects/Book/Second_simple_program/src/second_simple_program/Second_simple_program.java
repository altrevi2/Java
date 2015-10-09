/*
 * Alan Treviño
 * October 6, 2014
 * Java Programming out of book
 *
 * This demonstrates a variable.
 */

package second_simple_program;

/**
 *
 * @author alantrevino
 */
public class Second_simple_program {

    
    public static void main(String[] args) {
        int var1, var3;
        int var2;
        
        var1 = 1024;
        
        System.out.println("var1 contains " + var1);
        
        var2 =  var1 / 2;
        
        System.out.println("var2 contains var1 / 2: ");
        System.out.print(var2);
        System.out.println("var3 is var1 * 3");
        
        var3 = var1 * 3;
        
        System.out.println("var3 is " + var3);
        
    }
    
}
