package methodConstruction;

import javax.swing.JOptionPane;
public class page134 {


	public static void main(String[] args)
	{
		String valueString;
		char vType = '5';
		int value;
		double commRate = 0.08;
		
		valueString = JOptionPane.showInputDialog(null, "This is where I write something clever");
		value = Integer.parseInt(valueString);
		computeCommission(value, commRate, vType);
		computeCommission(4000, 0.10, 'L');
	}
	 public static void computeCommission(int value, double rate, char vehicle)
	{
		double commission;
		commission = value * rate;
		System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
		System.out.println("With " + (rate * 100) + "% commission rate, the commission is $" + commission); 
	}
}