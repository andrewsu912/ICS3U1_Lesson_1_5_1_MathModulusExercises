class Circumference extends ConsoleProgram {

  /**
  * Description
  add a description and dont forget author
  * @author:
  */
  
  public void run() {
    
   // Declare variables
   double dblRadius;
   double dblCircumference;

   // Asks the user for the Radius
   dblRadius = readDouble("What is the radius? ");
   
   //Calculate
   dblCircumference = Math.PI*dblRadius*2; //Add spaces between multiplication values and it's sign

   //Print 
   // Add a space after the two lines for comments
   System.out.println("This is the circumference: " + dblCircumference);
    
  }
}