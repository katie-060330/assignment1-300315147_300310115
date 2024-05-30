// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP3
{
      private double x; 
      private double y; 

      public PointCP3(double x, double y){
          this.x = x; 
          this.y =y; 
      }
      public double getRho() {
        return Math.sqrt(x * x + y * y);
    }
    
    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }
    
}
