package cs520.hw1.part1;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Demonetize {

	public static void main(String[] args) {
		
		// show the input dialog for 1000's notes
		String t = JOptionPane.showInputDialog("Enter # of old 1000's");
		
		// parse the string into integer
		Integer thousands = Integer.parseInt(t);
		
		// show the input dialog for 500's notes
		String s = JOptionPane.showInputDialog("Enter # of old 500's");
		
		// parse the string into integer 
		Integer fiveHundreds = Integer.parseInt(s);
		
		// calculate the total sum
		Integer total = thousands * 1000  + fiveHundreds * 500;
		
		// print the number of old 1000 and 500 notes
		System.out.println("Old 1000 notes = " + thousands + ", Old 500 notes = " + fiveHundreds);
		
		// print the conversion amount
		System.out.println("Requested Conversion Amount = " + total);	
		
		Integer newTwoThousands = 0;
		
		Integer newFiveHundreds = 0;
		
		Integer remainingAmount;
		
		Integer rem = total;
		
		// find the total 2000 notes 
		while (rem >= 2000) {
			newTwoThousands = newTwoThousands + 1;
			rem = rem - 2000;
		}
		
		// amount remaining after deducting notes for 2000
		remainingAmount = rem;
		
		// print the number of 2000 notes required and remaining amount
		System.out.println("New 2000 notes = " + newTwoThousands + ", Remaining Amount = " + remainingAmount);

		// calculate the notes required for 500
		while (remainingAmount >= 500) {
			newFiveHundreds = newFiveHundreds + 1;
			remainingAmount = remainingAmount - 500;
		}
		
		// print the total 500 notes required
		System.out.println("New 500 notes = " + newFiveHundreds);
		
		// initialize a JFrame object
		JFrame frame = new JFrame();
		
		// show the output in a message dialog box
        JOptionPane.showMessageDialog(frame.getContentPane(), String.format("Requested Amount %d, New 2000's (%d), New 500's (%d)",  total, newTwoThousands, newFiveHundreds));
		
	}

}
