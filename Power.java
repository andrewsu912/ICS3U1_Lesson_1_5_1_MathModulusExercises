class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
  // Declare Variables
  double dblBaseA;
  double dblExponentB;
  double dblFinalAns;

  //Prompt the Viewer
  dblBaseA = readDouble("Enter the base of your number: ");
  dblExponentB = readDouble("Enter the exponent of your number: ");

  //Calculations
  dblFinalAns = Math.pow(dblBaseA, dblExponentB);

  //Output
  System.out.println("This is the final answer: " + dblFinalAns);
    
  }
}