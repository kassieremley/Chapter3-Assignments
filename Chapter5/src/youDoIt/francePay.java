package youDoIt;
import java.util.Scanner;
public class francePay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hoursWorked;
		double rate;
		double grossPay;
		double regularPay;
		double overtimePay;
		double netPay;
		double FULL_WEEK = 32;
		double OT_RATE = 2;
		double afterTax = 0;
		final double govGetHalf = .5;
		Scanner input = new Scanner(System.in);
		System.out.println("How many hours did you work? ");
		hoursWorked = input.nextDouble();
		System.out.println("What is your regular rate of pay? ");
		rate = input.nextDouble();
		
		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate; 
		}
		else 
		{
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
			afterTax = regularPay * govGetHalf;
			
		}
		System.out.println("Regualr pay is " +
		   regularPay + "/nOvertime pay is " + overtimePay + " After tax is " + afterTax); 

	}

}
