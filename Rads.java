class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblDegree;
    double dblRadian;

    // Prompt the Viewer
    dblDegree = readDouble("Enter the degree: ");
    
    //Calculate
    dblRadian = Math.toRadians(dblDegree);

    //Output
    System.out.println("Here is your degree converted to radians: " + dblRadian);
  }
}