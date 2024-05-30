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
public class PointCP2 extends PointCP5
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

public double getRho(){
  return rho; 
}

public double getTheta(){
  return theta; 
}

public PointCP5 convertToStoragePolar(){
  return this; 
}

public PointCP5 convertToCartesian(){
  PointCP3 conversion = new PointCP3(getX(),getY()); 
  return conversion; 
}



public double getDistance(PointCP5 pointB)
{
  // Obtain differences in X and Y, sign is not important as these values
  // will be squared later.
  double deltaX = getX() - pointB.getX();
  double deltaY = getY() - pointB.getY();
  
  return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
}

/**
 * Rotates the specified point by the specified number of degrees.
 * Not required until E2.30
 *
 * @param point The point to rotate
 * @param rotation The number of degrees to rotate the point.
 * @return The rotated image of the original point.
 */
public PointCP2 rotatePoint(double rotation)
{
  double radRotation = Math.toRadians(rotation);
  double X = getX();
  double Y = getY();
      
  return new PointCP2((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
}

/**
 * Returns information about the coordinates.
 *
 * @return A String containing information about the coordinates.
 */
public String toString()
{
  return "Stored as Cartesian [" + getX() + "," + getY() + "]" + "\n";
}
  
}
