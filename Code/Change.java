import javax.swing.JOptionPane;

public class Change {

	public static void main(String[] args){

		String amountString = JOptionPane.showInputDialog(
		"Enter price of item (From 25 cents to a dollar,\n" +
		"in 5-cent increments):"); 
		
		int amount, Originalamount, Change, quarters, dimes, nickels;
		
		amount = Integer.parseInt(amountString);
		
		Originalamount = amount;
		
		Change = 100 - amount;
		
		quarters =  Change / 25;
		Change = Change % 25;
		
		dimes = Change / 10;
		Change = Change % 10;
		
		nickels = Change / 5;
		Change = Change % 5;
		
			if(Originalamount > 100)
				JOptionPane.showMessageDialog(null,
				"This machine only accepts dollar bills.");
			else 
				JOptionPane.showMessageDialog(null, 
				"You bought an item for " + Originalamount + " cents\n" +
				"and gave me a dollar, so your change is:\n" +
				quarters + " quarters\n" +
				dimes + " dimes, and\n" +
				nickels + " nickels."); 
		
System.exit(0);
	}}
