class AreaSin extends ConsoleProgram {

  /**
  * Description 
  Add a description and dont forget author
  * @author:
  */
  
  public void run() {
    
  // Declare Variables
  double dblSideA;
  double dblSideB;
  double dblAngleC;
  double dblArea;

  //Prompt the Viewer 
  //More specific comment
  dblSideA = readDouble("Enter the length of Side A: ");
  dblSideB = readDouble("Enter the length of Side B: ");
  dblAngleC = readDouble("Enter angle of C: ");

  //Calculations
  dblArea = (dblSideA*dblSideB*Math.sin(Math.toRadians(dblAngleC)))/2;
  //Put a space here
  //Output
  System.out.println("This is the area of the triangle: " + dblArea + "m^2");
  }
}