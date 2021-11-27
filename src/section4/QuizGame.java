package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int discount = 0;
		// 2.  Ask the user a question 
	String blackfri = JOptionPane.showInputDialog(null,"wat is dah meaning of life??????");
		// 3.  Use an if statement to check if their answer is correct
		if(blackfri.equals("free food")) { 
			JOptionPane.showMessageDialog(null,"corwect");
		// 4.  if the user's answer was correct, add one to their score 
	      discount += 1000000000;
	      }else { JOptionPane.showMessageDialog(null,"U lose");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		discount += 0;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"u scorwe is" +discount );
	}
}
