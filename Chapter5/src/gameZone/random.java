/**
 * 
 */
package gameZone;
import java.util.Random;
import javax.swing.JOptionPane;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		final int LOW = 100;
		final int HIGH = 1000;
		String msg;
		int result = r.nextInt(100) + LOW;// result is the random number generator integer used. 
		int userGuess;
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		
		if(userGuess == result)
			msg = "\n Your Guess was RIGHT!";
			else 
				if(userGuess < result)
					msg = "\n Your Guess was too low";
				else 
					msg = "\n Your Guess was too high";
			JOptionPane.showMessageDialog(null, "The number is " + result + msg);
		
				

	}

}
