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
public class PointCP2
{
  private double rho; 
  private double  theta; 


  public PointCP2(double rho, double theta){
    this.theta = theta; 
    this.rho = rho; 
  }

  public double getX() {
    return rho * Math.cos(Math.toRadians(theta));
}

public double getY() {
    return rho * Math.sin(Math.toRadians(theta));
}



}
