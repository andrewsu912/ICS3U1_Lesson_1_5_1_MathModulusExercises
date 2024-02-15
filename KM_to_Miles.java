class KM_to_Miles extends ConsoleProgram {

    /**
  * Description
  * @author:
  */

  public void run(){

  // Declare Variables
  double dblKilometers;
  double dblMiles;

  //Prompt the Viewer
  dblKilometers = readDouble("Enter the distance in kilometers: ");

  //Calculations
  dblMiles = (dblKilometers*0.621371);

  //Output
  System.out.println("This is the distance in miles: " + dblMiles + " miles");
  }

 
}