public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        }
        else{ 
            if (statement.indexOf("mother") >= 0) {
                response = "Tell me more about your mother.";
        } 
            if (statement.indexOf("Rahman") >= 0) {
                response = "Dr. Rahman is a good teacher.";
        }
            if (statement.trim().length() == 0) {
                response = "Say something.";
        }
            if (response.length() == 0) {
                response = getRandomResponse();
        }
            if (statement.indexOf("Im ready") >= 0) {
                response = "Let's leave now!";
        }
            if (statement.indexOf("Coffee") >= 0) {
                response = "I will take cream and sugar.";
        }
            if (statement.indexOf("Coding") >= 0) {
                response = "What is your favorite programming language?";
        }
    }
       return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4) {
            response = "Who is your bestfreind?";
        }
        if (whichResponse == 5) {
            response = "I love it!";
        }

        return response;
    }
}
