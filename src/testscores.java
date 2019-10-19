import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	
	String question = JOptionPane.showInputDialog("What is your test score? Please include a decimal.");
	double  testScore = Double.parseDouble(question);
	
	
	
	if (testScore > 90.0) {
		JOptionPane.showMessageDialog(null, "Wow, you must have studied really hard for that test!");
	} else {
		JOptionPane.showMessageDialog(null, "That's ok, study harder next time.");
		
	}
	
	
	
	
	
	
	
}
}

