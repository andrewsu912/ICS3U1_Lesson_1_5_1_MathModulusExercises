class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
  // Declare Variables
  double dblFahrenheit;
  double dblCelsius;

  //Prompt the Viewer
  dblFahrenheit = readDouble("Enter the temperature in fahrenheit: ");

  //Calculations
  dblCelsius = (5.0/9.0)*(dblFahrenheit - 32);

  //Output
  System.out.println("This is the temperature in Celsius: " + dblCelsius + " C");
    
  }
}