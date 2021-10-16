package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
		Robot sasuke2 = new Robot();
		sasuke2.penDown();
		// Set the robot speed to 100
		sasuke2.setSpeed(100);
		// Set the robot window size (Doesn't work)
		
		//  COUNT. Make an int variable to count how many times the loop has repeated
		//         Set its start value to zero.
		int acc = 0;
	     //  LOOP. Start a while loop to repeat all of the code below ONE time (we will change this later)
		while(acc < 25) {
				sasuke2.setPenColor(113,238,184);
			   // TURN RIGHT     Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full circle)
				sasuke2.turn(45);
			   // MOVE           Move the robot 64 pixels
				sasuke2.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				sasuke2.turn(-40);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
				sasuke2.move(flameSize);
				//               Turn the robot 170 degrees
				sasuke2.turn(170);
				//               Move the robot the distance in the variable flameSize (again)
				sasuke2.move(flameSize);
				// TURN RIGHT     Turn the robot 64 degrees to the right
				sasuke2.turn(64);
				// MOVE         Move the robot the distance in the variable baseSize
				sasuke2.move(baseSize);
				//  INCREASE COUNT. Increase the count by 1
				acc++;
		//  End the while loop here
		}
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.
		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}

}


