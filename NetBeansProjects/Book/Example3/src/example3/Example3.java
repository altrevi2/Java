/*
 * Alan Treviño
 * October 6, 2014
 *
 * This program illustrates the differences
 * between int and double
 */

package example3;

/**
 *
 * @author alantrevino
 */
public class Example3 {

    
    public static void main(String[] args) {
        int var;
        double x;
        
        var = 10;
        x = 10.0;
        
        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println();                                       //empty line
        
        //divide by four
        var = var / 4;
        x = x / 4;
        
        /*
        I believe that you can also crunch up the code so that it
        can look a lot cleaner. Just a thought. . . .
        */
        
        System.out.println("var after division: "+var);
        System.out.println("x after division: " + x);
        System.out.println("We will multiply by four now");
        
        var=var*4;
        x=x*4;
        
        System.out.println("var after division: "+var);
        System.out.println("x after division: " + x);
        /*
        Why yes, you can crunch up code to make it harder to read, but you
        should never practice this. It makes it dificult for your team to read,
        and you will gain a bad rep within the programming community.
        */        
    }
    
}
