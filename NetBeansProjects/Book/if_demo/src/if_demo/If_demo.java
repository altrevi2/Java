/*

Alan Treviño
October 6, 2014

Demonstrates IF
 */

package if_demo;

/**
 *
 * @author alantrevino
 */
public class If_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if (a < b) System.out.println("a is less than b.");
        
        //this won't be displayed
        if (a==b) System.out.println("You can't see me!");
        
        System.out.println();
        
        
        c = a - b; 
        //c is now -1
        
        System.out.println("c contains " + c + ".");
        if (c >= 0) System.out.println("c is non-negative.");
        if (c <= 0) System.out.println("c is negative.");
        
        System.out.println();
        
        
        c = b - a;
        // c is now 1
        
        System.out.println("c contains " + c + ".");
        if ( c >= 0) System.out.println("c is non-negative");
        if ( c <= 0) System.out.println("c is negative.");
        
        
        /*
        I am curious to know if I can use curly brackets to place more than one 
        statement in an IF statement. . . .
        */
        
        if ( c >= 0) 
        {
            System.out.println("c is non-negative");
            System.out.println("Isn't this awesome?");
            
        }
        
        /*
        That worked! Now, to test it out WITHOUT the curly brackets.
        */
        
        if ( c <= 0) 
            System.out.println("c is negative.");
            System.out.println("Oh my. . . ");
        
        /*
        It is confirmed. In order to include more than one statement in an IF
        construct, you NEED curly brackets. I even tried indenting. No go.
        */
        
    }
    
}
