import javax.sound.midi.Soundbank;

public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(int seconds){ 
    // add your code here
        System.out.println("\n" + seconds * 10 + " decaseconds (A decasecond is 10 seconds");
     
    }
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(int seconds){
    // add your code here
        System.out.println("\n" + seconds * 100 + " jiffies (A jiffy is 10 milliseconds)");

    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(int seconds){
    // add your code here
        System.out.println("\n" + (float)seconds / 20 + " new york minutes (A new york minute is 1/20 of a second) ");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(int seconds){
    // add your code here
        System.out.println("\n" + (float)seconds * 3.156 + " nano centuries (A nano century is 3.156 seconds)");

    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    public void showScaramuccis(int seconds){
    // add your code here

        System.out.println("\n" + (float)seconds / 950400 + " scaramuccis (A scaramucci is 11 days)");

    }


    
}//end class