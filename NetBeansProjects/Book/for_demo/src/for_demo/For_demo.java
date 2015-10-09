/*

Alan Treviño
October 6, 2014

For loop construct example.

 */

package for_demo;

/**
 *
 * @author alantrevino
 */
public class For_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count;
        
        for ( count = 0; count < 5; count = count+1 )
            System.out.println("This is count: " + count + ".");
        
        /*
        In case you're looking at this and wondering "Why in the hell did count
        only go up to four!?!! Well, that's because you never told the computer
        that the number zero (0) does not count. If you don't want zero to count,
        make sure that the first initializaton starts with the number above the 
        one you want it to start off with.
        
        i.e.: I want to start at 22, but do not want to exclude, first part of 
        this FOR statement should be "count = 22"
        */
        
        System.out.println("Ding!");
        System.out.println();
        
        for ( count = 1; count < 100; count++ )
            System.out.println("This is count: " + count + ".");
        
        System.out.println("Ding!");
        System.out.println();
        
        for ( count = 0; count >= -100; count-- )
            System.out.println("This is count: " + count + ".");
           
            
        System.out.println("Ding!");
        
    }
    
}
