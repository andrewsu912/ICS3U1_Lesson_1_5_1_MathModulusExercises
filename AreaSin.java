class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
  // Declare Variables
  double dblSideA;
  double dblSideB;
  double dblAngleC;
  double dblArea;

  //Prompt the Viewer
  dblSideA = readDouble("Enter the length of Side A: ");
  dblSideB = readDouble("Enter the length of Side B: ");
  dblAngleC = readDouble("Enter angle of C: ");

  //Calculations
  dblArea = (dblSideA*dblSideB*Math.sin(Math.toRadians(dblAngleC)))/2;
  //Output
  System.out.println("This is the area of the triangle: " + dblArea + "m^2");
  }
}