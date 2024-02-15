class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
   // Declare variables
   double dblRadius;
   double dblCircumference;

   // Asks the user for the Radius
   dblRadius = readDouble("What is the radius? ");
   
   //Calculate
   dblCircumference = Math.PI*dblRadius*2;

   //Print
   System.out.println("This is the circumference: " + dblCircumference);
    
  }
}