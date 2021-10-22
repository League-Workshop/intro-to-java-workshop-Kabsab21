package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // Make a new Robot
Robot cringereeper  = new Robot();
        // Put the robot's pen down
cringereeper.penDown();

        // Make the robot move as fast as possible
cringereeper.setSpeed(199);

    	// COUNT. Create an int variable that will count how many sides of the shape we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		  /**     int sides = 0;    **/
    	int pumkin = 0;
    	
        // Start a while loop to repeat the MOVE, TURN, and COUNT code 4 times
while(pumkin<100) {
    	
        //         MOVE your robot 200 pixels
cringereeper.move(200);

        //         TURN the robot 90 degrees to the right
    	cringereeper.turn(90);
    	
    	//         COUNT. Add one to the number of sides the robot has drawn      sides+=1;
 pumkin++;
    	
    	// End the while loop here
}
    	// Run the program. You should see a square
    	
    	
    	// Now change the code to draw a different shape 
    	// e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)
   
    }
}
