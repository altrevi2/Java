/*

Alan Treviño
October 6, 2014
Java: Beginners Guide Page 20

1-1

This program converts gallons to Liters.


Edit past line 40 for 1-2

 */

package gal_to_liters;

/**
 *
 * @author alantrevino
 */
public class Gal_to_liters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons, liters;
        
        gallons = 10;
        
        liters = gallons * 3.7854;
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
        
        if (gallons < 11) System.out.println(gallons + " gallons is less than 11.");
        
        if (liters > 30) System.out.println(liters + " liters is more than 30");
        
        /*
        Edits! Gonna make it better for 1-2
        */
        
        int counter;
        
        counter = 0;
        for( gallons = 1; gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println(gallons +" gallons is " +
                               liters + " liters.");
        
        
            counter++;
            //every 10th line, there will be a blank
            if (counter == 10)
            {
               System.out.println();
               counter = 0;
               //reset!
            }
        
        }
        
        
    }
    
}
