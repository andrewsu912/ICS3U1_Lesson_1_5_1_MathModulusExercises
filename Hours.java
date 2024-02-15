class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    int intTotalHours;
    int intDays;
    int intHours;

    //Prompt the Viewer
    intTotalHours = readInt("Enter the total hours: ");

    //Calculations
    intDays = intTotalHours/24;
    intHours = intTotalHours - (intDays*24);
    
    //Output
    System.out.println("This is the time in days and hours: " + intDays + " days and " + intHours + " hours");
    
  }
}