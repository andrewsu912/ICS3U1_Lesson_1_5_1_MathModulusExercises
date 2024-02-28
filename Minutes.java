class Minutes extends ConsoleProgram {

  /**
  * Description
  Dont forget Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    int intTotalMinutes;
    int intDays;
    int intHours;
    int intMinutes; // Better variable name such as intLeftOverMinutes

    //Prompt the Viewer
    // Spaces after "//"
    intTotalMinutes = readInt("Enter the total Minutes: ");

    //Calculations
    intDays = intTotalMinutes/1440;
    intHours = intTotalMinutes/60 - (intDays*24);
    intMinutes = (intTotalMinutes) - ((intDays*1440)+(intHours*60)); 
    
    //Output
    System.out.println("This is the time in days, hours, and minutes: " + intDays + " days, " + intHours + " hours, and " + intMinutes + " minutes");
    
  }
}