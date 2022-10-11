import java.util.Scanner;

import java.util.*;

public class practice {

    public static String returnDaySwitch(int input) {

        switch(input) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";
            
            case 6:
                return "Saturday";

            case 7:
                return "Sunday";
            
            default:
                return "Invalid day of week.";

        
        }

    }

    public static String returnDayArray(int input){
        
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
        if(input > 7 || input < 0) {
            return("Invalid input.");
        }

        
        return(days[input - 1]);



    }

    public static void main(String[] args) {
       
        Scanner console = new Scanner(System.in);
       
       
        System.out.println(returnDaySwitch(15));

        System.out.println(returnDayArray(19));

        
    
    }

    
    

}