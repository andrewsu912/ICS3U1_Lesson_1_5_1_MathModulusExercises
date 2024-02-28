class KM_to_Miles extends ConsoleProgram {

    /**
  * Description
  Dont forget description and author
  * @author:
  */

  public void run(){

  // Declare Variables
  double dblKilometers;
  double dblMiles;

  //Prompt the Viewer
  // Space after "//" for comments
  dblKilometers = readDouble("Enter the distance in kilometers: ");

  //Calculations
  dblMiles = (dblKilometers*0.621371); // Space between multiplication signs

  //Output
  System.out.println("This is the distance in miles: " + dblMiles + " miles");
  }

 
}