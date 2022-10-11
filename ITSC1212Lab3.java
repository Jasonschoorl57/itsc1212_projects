public class ITSC1212Lab3 {
    
    public static void main(String[] args){
        World w = new World(500,500);
        Turtle tom = new Turtle(100,250,w);

        tom.forward();
        //Moves tom forward 100 pixels 
        tom.turn(270);
        tom.penUp();
        //Turns tom so it faces left, then moves the pen up
        tom.forward(50);
        //Moves tom forward 50 pixels 
        tom.turn(180);
        tom.penDown();
        tom.forward();
        //Turns tom around so he faces right, puts the pen down, and draws 
        // a line 100 pixels long 
        tom.penUp();
        tom.forward(25);
        //Moves tom forward 100 pixels 
        tom.penDown();
        tom.forward(50);
        //Moves tom forward 50 pixels
        tom.turnRight();
        //Tom turns right 
        tom.forward();
        //Moves tom forward 100 pixels 
        tom.turnRight();
        tom.forward(50);
        //Moves tom forward 50 pixels 
        tom.turnRight();
        tom.forward();
        //The O in tom is now complete
        tom.penUp();
        tom.turnRight();
        tom.forward();
        //Could not figure out how to draw the M :(
       








    }
}
