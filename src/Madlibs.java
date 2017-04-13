import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {
 
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river here's how to do it...");
		// Get the user to enter an adjective
String answer;
answer= 
	JOptionPane.showInputDialog("Enter Adjective Here");
		// Get the user to enter a type of liquid
String liquid;
liquid= JOptionPane.showInputDialog("Enter a Liquid Here");
		// Get the user to enter a body part
String body;
body= JOptionPane.showInputDialog("Enter a Body Part Here");
		// Get the user to enter a verb
String verb;
verb= JOptionPane.showInputDialog("Enter a Verb Here");
		// Get the user to enter a place
String place;
place = JOptionPane.showInputDialog("Enter a Place Here");
		
// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		  JOptionPane.showMessageDialog(null, "Piranhas are more"  +answer+
				  "during the day, so cross the river at night. Piranahs are attracted to fresh" 
				  +liquid+  "and will most likely take a bite out of your"  +body+ 
				  "if you"
				  +verb+ " Whatever you do, if you have an open wound, try to find another way to get back to the"
				  +place+ 
				  " Good Luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, "Great job! That was a funny stroy. I hope you enjoyed. Come back again.");

	}
}





