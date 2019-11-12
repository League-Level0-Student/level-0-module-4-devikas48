import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("Do you like to watch movies or read books more?");
	String question2 ="";
	String question3 ="";
	String question4 ="";
	String question5 ="";
	String question6 ="";
	String question7 ="";
	if (question.equals("watch movies")){
		question2 =  JOptionPane.showInputDialog("Do you like horror or comedy movies?"); 
	}
	if (question.equals("read books")) {
	    question3 = JOptionPane.showInputDialog("Do you like fiction or non-fiction boks?");
	}
	
	if (question2.equals("horror")) {
		question4 = JOptionPane.showInputDialog("If you have watched them do you like The Shining or IT better?");
	}
	
	if (question2.equals("comedy")) {
		question5 = JOptionPane.showInputDialog(" If you have watched them do you like Mean Girls or ");
	}
	
	if(question3.equals("fiction")) {
		question6 = JOptionPane.showInputDialog("If you have read them do you like Harry Potter or Percy Jackson better");
	}
	
	if(question3.equals("non-fiction")) {
		question7 = JOptionPane.showInputDialog("Do you like biographies or history books better?");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
