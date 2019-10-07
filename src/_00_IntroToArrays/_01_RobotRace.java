package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
Robot[] bots = new Robot[10];
//3. use a for loop to initialize the robots.
for (int i = 0; i < bots.length; i++) {
	bots[i]= new Robot();
	bots[i].moveTo(i * 90+50,550);
	bots[i].setSpeed(100);
			//4. make each robot start at the bottom of the screen, side by side, facing up
}	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	Random ran = new Random();
    	int winner = 0;
    	boolean raceRunning = true;
    	while (raceRunning) {
    		for (int i = 0; i < bots.length; i++) {
    			int r = ran.nextInt(50);
    			for(int j = 0; j < r; j++){
    				bots[i].move(1);
    				bots[i].turn(1);
    			}
    			
    			if (bots[i].getY()<0) {
					raceRunning = false;
					winner = i;
					System.out.println(i+1 + " wins the race!!!");
					
				}
    		}
		}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}
