/**
 * 
 */
package decisionMaking;

import java.util.Scanner;

/**
 * @author KR131457
 *
 */
public class doorPrize 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int choice;
           Scanner input = new Scanner(System.in);
           choice = input.nextInt();
           
           //door number one comment line
           if(choice == 1);
           {
        	   System.out.println("A brand new car");
           }
           if(choice == 2);
           {
        	   System.out.println("A brand new huffy bike");
           }
           if(choice == 3 );
           {
        	   System.out.println("NOTHING YOU'RE A LOSER!");
           }
           //if choice is greater or equal to 4
           //print something to let the user know that there were only three doors
           
	}

}
