class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    int intTotalMinutes;
    int intDays;
    int intHours;
    int intMinutes;

    //Prompt the Viewer
    intTotalMinutes = readInt("Enter the total Minutes: ");

    //Calculations
    intDays = intTotalMinutes/1440;
    intHours = intTotalMinutes/60 - (intDays*24);
    intMinutes = (intTotalMinutes) - ((intDays*1440)+(intHours*60)); 
    
    //Output
    System.out.println("This is the time in days, hours, and minutes: " + intDays + " days, " + intHours + " hours, and " + intMinutes + " minutes");
    
  }
}