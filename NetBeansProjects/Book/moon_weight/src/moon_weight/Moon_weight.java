/*

Alan Treviño
October 8, 2014
Created: October 8, 2014

This program will take my weight on Earth and calculate my weight on the Moon

 */
package moon_weight;

/**
 *
 * @author alantrevino
 */
public class Moon_weight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare
        double my_lbs , moon_weight;
        double moon_gravity = .167;
        
        my_lbs = 240;
        
        System.out.println( my_lbs + " is your weight on Earth.");
        
        moon_weight = my_lbs * moon_gravity;
        
        System.out.println(moon_weight + " is your weight on the Earth's Moon.");
        
        
        
        
        
    }
    
}
