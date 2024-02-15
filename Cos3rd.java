class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    //Prompt the Viewer
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter angle of C: ");

    //Calculations
    dblSideC = Math.sqrt((Math.pow(dblSideA,2) + Math.pow(dblSideB,2)) - (2*dblSideA*dblSideB*Math.cos(Math.toRadians(dblAngleC))))3
    ;
    
    //Output
    System.out.println("This is the length of Side C: " + dblSideC);
    
  }
}