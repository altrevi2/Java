/*


Alan Treviño
Oct 8, 2014

USe the pythagorean theorem to find the length of the hypotenuse given
the lengths of the two opposing sides.

 */
package float_point_math;

/**
 *
 * @author alantrevino
 */
public class Float_point_math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        
        x = 3;
        y = 4;
        
        z = Math.sqrt(x*x + y*y);
        
        System.out.println("Hypotenuse is " +z);
        
    }
    
}
