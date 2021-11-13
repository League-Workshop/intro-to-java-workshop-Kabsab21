package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int owo = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(owo);
	// 4. Get the user to enter something that they think is awesome
String uwu = JOptionPane.showInputDialog(null,"Wat do ya think is awesome owo");
	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!
if(owo==0) {JOptionPane.showMessageDialog(null,"u cool");
	// 6. If the random number is 1
if(owo==1) {JOptionPane.showMessageDialog(null,"u ok");
	// -- tell the user whatever they entered is ok.
if(owo==2) {JOptionPane.showMessageDialog(null,"u boring");
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.
if(owo==3) {JOptionPane.showMessageDialog(null,"u ugly");
	// 8. If the random number is 3

	// -- write your own answer

} } } } } }


