package Hello;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args)
	{
		String[] options = {"I do", "I don't"};
		int option = JOptionPane.showOptionDialog(null,
				"Do you want to change to the first class ticket?",
				"Choose an option",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]
				);
		
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);	
	}
}


