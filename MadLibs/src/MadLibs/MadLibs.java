package MadLibs;
import javax.swing.JOptionPane;
public class MadLibs {

	public static void main(String[] args) {
		
		   String color, wordEst, bodyPartPlural, animal, noun, pluralNoun, wholeNumber;
		      int a = 10, b, c;


	     color = JOptionPane.showInputDialog(null," What is your favorite color?");
	     
	     wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in est.");

	     bodyPartPlural = JOptionPane.showInputDialog(null, "Name a plural body part.");

	     animal =  JOptionPane.showInputDialog(null, "Name your favorite animal.");

	     noun =  JOptionPane.showInputDialog(null, "Pick a noun.");

	     pluralNoun = JOptionPane.showInputDialog(null, "Pick a plural noun.");

	     wholeNumber = JOptionPane.showInputDialog(null, "Give a \nwhole number less than 10.");

	     b= Integer.parseInt(wholeNumber);

	     c =  a - b;

	    JOptionPane.showMessageDialog(null, "The" + color + "Dog is the "+ wordEst + "Dog of all. It has " + c + " " + bodyPartPlural + " , and a "
	    + animal + "\nshaped like a " + noun + ". It loves to eat " +pluralNoun + ", \nalthough it will jump on almost everything.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
