public class PointCP5 {
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

  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  private char typeCoord;
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double xOrRho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double yOrTheta;

 
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP5(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    typeCoord = type;
  }
  public PointCP5(){}
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    if(typeCoord == 'C') 
      return xOrRho;
    else 
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY()
  {
    if(typeCoord == 'C') 
      return yOrTheta;
    else 
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho()
  {
    if(typeCoord == 'P') 
      return xOrRho;
    else 
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }
  
  public double getTheta()
  {
    if(typeCoord == 'P')
      return yOrTheta;
    else 
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar()
  {
    if(typeCoord != 'P')
    {
      //Calculate RHO and THETA
      double temp = getRho();
      yOrTheta = getTheta();
      xOrRho = temp;
      
      typeCoord = 'P';  //Change coord type identifier
    }
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
    if(typeCoord != 'C')
    {
      //Calculate X and Y
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
   
      typeCoord = 'C';	//Change coord type identifier
    }
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP pointB)
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
  public PointCP3 rotatePointPolar(double rotation)
  {
     PointCP3  pointToRotate = new PointCP3(getX(), getY()); 
    
        
    return  pointToRotate.rotatePoint(rotation); 
  }
  public PointCP2 rotatePointCartesian(double rotation)

  {
     PointCP2  pointToRotate = new PointCP2(getRho(), getRho()); 
    
        
    return  pointToRotate.rotatePoint(rotation); 
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as " + (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  }
}

    

